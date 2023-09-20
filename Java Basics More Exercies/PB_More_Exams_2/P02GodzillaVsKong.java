package PB_More_Exams_2;

import java.util.Scanner;

public class P02GodzillaVsKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int statist = Integer.parseInt(scanner.nextLine());
        double costumePrice = Double.parseDouble(scanner.nextLine());


        double decor = budget * 0.1;
        double costumePticeTotal = 0;

        if (statist > 150){
            costumePticeTotal = statist * (costumePrice * 0.9);
        }else {
            costumePticeTotal = statist * costumePrice;
        }

        double totalSpends = decor + costumePticeTotal;
        if (totalSpends > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalSpends - budget);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalSpends);
        }
    }
}
