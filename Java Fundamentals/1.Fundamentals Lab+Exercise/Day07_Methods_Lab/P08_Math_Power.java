package Day07_Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08_Math_Power {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        DecimalFormat result = new DecimalFormat("0,####");
        System.out.println(result.format(pow(number, power)));
    }
    public static double pow(double number, double power){
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }
}
