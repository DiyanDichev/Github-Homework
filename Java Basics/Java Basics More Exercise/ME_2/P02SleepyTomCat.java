package ME_2;

import java.util.Scanner;

public class P02SleepyTomCat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int offDays =  Integer.parseInt(scanner.nextLine());

        int workDays = 365 - offDays;
        int playTime = (workDays * 63) + (offDays * 127);
        int sleepTime = 30000 - playTime;

        int sleepTimeHours = sleepTime / 60;
        int sleepTimeMinutes = sleepTime % 60;

        if (30000 >= playTime) {
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play" , sleepTimeHours , sleepTimeMinutes);
        }else {
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play" , Math.abs(sleepTimeHours) , Math.abs(sleepTimeMinutes));
        }

    }
}
