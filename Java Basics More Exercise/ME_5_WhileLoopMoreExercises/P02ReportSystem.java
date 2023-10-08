package ME_5_WhileLoopMoreExercises;

import java.util.Scanner;

public class P02ReportSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int counter = 1;
        double handCash = 0;
        double posCash = 0;


        while (!input.equals("End")){

            int cash = Integer.parseInt(input);

            if (counter == 1) {
                counter = 0;
                if (cash < 100){
                    handCash += cash;
                    System.out.println("Product sold!");
                }else {
                    System.out.println("Error in transaction!");

                }
            }
            if (counter == 0){
                counter = 1;
                if (cash > 10){
                    posCash += cash;
                    System.out.println("Product sold!");
                }else {
                    System.out.println("Error in transaction!");
                }
            }
            input = scanner.nextLine();
            System.out.printf("Average CS: %.2f\n", handCash / 2);
            System.out.printf("Average CC: %.2f\n", posCash / 2);
        }
        System.out.print("Failed to collect required money for charity.");
    }
}
