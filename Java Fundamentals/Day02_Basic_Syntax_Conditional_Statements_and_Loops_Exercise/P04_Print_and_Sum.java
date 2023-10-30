package Day02_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class P04_Print_and_Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startN = Integer.parseInt(scanner.nextLine());
        int endN = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = startN; i <= endN; i++){
            sum += i;
            System.out.printf("%d ", i);
        }
        System.out.printf("\nSum: %d",sum);
    }
}
