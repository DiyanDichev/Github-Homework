package More_Exercise.ME1_Basic_Syntax_Conditional_Statements_and_Loops_More_Exercise;

import java.util.Scanner;

public class P05_Messages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wordLength = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();


        for (int i = 0; i < wordLength; i++) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 2) {
                text.append("a");
            }
            if (input == 22) {
                text.append("b");
            }
            if (input == 222) {
                text.append("c");
            }
            if (input == 3) {
                text.append("d");
            }
            if (input == 33) {
                text.append("e");
            }
            if (input == 333) {
                text.append("f");
            }
            if (input == 4) {
                text.append("g");
            }
            if (input == 44) {
                text.append("h");
            }
            if (input == 444) {
                text.append("i");
            }
            if (input == 5) {
                text.append("j");
            }
            if (input == 55) {
                text.append("k");
            }
            if (input == 555) {
                text.append("l");
            }
            if (input == 6) {
                text.append("m");
            }
            if (input == 66) {
                text.append("n");
            }
            if (input == 666) {
                text.append("o");
            }
            if (input == 7) {
                text.append("p");
            }
            if (input == 77) {
                text.append("q");
            }
            if (input == 777) {
                text.append("r");
            }
            if (input == 7777) {
                text.append("s");
            }
            if (input == 8) {
                text.append("t");
            }
            if (input == 88) {
                text.append("u");
            }
            if (input == 888) {
                text.append("v");
            }
            if (input == 9) {
                text.append("w");
            }
            if (input == 99) {
                text.append("x");
            }
            if (input == 999) {
                text.append("y");
            }
            if (input == 9999) {
                text.append("z");
            }
            if (input == 0) {
                text.append(" ");
            }
        }
        System.out.println(text);
    }
}