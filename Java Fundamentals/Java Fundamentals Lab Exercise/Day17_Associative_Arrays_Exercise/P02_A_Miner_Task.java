package Day17_Associative_Arrays_Exercise;

import com.sun.jdi.Value;

import java.util.*;

public class P02_A_Miner_Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourcesData = new LinkedHashMap<>();

        String resource = scanner.nextLine();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (resourcesData.containsKey(resource)) {
                int currentQuantity = resourcesData.get(resource);
                resourcesData.put(resource, currentQuantity + quantity);
                resource = scanner.nextLine();
                continue;
            }

            resourcesData.put(resource, quantity);
            resource = scanner.nextLine();
        }
        resourcesData.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
