package Day6_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P06OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        if (numTwo == 0 && (operator.equals("/") || operator.equals("%"))) {
            System.out.printf("Cannot divide %d by zero" , numOne);
            return;
        }

        double result = 0.00;
        String evenOrOdd = "";

        if(operator.equals("+")) {
            result = numOne + numTwo;
            if (result % 2 == 0){
                evenOrOdd = "even";
            }else {
                evenOrOdd = "odd";
            }
        } else if (operator.equals("-")) {
            result = numOne - numTwo;
            if (result % 2 == 0) {
                evenOrOdd = "even";
            }else {
                evenOrOdd = "odd";
            }
        } else if (operator.equals("*")) {
            result = numOne * numTwo;
            if (result % 2 == 0){
                evenOrOdd = "even";
            }else {
                evenOrOdd = "odd";
            }
        } else if (operator.equals("/")) {
            result = numOne * 1.0 / numTwo;
        } else if (operator.equals("%")) {
            result = numOne % numTwo;
        }
        if(operator.equals("+") || operator.equals("-") ||operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s" , numOne , operator , numTwo , result , evenOrOdd);
        } else if (operator.equals("/")) {
            System.out.printf("%d %s %d = %.2f" , numOne ,operator , numTwo , result);
        }else if (operator.equals("%")) {
            System.out.printf("%d %s %d = %.0f" , numOne , operator , numTwo , result);
        }
    }
}
