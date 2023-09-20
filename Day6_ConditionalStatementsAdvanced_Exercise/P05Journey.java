package Day6_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P05Journey {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String place = "";
        double spendMoney = 0.00;


        if (budget <= 100) {
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    place = "Camp";
                    spendMoney = budget * 0.30;
                    break;
                case "winter":
                    place = "Hotel";
                    spendMoney = budget * 0.70;
                    break;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            switch (season) {
                case "summer":
                    place = "Camp";
                    spendMoney = budget * 0.40;
                    break;
                case "winter":
                    place = "Hotel";
                    spendMoney = budget * 0.80;
                    break;
            }
        }else {
            destination = "Europe";
            place = "Hotel";
            spendMoney = budget * 0.90;
        }
        System.out.printf("Somewhere in %s%n" , destination);
        System.out.printf("%s - %.2f" , place , spendMoney);
    }
}
