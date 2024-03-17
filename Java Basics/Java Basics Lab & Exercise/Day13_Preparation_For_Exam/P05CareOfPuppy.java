package Day13_Preparation_For_Exam;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int foodInGrams = food * 1000;
        int consumedFood = 0;

        while(!input.equals("Adopted")){
            int input1 = Integer.parseInt(input);

            consumedFood += input1;

            input = scanner.nextLine();
        }
        if (foodInGrams >= consumedFood){
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - consumedFood);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", consumedFood - foodInGrams);
        }
    }
}
