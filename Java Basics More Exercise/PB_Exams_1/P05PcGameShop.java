package PB_Exams_1;

import java.util.Scanner;

public class P05PcGameShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalSoldGames = Integer.parseInt(scanner.nextLine());

        double hearthStone = 0;
        double fornite = 0;
        double overWatch = 0;
        double others = 0;

        for (int i = 1; i <= totalSoldGames; i++){
            String gameName = scanner.nextLine();

            switch (gameName){
                case "Hearthstone":
                    hearthStone++;
                    break;
                case "Fornite":
                    fornite++;
                    break;
                case "Overwatch":
                    overWatch++;
                    break;
                default:
                    others++;
                    break;
            }
        }
        System.out.printf("Hearthstone - %.2f%%\n", (hearthStone / totalSoldGames) * 100);
        System.out.printf("Fornite - %.2f%%\n", (fornite / totalSoldGames) * 100);
        System.out.printf("Overwatch - %.2f%%\n", (overWatch / totalSoldGames) * 100);
        System.out.printf("Others - %.2f%%", (others / totalSoldGames) * 100);
    }
}