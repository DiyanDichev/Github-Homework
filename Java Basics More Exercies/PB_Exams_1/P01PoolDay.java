package PB_Exams_1;

import java.util.Scanner;

public class P01PoolDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double sunLounger = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());

       double peopleTicketPrice = peopleCount * ticketPrice;
       double umbrellaPrice = umbrella * Math.ceil(peopleCount * 0.5);
       double sunLoungerPrice =sunLounger * Math.ceil(peopleCount * 0.75);

       double totalPrice = peopleTicketPrice + umbrellaPrice +sunLoungerPrice;

        System.out.printf("%.2f lv." , totalPrice);
    }
}
