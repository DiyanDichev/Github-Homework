package Day08_Methods_Exercise;

import java.util.Scanner;

public class P07_NxN_Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printNumber(n);
    }
    public static void printNumber (int number){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }

    }
}
