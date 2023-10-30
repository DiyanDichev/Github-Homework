package Day05_Arrays_Lab;

import java.util.Scanner;

public class P04_Reverse_Array_of_Strings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(" ");
        String[] reversed = new String[elements.length];

        int reversedIndex = 0;

        for (int i = elements.length -1; i >= 0; i--){
            reversed[reversedIndex] = elements[i];
            reversedIndex++;
        }
        System.out.println(String.join(" ",reversed));
    }
}
