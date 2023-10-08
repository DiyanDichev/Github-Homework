package PB_Exams_1;

import java.util.Scanner;

public class P05FootballTournament {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int gamesPlayed = Integer.parseInt(scanner.nextLine());

        if (gamesPlayed == 0){
            System.out.printf("%s hasn't played any games during this season.", name);
            return;
        }

        int win = 0;
        int draw = 0;
        int lose = 0;
        int points = 0;

        for (int i = 1; i <= gamesPlayed; i++){
            String gamesResults = scanner.nextLine();

            switch (gamesResults){
                case "W":
                    win++;
                    points +=3;
                    break;
                case "D":
                    draw++;
                    points++;
                    break;
                case "L":
                    lose++;
                    break;
            }
        }

        double percentWinRate = win / (gamesPlayed *0.01);
        System.out.printf("%s has won %d points during this season.\n", name , points);
        System.out.println("Total stats:");
        System.out.printf("## W: %d\n", win);
        System.out.printf("## D: %d\n", draw);
        System.out.printf("## L: %d\n", lose);
        System.out.printf("Win rate: %.2f%%", percentWinRate);
    }
}
