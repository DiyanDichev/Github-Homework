package Day04_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class P01_Integer_Operations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        int number4 = Integer.parseInt(scanner.nextLine());

        int n1 = number1 + number2;
        int n2 = n1 / number3;
        int n3 = n2 * number4;

        System.out.println(n3);
    }
}
