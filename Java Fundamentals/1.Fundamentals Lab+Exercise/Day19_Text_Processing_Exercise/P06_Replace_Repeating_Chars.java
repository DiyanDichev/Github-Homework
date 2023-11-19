package Day19_Text_Processing_Exercise;

import java.util.Scanner;

public class P06_Replace_Repeating_Chars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String empty = "";
        for (int i = 0; i < input.length(); i++) {
            String currentLetter = String.valueOf(input.charAt(i));
            if (!currentLetter.equals(empty)) {
                System.out.print(currentLetter);
                empty = currentLetter;
            }
        }
    }
}
