package Day17_Associative_Arrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> productsQuantity = new LinkedHashMap<>();
        Map<String, Double> productsPrice = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if(!productsQuantity.containsKey(name)){
                productsQuantity.put(name,quantity);
            }else {
                int currentQuantity = productsQuantity.get(name);
                productsQuantity.put(name, currentQuantity + quantity);
            }
            productsPrice.put(name,price);

            input = scanner.nextLine();
        }
        for(Map.Entry<String, Integer> entry : productsQuantity.entrySet()){
            String product = entry.getKey();
            double sum = productsQuantity.get(product) * productsPrice.get(product);
            System.out.printf("%s -> %.2f\n", product, sum);
        }
    }
}
