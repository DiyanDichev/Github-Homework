package Final_Exams.FinalExam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Destination_Mapper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "(=|/)(?<destination>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> destinationData = new ArrayList<>();
        while (matcher.find()) {
            String destination = matcher.group("destination");
            destinationData.add(destination);
        }
        int points = 0;
        for (int i = 0; i < destinationData.size(); i++) {
            points += destinationData.get(i).length();
        }
        System.out.print("Destinations: ");
        System.out.print(String.join(", ", destinationData));
        System.out.printf("\nTravel Points: %d",points);
    }
}
