package Day04_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class P11_Snowballs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int snowballsCount = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;
        int snowballSnowBiggest = 0;
        int snowballTTimeBiggest = 0;
        int snowballQualityBiggest = 0;

        for (int i = 1; i <= snowballsCount; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                snowballSnowBiggest = snowballSnow;
                snowballTTimeBiggest = snowballTime;
                snowballQualityBiggest = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d) ",snowballSnowBiggest, snowballTTimeBiggest, maxValue ,snowballQualityBiggest );
    }
}
