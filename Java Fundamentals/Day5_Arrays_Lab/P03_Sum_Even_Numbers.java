package Day5_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P03_Sum_Even_Numbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;

        for (int number : numbers){
            if(number % 2 == 0){
                evenSum += number;
            }
        }
        System.out.println(evenSum);
    }
}
