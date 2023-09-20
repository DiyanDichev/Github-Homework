package Day6_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int totalSeats = rows * cols;
        double totalincome = 0.00;

        switch (typeOfProjection) {
            case "Premiere":
                totalincome = totalSeats * 12.00;
                break;
            case "Normal":
                totalincome = totalSeats * 7.50;
                break;
            case "Discount":
                totalincome = totalSeats * 5.00;
                break;
        }
        System.out.printf("%.2f leva" , totalincome);
    }
}
