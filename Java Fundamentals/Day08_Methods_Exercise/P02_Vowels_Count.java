package Day08_Methods_Exercise;

import java.util.Scanner;

public class P02_Vowels_Count {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        printCountVowels(text);

    }
    public static void printCountVowels(String text){
        int count = 0;

        // решение с foreach
      //  for (char letter : text.toCharArray()) {
      //      if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
      //          count++;
      //      }
      //  }
      //  System.out.println(count);

        //решение с for loop
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.toCharArray()[i];
            if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
