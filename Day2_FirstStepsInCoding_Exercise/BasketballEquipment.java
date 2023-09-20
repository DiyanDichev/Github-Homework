package Day2_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearPrice = Integer.parseInt(scanner.nextLine());
        double sneakers = (yearPrice - (yearPrice * (40/100.0)));
        double cloths = (sneakers - (sneakers * (20/100.0)));
        double ball = cloths / 4;
        double accessories = ball / 5;
        System.out.println(yearPrice + sneakers + cloths + ball + accessories);

    }
}
