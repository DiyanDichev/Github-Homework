package ME_3;

import java.util.Scanner;

public class P05Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0.00;
        String destination = "";
        String tripType = "";

        if (budget > 3000){
            tripType = "Hotel";
            switch (season){
                case "Summer":
                case "Winter":
                    price = budget * 0.90;
                    break;
            }
        } else if (budget > 1000) {
            tripType = "Hut";
            switch (season) {
                case "Summer":
                    price = budget * 0.80;
                    break;
                case "Winter":
                    price = budget * 0.60;
                    break;
            }
        }else {
            tripType = "Camp";
            switch (season) {
                case "Summer":
                    price = budget * 0.65;
                    break;
                case "Winter":
                    price = budget * 0.45;
                    break;
            }
        }
        if (season.equals("Summer")){
            destination = "Alaska";
        } else if (season.equals("Winter")) {
            destination = "Morocco";
        }
        System.out.printf("%s - %s - %.2f" , destination , tripType , price);
    }
}
