package Day6_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String mathOperation = scanner.nextLine();

        double sum = 0.00;

        switch (mathOperation) {
            case "+" :
                sum = N1 + N2;
                if (sum % 2 == 0) {
                    System.out.printf("%d + %d = %.0f - even", N1, N2, sum);
                } else {
                    System.out.printf("%d + %d = %.0f - odd", N1, N2, sum);
                }
            break;
            case "-":
                sum = N1 - N2;
                if (sum % 2 == 0) {
                    System.out.printf("%d - %d = %.0f - even", N1, N2, sum);
                } else {
                    System.out.printf("%d - %d = %.0f - odd", N1, N2, sum);
                }
            break;
            case "*" :
                sum = N1 * N2;
                if (sum % 2 == 0) {
                    System.out.printf("%d * %d = %.0f - even", N1, N2, sum);
                } else {
                    System.out.printf("%d * %d = %.0f - odd", N1, N2, sum);
                }
            break;
            case "/" :
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    sum = N1 * 1.0 / N2;
                    System.out.printf("%d / %d = %.2f", N1, N2, sum);
                }
            default:
            case "%":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    sum = N1 % N2;
                    System.out.printf("%d %% %d = %.0f", N1, N2, sum);
                }
            break;
        }
    }
}