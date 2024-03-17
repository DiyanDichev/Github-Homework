package Day8_For_Exercise;

import java.util.Scanner;

public class P08TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int tournamentPoints = 0;
        int winCount = 0;

        for (int i = 0; i < tournaments; i++) {
            String placeInTournament = scanner.nextLine();

            switch (placeInTournament) {
                case "W":
                    tournamentPoints += 2000;
                    winCount++;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    break;
                case "SF":
                    tournamentPoints += 720;
                    break;
            }
        }

        int totalPoints = initialPoints + tournamentPoints;
        double averagePoints = Math.floor(tournamentPoints * 1.0 / tournaments);
        double percentWins = winCount * 1.0 / tournaments * 100;

        System.out.printf("Final points: %d\nAverage points: %.0f\n%.2f%%" , totalPoints, averagePoints , percentWins);
    }
}
