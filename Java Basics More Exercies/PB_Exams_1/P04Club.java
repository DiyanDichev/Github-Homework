package PB_Exams_1;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double targetSum = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double sum = 0;
        double currentSum;

        while (!input.equals("Party!")){
            int cocktails = Integer.parseInt(scanner.nextLine());
            double price = input.length();

            currentSum = price * cocktails;

            if (currentSum % 2 == 0) {
                sum += price * cocktails;
            }else {
                sum += price * cocktails * 0.75;
            }
            if ( sum >= targetSum){
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f leva.", sum);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("We need %.2f leva more.\n", targetSum - sum);
        System.out.printf("Club income - %.2f leva.", sum);
    }
}
