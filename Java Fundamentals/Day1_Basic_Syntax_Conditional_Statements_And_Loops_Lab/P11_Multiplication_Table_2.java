package Day1_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P11_Multiplication_Table_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());

        if (n2>10){
            System.out.printf("%d X %d = %d",n, n2 , n * n2);
            return;
        }

        for(int i=n2; i <=10; i++){
            int multiplier = n * i;
            System.out.printf("%d X %d = %d\n",n, i, multiplier);
        }
    }
}
