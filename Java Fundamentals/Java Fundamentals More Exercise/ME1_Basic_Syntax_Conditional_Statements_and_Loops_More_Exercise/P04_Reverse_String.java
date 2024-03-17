package More_Exercise.ME1_Basic_Syntax_Conditional_Statements_and_Loops_More_Exercise;

import java.util.Scanner;

public class P04_Reverse_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char currentLetter;
        String reverse = "";

        for(int i = 0; i < input.length() ; i++){

            currentLetter = input.charAt(i);
            reverse = currentLetter + reverse;
        }
        System.out.print(reverse);
    }
}
