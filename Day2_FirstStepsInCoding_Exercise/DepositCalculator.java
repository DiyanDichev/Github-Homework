package Day2_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositAmount = Double.parseDouble(scanner.nextLine());
        int depositPeriod = Integer.parseInt(scanner.nextLine());
        double depositPercent = Double.parseDouble(scanner.nextLine());
        double sum = depositAmount + depositPeriod * ((depositAmount * depositPercent/100) / 12) ;
        System.out.println(sum);
    }
}
