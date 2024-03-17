package Day08_Methods_Exercise;

import java.util.Scanner;

public class P10_Top_Integer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number < n; number++) {

            boolean isValidSumDigits = checkSumDigitsDivisibleBy8(number);
            boolean isContainOddDigits = checkContainsOddDigit(number);

            if(isValidSumDigits && isContainOddDigits){
                System.out.println(number);
            }
        }
    }
    public static boolean checkSumDigitsDivisibleBy8(int number){
        int sum = 0;
        while (number > 0){
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        if(sum % 8 == 0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean checkContainsOddDigit (int number){
        while (number > 0){
            int lastDigit = number % 10;
            if(lastDigit % 2 != 0){
                return true;
            }else {
                number /= 10;
            }
        }
        return false;
    }
}
