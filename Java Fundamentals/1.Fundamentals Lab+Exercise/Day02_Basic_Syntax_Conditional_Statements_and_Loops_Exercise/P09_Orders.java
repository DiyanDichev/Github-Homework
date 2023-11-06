package Day02_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class P09_Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ordersCount = Integer.parseInt(scanner.nextLine());
        double totalOrderSum = 0;
        double totalSum = 0;

        for(int i = 1; i <= ordersCount; i++){
            double price = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int coffeesCount = Integer.parseInt(scanner.nextLine());
            totalOrderSum = price * days * coffeesCount;
            totalSum += totalOrderSum;

            System.out.printf("The price for the coffee is: $%.2f\n",totalOrderSum);
        }
        System.out.printf("Total: $%.2f",totalSum);
    }
}
