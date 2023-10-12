package Day09_List_Lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06_List_of_Products {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int iterations = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < iterations; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s\n", i + 1, products.get(i));
        }
    }
}
