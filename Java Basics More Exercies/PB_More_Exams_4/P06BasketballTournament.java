package PB_More_Exams_4;

import java.util.Scanner;

public class P06BasketballTournament {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int totalWins = 0;
        int totalLost = 0;

        while (!input.equals("End of tournaments")){

            int input1 = Integer.parseInt(scanner.nextLine());
            for (int i = 1; i <= input1; i++ ){
                int teamOneScores = Integer.parseInt(scanner.nextLine());
                int teamTwoScores = Integer.parseInt(scanner.nextLine());

                if (teamOneScores > teamTwoScores){
                    totalWins++;
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", i, input , teamOneScores - teamTwoScores);
                }else {
                    totalLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", i, input , teamTwoScores - teamOneScores);
                }
            }

            input = scanner.nextLine();
        }
        double totalGames = totalWins + totalLost;

        System.out.printf("%.2f%% matches win\n", totalWins / totalGames * 100);
        System.out.printf("%.2f%% matches lost", totalLost / totalGames * 100);
    }
}
