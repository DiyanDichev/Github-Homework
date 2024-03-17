package Day5_Sets_And_Maps_Advanced_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P08_Academy_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> students = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());
            students.put(name, grades);
        }
        students.entrySet().forEach(entry -> {
            double grades = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                grades += entry.getValue().get(i);
            }
            double averageGrade = grades / entry.getValue().size();
            System.out.printf("%s is graduated with %s%n", entry.getKey(), averageGrade);
        });
    }
}