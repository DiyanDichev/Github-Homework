package Day03_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class P02_Pounds_to_Dollars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float gbp = Float.parseFloat(scanner.nextLine());

        double usd = gbp * 1.36;

        System.out.printf("%.3f", usd);
    }
}
