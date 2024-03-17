package Day4_ConditionalStatements_Exercise;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double orderPrice = (puzzles * 2.60) + (dolls * 3.00) + (teddyBears * 4.10) + (minions * 8.20) + (trucks * 2.00);
        int toysCount = puzzles + dolls + teddyBears + minions + trucks;

        if (toysCount >= 50){
            orderPrice = orderPrice - (orderPrice * 0.25);
        }
        orderPrice = orderPrice - (orderPrice * 0.10);

        if (orderPrice >=tripPrice){
            System.out.printf("Yes! %.2f lv left." , orderPrice - tripPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed." , tripPrice - orderPrice);
        }
    }
}
