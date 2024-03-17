package More_Exercise.ME3_Arrays_More_Exercise;


import java.util.Arrays;
import java.util.Scanner;

public class P01_Encrypt_Sort_and_Print_Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);

                if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u'
                        || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U'){
                    array[i] += currentChar * input.length();
                }else {
                    array[i] += currentChar / input.length();
                }
            }
        }
        Arrays.sort(array);

        for (int number : array) {
            System.out.println(number);
        }
    }
}

