package Day05_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P07_Condense_Array_to_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] temp = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            temp[i] = numbers[i];
        }

        for( int i = 0; i < numbers.length -1; i++){
            int[] current = new int[temp.length - 1];
            for (int j = 0; j <= current.length -1; j++){
                current[j] = temp[j] + temp[j + 1];
            }
            temp = current;
        }
        System.out.println(temp[0]);
    }
}
