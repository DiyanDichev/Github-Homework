package ME_5_WhileLoopMoreExercises;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double numberSum = 0.00;

        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(scanner.nextLine());

            numberSum += number;
        }
        System.out.printf("%.2f", numberSum / n);
    }
}
