package Day1_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P12_Even_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while(n % 2 != 0){

            System.out.println("Please write an even number.");
            n = Integer.parseInt(scanner.nextLine());
        }
        if(n > 0) {
            System.out.printf("The number is: %d", n);
        }else{
            System.out.printf("The number is: %d", Math.abs(n));
        }
    }
}
