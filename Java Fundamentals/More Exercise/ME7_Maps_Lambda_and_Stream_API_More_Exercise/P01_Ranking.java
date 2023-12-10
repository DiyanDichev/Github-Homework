package More_Exercise.ME7_Maps_Lambda_and_Stream_API_More_Exercise;

import java.util.*;

public class P01_Ranking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> contestData = new LinkedHashMap<>();
        Map<String, LinkedHashMap<String, Integer>> userData = new TreeMap<>();

        String[]input = scanner.nextLine().split(":");
        while (!input[0].equals("end of contests")){
            String contest = input[0];
            String password = input[1];
            contestData.put(contest, password);
            input = scanner.nextLine().split(":");
        }
        String[] inputSubmission = scanner.nextLine().split("=>");
        while (!inputSubmission[0].equals("end of submissions")){
            String contest = inputSubmission[0];
            String password = inputSubmission[1];
            String userName = inputSubmission[2];
            int scores = Integer.parseInt(inputSubmission[3]);
            if(contestData.containsKey(contest) && contestData.get(contest).equals(password)){

                LinkedHashMap<String, Integer> course = new LinkedHashMap<>();
                course.put(contest,scores);

                if(!userData.containsKey(userName)){
                    userData.put(userName,course);
                }else {
                    if(!userData.get(userName).containsKey(contest)){
                        userData.get(userName).put(contest,scores);
                    }else {
                        userData.get(userName).put(contest,Math.max(scores,userData.get(userName).get(contest)));
                    }
                }
            }

            inputSubmission = scanner.nextLine().split("=>");
        }
        int totalSum = 0;
        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : userData.entrySet()) {
            int sum = user.getValue().values().stream().mapToInt(i -> i).sum();
            if (sum > totalSum) {
                totalSum = sum;
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> user : userData.entrySet()) {
            if (user.getValue().values().stream().mapToInt(i -> i).sum() == totalSum) {
                System.out.printf("Best candidate is %s with total %d points.%n", user.getKey(), totalSum);
            }
        }

        System.out.println("Ranking:");
        userData.forEach((key, value) -> {
            System.out.printf("%s%n", key);
            value.entrySet().stream().
                    sorted((f, s) -> s.getValue() - f.getValue()).
                    forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
        });
    }
}
