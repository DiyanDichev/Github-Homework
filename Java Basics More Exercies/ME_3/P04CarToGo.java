package ME_3;

import java.util.Scanner;

public class P04CarToGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget =  Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double carPrice = 0.00;
        String carType = "";
        String carClass;

        if (budget > 500) {
            carClass = "Luxury class";
            switch (season) {
                case "Summer":
                case "Winter":
                    carPrice = budget * 0.90;
                    carType = "Jeep";
                    break;
            }
        } else if (budget >100) {
            carClass = "Compact class";
            switch (season){
                case "Summer":
                    carPrice = budget * 0.45;
                    carType = "Cabrio";
                    break;
                case "Winter":
                    carPrice = budget * 0.80;
                    carType = "Jeep";
                    break;
            }
        }else {
            carClass = "Economy class";
            switch (season) {
                case "Summer":
                    carPrice = budget * 0.35;
                    carType = "Cabrio";
                    break;
                case "Winter":
                    carPrice = budget * 0.65;
                    carType = "Jeep";
                    break;
            }
        }
        System.out.printf("%s\n" , carClass);
        System.out.printf("%s - %.2f" , carType , carPrice);
    }
}
