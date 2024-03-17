package Day2_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int pencilPackages = Integer.parseInt(scanner.nextLine());
                int markerPackages = Integer.parseInt(scanner.nextLine());
                int cleanerLitters = Integer.parseInt(scanner.nextLine());
                int discountPercent = Integer.parseInt(scanner.nextLine());
                double price = (pencilPackages * 5.80) + (markerPackages * 7.20) + (cleanerLitters * 1.20);
                double discountSum = price * (discountPercent/100.0);

                System.out.println(price - discountSum);
        }
}
