package Day6_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());


        double totalPrice = 0.00;

        switch (flowerType) {
            case"Roses":
                totalPrice = flowerCount * 5.00;
                if (flowerCount > 80){
                    totalPrice = totalPrice - (totalPrice * 0.10);
                }
                break;
            case"Dahlias":
                totalPrice = flowerCount * 3.80;
                if (flowerCount > 90) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case"Tulips":
                totalPrice = flowerCount * 2.80;
                if (flowerCount > 80) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case"Narcissus":
                totalPrice = flowerCount * 3.00;
                if (flowerCount < 120) {
                    totalPrice = totalPrice + (totalPrice * 0.15);
                }
                break;
            case"Gladiolus":
                totalPrice = flowerCount * 2.50;
                if (flowerCount < 80) {
                    totalPrice = totalPrice + (totalPrice * 0.20);
                }
                break;
        }
        if (budget >= totalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left."
                    ,flowerCount , flowerType , budget - totalPrice);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more."
                    , totalPrice - budget);
        }
    }
}
