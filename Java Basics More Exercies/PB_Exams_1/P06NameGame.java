package PB_Exams_1;

import java.util.Scanner;

public class P06NameGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int winnerPoints = 0;
        String winnerName = "";


        while (!name.equals("Stop")){
            int points = 0;
            for (int i = 0; i < name.length(); i++){
                int digit = Integer.parseInt(scanner.nextLine());
                char validNumber = name.charAt(i);

                if (digit == validNumber){
                    points += 10;
                }else {
                    points += 2;
                }
            }

            if ( points >= winnerPoints){
                winnerPoints = points;
                winnerName = name;
            }
            name = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!" , winnerName , winnerPoints);
    }
}
