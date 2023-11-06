package Day06_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05_Top_Integers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for(int i = 0; i < numbers.length - 1; i++){
            int currentNumber = numbers[i];

            int bigger = 0;

            for (int j = i + 1; j <= numbers.length - 1; j++){
                int numberAfter = numbers[j];
                if( currentNumber >= numberAfter){
                    bigger = currentNumber;
                    break;
                }
                if(bigger == 0){
                    break;
                }
            }
            if(bigger > 0) {
                System.out.print(bigger + " ");
                bigger = 0;
            }
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}
