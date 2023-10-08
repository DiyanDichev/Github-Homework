package Day6_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07_Max_Sequence_of_Equal_Elements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int maxLength = 0;
        int length = 1;

        int startIndex = 0;
        int bestStart = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = i;
            }

            if(length > maxLength) {
                maxLength = length;
                bestStart = startIndex;
            }
        }

        for (int i = bestStart; i < bestStart + maxLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}