package Day07_Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_Math_Operations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());

        double result = 0.0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        System.out.printf("%.0f",result);
    }
}
