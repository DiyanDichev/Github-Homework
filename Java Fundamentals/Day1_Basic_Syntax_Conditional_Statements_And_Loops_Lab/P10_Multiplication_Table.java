package Day1_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P10_Multiplication_Table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for(int i=1; i <=10; i++){
            int number2 = number * i;
            System.out.printf("%d X %d = %d\n",number, i, number2);
        }
    }
}
