package Day04_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int startPower = power;
        int distance = Integer.parseInt(scanner.nextLine());
        int factor = Integer.parseInt(scanner.nextLine());
        int countPoked = 0;

        while (power >= distance){
            power -= distance;
            countPoked++;

            if (power == startPower / 2) {
                if (factor !=0) {
                    power /= factor;
                }
            }
        }
        System.out.println(power);
        System.out.println(countPoked);

    }
}