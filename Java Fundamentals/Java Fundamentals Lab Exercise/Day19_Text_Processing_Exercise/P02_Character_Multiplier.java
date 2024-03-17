package Day19_Text_Processing_Exercise;

import java.util.Scanner;

public class P02_Character_Multiplier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");

        String firstText = text[0];
        String secondText = text[1];

        printSumChars(firstText,secondText);
    }
    public static void printSumChars(String firstText, String secondText){
        int maxLength = Math.max(firstText.length(), secondText.length());
        int minLength = Math.min(firstText.length(), secondText.length());

        int sum = 0;
        for (int i = 0; i < minLength; i++) {
            sum += firstText.charAt(i) * secondText.charAt(i);
        }

        if(firstText.length() != secondText.length()){
            for (int i = minLength; i < maxLength; i++) {
                if (firstText.length() == maxLength) {
                    sum += firstText.charAt(i);
                } else {
                    sum += secondText.charAt(i);
                }
            }
        }
        System.out.println(sum);
    }
}
