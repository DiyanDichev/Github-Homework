package Day20_Rerular_Expressions_Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Match_Phone_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\+359([ -])2\\1[0-9]{3}\\1[0-9]{4}\\b");
        Matcher matcher = pattern.matcher(input);

        List<String> matches = new ArrayList<>();
        while (matcher.find()){
            matches.add(matcher.group());
        }
        System.out.println(String.join(", ", matches));
    }
}
