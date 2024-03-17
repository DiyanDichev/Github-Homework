package Day13_Preparation_For_Exam;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int kozunaci = Integer.parseInt(scanner.nextLine());

        String bestChef = "";
        int bestPoints = 0;

        for(int i = 1; i <= kozunaci; i++){
            String chefName = scanner.nextLine();
            int points = 0;

            String input = scanner.nextLine();
            while (!input.equals("Stop")){
                int input1 = Integer.parseInt(input);

                points += input1;

                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.\n", chefName , points);
            if (bestPoints < points ){
                bestChef = chefName;
                bestPoints = points;
                System.out.printf("%s is the new number 1!\n", bestChef);
            }
        }
        System.out.printf("%s won competition with %d points!", bestChef , bestPoints);
    }
}
