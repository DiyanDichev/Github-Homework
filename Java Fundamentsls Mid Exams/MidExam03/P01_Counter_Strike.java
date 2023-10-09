package MidExam03;

import java.util.Scanner;

public class P01_Counter_Strike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        int battlesWon = 0;
        String input = scanner.nextLine();
        while (!input.equals("End of battle")){

            int distance = Integer.parseInt(input);

            if(initialEnergy >= distance){
                initialEnergy -= distance;
                battlesWon++;
                if( battlesWon % 3 == 0){
                    initialEnergy += battlesWon;
                }
            }else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", battlesWon, initialEnergy);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", battlesWon , initialEnergy);
    }
}
