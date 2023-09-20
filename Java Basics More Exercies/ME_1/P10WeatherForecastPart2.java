package ME_1;

import java.util.Scanner;

public class P10WeatherForecastPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double degrees = Double.parseDouble(scanner.nextLine());

        if (degrees >= 26.0 && degrees <= 35.0){
            System.out.print("Hot");
        } else if (degrees >= 20.1 && degrees <= 25.9) {
            System.out.print("Warm");
        }else if (degrees >= 15.00 && degrees <= 20.00) {
            System.out.print("Mild");
        }
        else if (degrees >= 12.00  && degrees <= 14.9) {
            System.out.print("Cool");
        }
        else if (degrees >= 5.00 && degrees <= 11.9) {
            System.out.print("Cold");
        }else {
            System.out.print("unknown");
        }
    }
}
