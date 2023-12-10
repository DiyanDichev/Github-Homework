package More_Exercise.ME9_Regular_Expressions_More_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Winning_Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "(?=.{20}).*?(?=(?<ch>[@#$^]))(?<match>\\k<ch>{6,}).*(?<=.{10})\\k<match>.*";
        Pattern pattern = Pattern.compile(regex);
        Pattern separator = Pattern.compile("\\s*,\\s*");
        String[] tickets = separator.split(scanner.nextLine().trim());

        for (String ticket : tickets) {
            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
            } else {
                Matcher matcher = pattern.matcher(ticket);
                if (matcher.matches()) {
                    String match = matcher.group("match");
                    System.out.printf("ticket \"%s\" - %d%s%s\n",
                            ticket, match.length(), match.charAt(0),
                            (match.length() == 10) ? " Jackpot!" : "");
                } else {
                    System.out.printf("ticket \"%s\" - no match\n", ticket);
                }
            }
        }
    }
}