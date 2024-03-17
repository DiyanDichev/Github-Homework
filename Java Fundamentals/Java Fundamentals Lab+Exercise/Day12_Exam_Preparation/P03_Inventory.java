package Day12_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_Inventory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("Craft!")) {
            String action = command.split(" - ")[0];
            String item = command.split(" - ")[1];

            switch (action) {
                case "Collect":
                    if (inventory.contains(item)) {
                        break;
                    } else {
                        inventory.add(item);
                    }
                    break;
                case "Drop":
                    if (inventory.contains(item)) {
                        inventory.remove(item);
                    }
                    break;
                case "Combine Items":
                    String item1 = item.split(":")[0];
                    String item2 = item.split(":")[1];
                    if (inventory.contains(item1)) {
                        inventory.add(inventory.indexOf(item1) + 1, item2);
                    }
                    break;
                case "Renew":
                    if (inventory.contains(item)) {
                        inventory.remove(item);
                        inventory.add(item);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ",inventory));
    }
}
