package ME_5_WhileLoopMoreExercises;

import java.util.Scanner;

public class P01Dishwasher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int bottleCount = bottles * 750;
        int counter = 0;
        int dishes = 0;
        int pots = 0;
        double preparat = 0.00;


        while (!input.equals("End")) {
            int dishesCount = Integer.parseInt(input);
            counter++;
            if (counter == 3) {
                preparat += 15 * dishesCount;
                pots += dishesCount;
                counter = 0;
            }else {
                preparat += 5 * dishesCount;
                dishes += dishesCount;
            }
            if (preparat > bottleCount){
                System.out.printf("Not enough detergent, %.0f ml. more necessary!" , preparat - bottleCount);
                return;
            }
            input = scanner.nextLine();
        }
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n" , dishes , pots);
            System.out.printf("Leftover detergent %.0f ml.\n" , bottleCount - preparat);
    }
}
