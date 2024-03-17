package More_Exercise.ME7_Maps_Lambda_and_Stream_API_More_Exercise;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class P02_Judge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> contest = new LinkedHashMap<>();
        Map<String, Integer> totalScores = new LinkedHashMap<>();

        while (!input.equals("no more time")) {
            String[] lines = input.split(" -> ");
            String studentName = lines[0];
            String contestName = lines[1];
            int scores = Integer.parseInt(lines[2]);

            if (!contest.containsKey(contestName)) {
                contest.put(contestName, new LinkedHashMap<>());
                contest.get(contestName).put(studentName, scores);
                if (!totalScores.containsKey(studentName)) {
                    totalScores.put(studentName, scores);
                } else {
                    int newScores = totalScores.get(studentName) + scores;
                    totalScores.put(studentName, newScores);
                }
            } else {
                if (contest.get(contestName).containsKey(studentName)) {
                    if (contest.get(contestName).get(studentName) < scores) {
                        contest.get(contestName).put(studentName, scores);
                        totalScores.put(studentName, scores);
                    }
                } else {
                    contest.get(contestName).put(studentName, scores);
                    if (!totalScores.containsKey(studentName)) {
                        totalScores.put(studentName, scores);
                    } else {
                        int newScores = totalScores.get(studentName) + scores;
                        totalScores.put(studentName, newScores);
                    }
                }
            }
            input = scanner.nextLine();
        }
        AtomicInteger counter = new AtomicInteger(1);

        contest.entrySet().stream().forEach(e -> {
            counter.set(1);
            System.out.printf("%s: %d participants\n", e.getKey(), e.getValue().size());
            e.getValue().entrySet().stream().sorted((k2, k1) -> {
                int sort = Integer.compare(k1.getValue(), k2.getValue());
                if (sort == 0) {
                    sort = k2.getKey().compareTo(k1.getKey());
                }
                return sort;
            }).forEach(element -> {
                System.out.printf("%d. %s <::> %d\n", counter.getAndIncrement(), element.getKey(), element.getValue());
            });
        });
        counter.set(1);
        System.out.println("Individual standings:");
        totalScores.entrySet().stream().sorted((k2, k1) -> {
            int sort = Integer.compare(k1.getValue(), k2.getValue());
            if (sort == 0) {
                sort = k2.getKey().compareTo(k1.getKey());
            }
            return sort;
        }).forEach(e -> {
            System.out.printf("%d. %s -> %d\n", counter.getAndIncrement(), e.getKey(), e.getValue());
        });
    }
}