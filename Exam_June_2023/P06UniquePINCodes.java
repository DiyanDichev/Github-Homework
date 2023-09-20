package Exam_June_2023;

import java.util.Scanner;

public class P06UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input1 = Integer.parseInt(scanner.nextLine());
        int input2 = Integer.parseInt(scanner.nextLine());
        int input3 = Integer.parseInt(scanner.nextLine());

        for (int num1 = 2; num1 <= input1; num1 += 2) {
            for (int num2 = 2; num2 <= input2; num2++) {
                for (int num3 = 2; num3 <= input3; num3 += 2) {
                    if (num2 != 4 && num2 != 6 && num2 > 1 && num2 < 8) {
                        System.out.printf("%d %d %d%n", num1, num2, num3);
                    }
                }
            }
        }
    }
}