package Day07_Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P05_Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String orderType = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        calculation(orderType,quantity);


    }

    public static void calculation(String orderType, double quantity) {

        double totalPrice = 0;
        switch (orderType) {
            case "coffee":
                totalPrice = 1.50 * quantity;
                break;
            case "water":
                totalPrice = 1.00 * quantity;
                break;
            case "coke":
                totalPrice = 1.40 * quantity;
                break;
            case "snacks":
                totalPrice = 2.00 * quantity;
                break;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
