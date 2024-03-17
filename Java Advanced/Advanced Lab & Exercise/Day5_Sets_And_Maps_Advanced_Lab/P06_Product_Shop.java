package Day5_Sets_And_Maps_Advanced_Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06_Product_Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Double>> shops = new TreeMap<>();
        String command = scanner.nextLine();
        while (!command.equals("Revision")) {
            String[] commandParts = command.split(", ");
            String shop = commandParts[0];
            String product = commandParts[1];
            double price = Double.parseDouble(commandParts[2]);
            if (shops.containsKey(shop)) {
                shops.get(shop).put(product, price);
            } else {
                Map<String, Double> products = new LinkedHashMap<>();
                products.put(product, price);
                shops.put(shop, products);
            }
            command = scanner.nextLine();
        }
        shops.entrySet().forEach(entry -> {
            System.out.printf("%s->%n", entry.getKey());
            entry.getValue().entrySet().forEach(entry2 -> {
                System.out.printf("Product: %s, Price: %.1f%n", entry2.getKey(), entry2.getValue());
            });
        });
    }
}