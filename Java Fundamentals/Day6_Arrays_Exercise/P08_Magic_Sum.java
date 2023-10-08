package Day6_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P08_Magic_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            for(int i = index +1; i <= numbers.length - 1; i++){
                int nextNumber = numbers[i];
                if(currentNumber + nextNumber == magicSum){
                    System.out.println(currentNumber + " " + nextNumber);
                }
            }
        }
    }
}
