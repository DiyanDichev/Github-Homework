package Day18_Text_Processing_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02_Repeat_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        List<String> repeatedWords = new ArrayList<>();

        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                repeatedWords.add(word);
            }
        }
        System.out.println(String.join("", repeatedWords));
    }
}
