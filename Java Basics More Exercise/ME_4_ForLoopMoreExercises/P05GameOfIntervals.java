package ME_4_ForLoopMoreExercises;

import java.util.Scanner;

public class P05GameOfIntervals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gameMoves = Integer.parseInt(scanner.nextLine());

        double from0To9 = 0.00;
        double from10To19 = 0.00;
        double from20To29 = 0.00;
        double from30To39 = 0.00;
        double from40To50 = 0.00;
        double invalidNumbers = 0.00;
        double points = 0.00;

        for ( int i = 1 ; i <= gameMoves ; i++) {
            int gameNumber = Integer.parseInt(scanner.nextLine());

            if (gameNumber >= 0 && gameNumber < 10){
                from0To9++;
                points += gameNumber * 0.2;
            }else if (gameNumber > 9 && gameNumber < 20){
                from10To19++;
                points += gameNumber * 0.3;
            } else if (gameNumber > 19 && gameNumber < 30) {
                from20To29++;
                points += gameNumber * 0.4;
            } else if (gameNumber > 29 && gameNumber < 40) {
                from30To39++;
                points += 50;
            } else if (gameNumber > 39 && gameNumber <= 50) {
                from40To50++;
                points += 100;
            } else  {
                invalidNumbers++;
                points /= 2;
            }
        }
        System.out.printf("%.2f\n" , points);
        System.out.printf("From 0 to 9: %.2f%%\n" , from0To9 / gameMoves * 100);
        System.out.printf("From 10 to 19: %.2f%%\n" , from10To19 / gameMoves * 100);
        System.out.printf("From 20 to 29: %.2f%%\n" , from20To29 / gameMoves * 100);
        System.out.printf("From 30 to 39: %.2f%%\n" , from30To39 / gameMoves * 100);
        System.out.printf("From 40 to 50: %.2f%%\n" , from40To50 / gameMoves * 100);
        System.out.printf("Invalid numbers: %.2f%%\n" , invalidNumbers / gameMoves * 100);
    }
}
