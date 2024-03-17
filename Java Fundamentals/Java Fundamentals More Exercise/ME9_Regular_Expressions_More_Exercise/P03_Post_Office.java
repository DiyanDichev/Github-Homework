package More_Exercise.ME9_Regular_Expressions_More_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_Post_Office {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        String firstPart = input[0];
        String secondPart = input[1];
        String thirdPart = input[2];

        String firstRegex = "([#$%*&])(?<letters>[A-Z]+)\\1";
        String secondRegex = "(?<digit>\\d{2}):(?<length>\\d{2})";
        Pattern firstPatter = Pattern.compile(firstRegex);
        Matcher firstMatcher = firstPatter.matcher(firstPart);

        List<String> secondMatcherList = new ArrayList<>();

        if (firstMatcher.find()) {
            String code = firstMatcher.group("letters");

            Pattern secondPattern = Pattern.compile(secondRegex);
            Matcher secondMatcher = secondPattern.matcher(secondPart);

            while (secondMatcher.find()) {
                secondMatcherList.add(secondMatcher.group());
            }
            for (char symbol : code.toCharArray()) {
                boolean flag = false;
                for (String matcher : secondMatcherList) {

                    int codeOfLetter = Integer.parseInt(matcher.split(":")[0]);
                    int length = Integer.parseInt(matcher.split(":")[1]) + 1;

                    for (String word : thirdPart.split("\\s+")) {
                        String firstLetter = word.substring(0, 1);
                        if (firstLetter.equals(symbol + "")) {
                            if (symbol == codeOfLetter && word.length() == length) {
                                System.out.println(word);
                                flag = true;
                            }
                        }
                        if (flag) {
                            break;
                        }
                    }
                    if (flag) {
                        break;
                    }
                }
            }
        }
    }
}