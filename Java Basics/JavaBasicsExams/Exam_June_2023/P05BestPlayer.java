package Exam_June_2023;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String playerName = "";
        int bestPlayerGoals = 0;

        while (!input.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > bestPlayerGoals) {
                bestPlayerGoals = goals;
                playerName = input;
            }
            if (goals >= 10){
                break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("%s is the best player!\n",playerName);
        if (bestPlayerGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!\n", bestPlayerGoals);
        }else {
            System.out.printf("He has scored %d goals.", bestPlayerGoals);
        }
    }
}
