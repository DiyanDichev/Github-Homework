package ME_1;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = (celsius * 9/5)+  32.00;

        System.out.printf("%.2f" ,fahrenheit);

    }
}
