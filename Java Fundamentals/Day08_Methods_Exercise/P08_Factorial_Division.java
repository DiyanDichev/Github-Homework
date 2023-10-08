package Day08_Methods_Exercise;

import java.util.Scanner;

public class P08_Factorial_Division {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long factFirstNumber = calculation(firstNumber);
        long factSecondNumber = calculation(secondNumber);

        double sum = factFirstNumber * 1.0 / factSecondNumber;

        System.out.printf("%.2f", sum);

    }
    public static long calculation (int number){
        long fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
