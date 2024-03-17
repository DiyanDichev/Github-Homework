package ME_3;

import java.util.Scanner;

public class P10MultiplyBy2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0.00;

        for ( int number = 0; number >= 0; number++){
            double value = Double.parseDouble(scanner.nextLine());
            if (value < 0) {
                System.out.print("Negative number!");
                return;
            }
            sum = value * 2;
            System.out.printf("Result: %.2f\n" , sum);
        }
    }
}
