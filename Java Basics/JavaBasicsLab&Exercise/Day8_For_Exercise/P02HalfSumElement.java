package Day8_For_Exercise;

import java.util.Scanner;

public class P02HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n =  Integer.parseInt(scanner.nextLine());


        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++){
            int currentNumber =  Integer.parseInt(scanner.nextLine());
            sum += currentNumber;

                if (currentNumber > maxNumber){
                    maxNumber = currentNumber;
                }
        }
        if (maxNumber == sum - maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNumber);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNumber - (sum - maxNumber)));
        }
    }
}
