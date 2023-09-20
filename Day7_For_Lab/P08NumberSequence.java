package Day7_For_Lab;

import java.util.Scanner;

public class P08NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int numMax = Integer.MIN_VALUE;
        int numMin = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (numMax < number) {
                numMax = number;
            }
            if (numMin > number) {
                numMin = number;
            }
        }
        System.out.printf("Max number: %d%n" , numMax);
        System.out.printf("Min number: %d" , numMin);
    }
}

