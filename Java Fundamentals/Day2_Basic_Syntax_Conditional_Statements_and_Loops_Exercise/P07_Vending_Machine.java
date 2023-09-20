package Day2_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class P07_Vending_Machine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double totalCoins = 0;

        while(!input.equals("Start")){
            double coins = Double.parseDouble(input);

            if(coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
            } else {
                totalCoins += coins;
            }

            input = scanner.nextLine();
        }

        String order = scanner.nextLine();
        while (!order.equals("End")){
            boolean hasMoney = true;

            switch (order){
                case "Nuts":
                    if(totalCoins < 2) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalCoins -= 2;
                    }
                    break;
                case "Water":
                    if(totalCoins < 0.7) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalCoins -= 0.7;
                    }
                    break;
                case "Crisps":
                    if(totalCoins < 1.5) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalCoins -= 1.5;
                    }
                    break;
                case "Soda":
                    if(totalCoins < 0.8) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalCoins -= 0.8;
                    }
                    break;
                case "Coke":
                    if(totalCoins < 1) {
                        System.out.println("Sorry, not enough money");
                        hasMoney = false;
                    } else {
                        totalCoins -= 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    hasMoney = false;
                    break;
            }

            if(!hasMoney){
                order = scanner.nextLine();
                continue;
            }
            System.out.printf("Purchased %s%n", order);
            order = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalCoins);
    }
}
