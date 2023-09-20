package Day2_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());
        double desert = (chickenMenu * 10.35) + (fishMenu * 12.40) + (veganMenu * 8.15);
        double desertPercent = (desert + (desert * (20 / 100.0))) + 2.50;
        System.out.println(desertPercent);


    }
}
