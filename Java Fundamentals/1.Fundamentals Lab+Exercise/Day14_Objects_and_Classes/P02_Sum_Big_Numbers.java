package Day14_Objects_and_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class P02_Sum_Big_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        BigInteger n1 = new BigInteger(scanner.nextLine());
        BigInteger n2 = new BigInteger(scanner.nextLine());

        System.out.println(n1.add(n2));
    }
}
