package Day18_Text_Processing_Lab;

import java.util.Scanner;

public class P01_Reverse_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String word = scanner.nextLine();
            if(word.equals("end")){
                break;
            }

            String reversedWord = reversedWord(word);

            System.out.printf("%s = %s%n", word, reversedWord);
        }
    }

    private static String reversedWord(String word){
        char[] reversedResult = new char[word.length()];

        int reversedResultInx = 0;
        for (int i = word.length()-1; i >= 0 ; i--) {
            char currentChar = word.charAt(i);
            reversedResult[reversedResultInx] = currentChar;
            reversedResultInx += 1;
        }
        return new String(reversedResult);
    }
}