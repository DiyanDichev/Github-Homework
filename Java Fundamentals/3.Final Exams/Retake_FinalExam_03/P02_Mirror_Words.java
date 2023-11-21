package Final_Exams.Retake_FinalExam_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Mirror_Words {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(@|#)(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 0;

        List<String> mirrorWords = new ArrayList<>();
        while (matcher.find()) {
            count++;
            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            String reverserSecondWord = "";
            for (int i = secondWord.length() - 1; i >= 0; i--) {
                String letter = String.valueOf(secondWord.charAt(i));
                reverserSecondWord += letter;
            }
            if (firstWord.equals(reverserSecondWord)) {
                mirrorWords.add(firstWord + " <=> " + secondWord);
            }
        }
        if (count > 0) {
            System.out.printf("%d word pairs found!\n", count);
        } else {
            System.out.println("No word pairs found!");
        }
        if (mirrorWords.size() > 0) {
            System.out.println("The mirror words are:");
        } else {
            System.out.println("No mirror words!");
        }
        System.out.println(String.join(", ", mirrorWords));
    }
}
