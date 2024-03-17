package Day17_Associative_Arrays_Exercise;

import java.util.*;

public class P05_Courses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> course = new LinkedHashMap<>();

        while (!input.equals("end")){
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (course.containsKey(courseName)) {
                List<String> currentEmployees = course.get(courseName);
                if (!currentEmployees.contains(studentName)) {
                    currentEmployees.add(studentName);
                }
            } else {
                course.put(courseName, new ArrayList<>());
                course.get(courseName).add(studentName);
            }
            input = scanner.nextLine();
        }
        course.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + ": " + entry.getValue().size());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));
        });
    }
}
