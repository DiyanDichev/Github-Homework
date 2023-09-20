package Day11_Nested_Loops_Lab;

import java.util.Scanner;

public class P02MultiplicationTable {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++){

            for(int k = 1; k <= 10; k++)
                System.out.printf("%d * %d = %d\n", i, k , i*k );
        }


    }
}
