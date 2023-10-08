package Day3_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class P10_Special_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++){
            int number = i;
            int sum = 0;
            while (number > 0){
                int lastDigit = number % 10;
                sum += lastDigit;

                number /= 10;
            }
            boolean isSpecial = sum == 5 || sum == 7 || sum == 11;
            if (isSpecial){
                System.out.printf("%d -> %s\n", i, "True");
            }else {
                System.out.printf("%d -> %s\n", i, "False");
            }

        }
    }
}
