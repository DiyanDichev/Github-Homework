package Final_Exams.FinalExam_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Emoji_Detector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(?<specialSymbol>\\*\\*|::)(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> emojiData = new ArrayList<>();
        int coolThreshold = 1;
        int totalEmojis = 0;
        for (int i = 0; i < input.length(); i++) {
            boolean isDigit = Character.isDigit(input.charAt(i));
            if (isDigit) {
                coolThreshold *= Integer.parseInt(String.valueOf(input.charAt(i)));
            }
        }

        while (matcher.find()) {
            int asciiSum = 0;
            totalEmojis++;
            String specialSymbol = matcher.group("specialSymbol");
            String emoji = matcher.group("emoji");
            for (int i = 0; i < emoji.length(); i++) {
                asciiSum += emoji.charAt(i);
            }
            if(asciiSum >= coolThreshold){
                emojiData.add(specialSymbol + emoji + specialSymbol);
            }
        }
        System.out.printf("Cool threshold: %d\n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n",totalEmojis);
        emojiData.forEach(System.out::println);
    }
}
