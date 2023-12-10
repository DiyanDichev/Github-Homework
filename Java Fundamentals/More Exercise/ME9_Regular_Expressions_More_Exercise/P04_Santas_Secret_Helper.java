package More_Exercise.ME9_Regular_Expressions_More_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P04_Santas_Secret_Helper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String child = "";
        String regex = "@(?<name>[A-Za-z]+)[^@\\-!:>]*!(?<behavior>\\w)!";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            for (int i = 0; i < input.length(); i++) {
                char asciiOfLetter = (char) (input.charAt(i) - n);
                child += asciiOfLetter;
            }
            Matcher matcher = pattern.matcher(child);
            if (matcher.find() && matcher.group("behavior").equals("G")) {
                System.out.println(matcher.group("name"));
            }
            child = "";
            input = scanner.nextLine();
        }
    }
}
