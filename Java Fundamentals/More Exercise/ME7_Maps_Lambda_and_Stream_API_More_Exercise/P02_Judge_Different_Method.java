package More_Exercise.ME7_Maps_Lambda_and_Stream_API_More_Exercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class P02_Judge_Different_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> contest = new LinkedHashMap<>();

        while (!input.equals("no more time")) {
            String[] lines = input.split(" -> ");
            String studentName = lines[0];
            String contestName = lines[1];
            int scores = Integer.parseInt(lines[2]);

            if (!contest.containsKey(contestName)) {
                contest.put(contestName, new LinkedHashMap<>());
                contest.get(contestName).put(studentName, scores);
            } else {
                if (contest.get(contestName).containsKey(studentName)) {
                    if (contest.get(contestName).get(studentName) < scores) {
                        contest.get(contestName).put(studentName, scores);
                    }
                } else {
                    contest.get(contestName).put(studentName, scores);
                }
            }

            input = scanner.nextLine();
        }
        AtomicInteger num = new AtomicInteger(1);

        contest.entrySet().stream().forEach(e -> {
            num.set(1);
            System.out.printf("%s: %d participants\n", e.getKey(), e.getValue().size());
            e.getValue().entrySet().stream().sorted((k2, k1) -> {
                int sort = Integer.compare(k1.getValue(), k2.getValue());
                if (sort == 0) {
                    sort = k2.getKey().compareTo(k1.getKey());
                }
                return sort;
            }).forEach(element -> {
                System.out.printf("%d. %s <::> %d\n", num.getAndIncrement(), element.getKey(), element.getValue());
            });
        });

        Map<String, Integer> totalScores = new LinkedHashMap<>();

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : contest.entrySet()) {
            for (Map.Entry<String, Integer> kvp : entry.getValue().entrySet()) {
                totalScores.putIfAbsent(kvp.getKey(), 0);
                totalScores.put(kvp.getKey(), totalScores.get(kvp.getKey()) + kvp.getValue());
            }
        }
        System.out.println("Individual standings:");
        num.set(1);

        totalScores.entrySet().stream().sorted((k2, k1) -> {
            int sort = Integer.compare(k1.getValue(), k2.getValue());
            if (sort == 0) {
                sort = k2.getKey().compareTo(k1.getKey());
            }
            return sort;

        }).forEach(e -> {
            System.out.printf("%d. %s -> %d\n", num.getAndIncrement(), e.getKey(), e.getValue());
        });
    }
}
