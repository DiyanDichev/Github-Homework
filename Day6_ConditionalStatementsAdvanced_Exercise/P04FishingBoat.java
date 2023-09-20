package Day6_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1.Input
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());


        double shipPrice = 0.00;
        //2.Calculating the ship rent
        switch (season) {
            case "Spring":
                shipPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                shipPrice = 4200;
                break;
            case "Winter":
                shipPrice = 2600;
                break;
        }

        if (fisherman <= 6){
            shipPrice = shipPrice - (shipPrice * 0.10);
        } else if (fisherman <= 11) {
            shipPrice = shipPrice - (shipPrice * 0.15);
        }else {
            shipPrice = shipPrice - (shipPrice * 0.25);
        }

        if (fisherman % 2 == 0 && !season.equals("Autumn")) {
            shipPrice = shipPrice - (shipPrice * 0.05);
        }

        if (budget >= shipPrice) {
            System.out.printf("Yes! You have %.2f leva left." , budget - shipPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva." , shipPrice - budget);
        }
    }
}
