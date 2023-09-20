package PB_Exams_1;

import java.util.Scanner;

public class dsad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String word = "";
        int maxSum = Integer.MIN_VALUE;

        while (!command.equals("End of words")) {
            int currentSum = 0;

            boolean check = false;
            for (int i = 0; i < command.length(); i++) {
                char current = command.charAt(i);
                currentSum += current;
                boolean isVowel = current == 'a' || current == 'o' || current == 'e' || current == 'i' || current == 'u' || current == 'y' || current == 'A' || current == 'O' || current == 'E' || current == 'I' || current == 'U' || current == 'Y';
                if (i == 0 && isVowel) {
                    check = true;
                }
            }
            if (check) {
                currentSum *=command.length();
            } else {
                currentSum /=command.length();
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                word = command;
            }
            command = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", word, maxSum);
    }
}
