package Day19_Text_Processing_Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class P05_Multiply_Big_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());


        System.out.println(firstNumber.multiply(secondNumber));
    }
}
