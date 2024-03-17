package Day4_ConditionalStatements_Exercise;

import java.util.Scanner;

public class P03TimePlus15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hours * 60) + minutes +15;

        int actualHours = totalMinutes / 60;
        int actualMinutes = totalMinutes % 60;

        if (actualHours > 23){
            actualHours = 0;
        }

        if (actualMinutes < 10) {
            System.out.printf("%d:0%d" , actualHours , actualMinutes);
        } else {
            System.out.printf("%d:%d" , actualHours , actualMinutes);
        }

    }
}
