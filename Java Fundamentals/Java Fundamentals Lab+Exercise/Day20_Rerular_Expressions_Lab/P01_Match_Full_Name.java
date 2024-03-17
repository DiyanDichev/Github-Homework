package Day20_Rerular_Expressions_Lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Match_Full_Name {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+ [A-Z][a-z]+\\b");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.print(matcher.group()+ " ");
        }
        System.out.println();
    }
}
