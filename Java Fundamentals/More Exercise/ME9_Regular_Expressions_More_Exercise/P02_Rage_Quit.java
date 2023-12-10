package More_Exercise.ME9_Regular_Expressions_More_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Rage_Quit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(?<word>\\D+)(?<digit>[\\d+]*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder rageMessage = new StringBuilder();
        while (matcher.find()){
            String word = matcher.group("word").toUpperCase();
            char last = input.charAt(input.length() - 1);
            String[] array = new String[]{matcher.group("word")};
            String[] array2 = new String[]{matcher.group("digit")};
            if(array.length == array2.length){
                for (int i = 0; i < Integer.parseInt(matcher.group("digit")); i++) {
                    rageMessage.append(word);
                }
            } else if (array.length > array2.length) {

            }
        }
        System.out.printf("Unique symbols used: %d\n%s", rageMessage.chars().distinct().count(), rageMessage);
    }
}