package Day2_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class P06_Strong_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;

        int sumFact = 0;
        while (number > 0){
            int lastDigit = number % 10;

            int fact = 1;
            for (int i = 1; i <= lastDigit; i++){
                fact = fact * i;
            }
            sumFact += fact;
            number /=10;
        }

        if(sumFact == startNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
