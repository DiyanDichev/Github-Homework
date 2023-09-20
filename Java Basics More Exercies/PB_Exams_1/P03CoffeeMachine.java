package PB_Exams_1;

import java.util.Scanner;

public class P03CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String coffeeType = scanner.nextLine();
        String sugar = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double espressoPrice = 0.00;
        double cappuccinoPrice = 0.00;
        double teaPrice = 0.00;


        if ( sugar.equals("Without")){
            switch (coffeeType){
                case "Espresso":
                    espressoPrice = count * 0.90 * 0.65;
                    break;
                case "Cappuccino":
                    cappuccinoPrice = count * 1.00 * 0.65;
                    break;
                case "Tea":
                    teaPrice = count * 0.50 * 0.65;
                    break;
            }
        } else if (sugar.equals("Normal")) {
            switch (coffeeType){
                case "Espresso":
                    espressoPrice = count * 1.00;
                    break;
                case "Cappuccino":
                    cappuccinoPrice = count * 1.20;
                    break;
                case "Tea":
                    teaPrice = count * 0.60;
                    break;
            }
        } else if (sugar.equals("Extra")) {
            switch (coffeeType){
                case "Espresso":
                    espressoPrice = count * 1.20;
                    break;
                case "Cappuccino":
                    cappuccinoPrice = count * 1.60;
                    break;
                case "Tea":
                    teaPrice = count * 0.70;
                    break;
            }
        }
        if (coffeeType.equals("Espresso") && count >= 5){
            espressoPrice *= 0.75;
        }

        double totalPrice = espressoPrice + cappuccinoPrice + teaPrice;

        if (totalPrice > 15.00){
            totalPrice *= 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv." , count , coffeeType , totalPrice);
    }
}
