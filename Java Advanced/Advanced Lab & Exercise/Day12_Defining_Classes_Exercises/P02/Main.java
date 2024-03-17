package Day12_Defining_Classes_Exercises.P02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Department> departments = new HashMap<>();

        while (n-- > 0) {

            String[] tokens = scanner.nextLine().split("\\s+");
            String departmentName = tokens[3];
            Employee employee = null;

            switch (tokens.length) {
                case 4:
                    employee = new Employee(tokens[0], Double.parseDouble(tokens[1]));
                    break;
                case 5:
                    if (tokens[4].contains("@")) {
                        employee = new Employee(tokens[0], Double.parseDouble(tokens[1]), tokens[4]);
                    } else {
                        employee = new Employee(tokens[0], Double.parseDouble(tokens[1]), Integer.parseInt(tokens[4]));
                    }
                    break;
                default:
                    employee = new Employee(tokens[0], Double.parseDouble(tokens[1]), tokens[4]
                            , Integer.parseInt(tokens[5]));
            }

            if (!departments.containsKey(departmentName)) {
                departments.put(departmentName, new Department(departmentName));
            }
            departments.get(departmentName).getEmployees().add(employee);

        }

        departments.entrySet().stream().sorted((f, s) ->
                        Double.compare(s.getValue().getAverageSalary(), f.getValue().getAverageSalary()))
                .limit(1).
                forEach(e -> {
                    System.out.println(String.format("Highest Average Salary: %s", e.getKey()));
                    e.getValue().getEmployees().stream()
                            .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                            .forEach(employee -> System.out.println(employee.getInfo()));
                });

    }
}