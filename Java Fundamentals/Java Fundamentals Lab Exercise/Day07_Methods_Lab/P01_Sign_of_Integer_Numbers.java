package Day07_Methods_Lab;

import java.util.Scanner;

public class P01_Sign_of_Integer_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        printSign(number);
    }

    public static void printSign(int number) {
        if (number == 0) {
            System.out.println("The number 0 is zero.");
        } else if (number == Math.abs(number)) {  // equal to (number > 0)
            System.out.printf("The number %d is positive.\n", number);
        }else {
            System.out.printf("The number %d is negative.\n", number);
        }
    }
}
