package Day17_Associative_Arrays_Exercise;

import java.util.*;

public class P08_Company_Users {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String employeeID = input.split(" -> ")[1];

            if (companyEmployees.containsKey(companyName)) {
                List<String> currentEmployees = companyEmployees.get(companyName);
                if (!currentEmployees.contains(employeeID)) {
                    currentEmployees.add(employeeID);
                }
            } else {
                companyEmployees.put(companyName, new ArrayList<>());
                companyEmployees.get(companyName).add(employeeID);
            }
            input = scanner.nextLine();
        }

        companyEmployees.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(employee -> System.out.println("-- " + employee));
        });
    }
}
