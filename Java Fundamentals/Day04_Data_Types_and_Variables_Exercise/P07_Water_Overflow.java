package Day04_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class P07_Water_Overflow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int waterTank = 255;
        int waterPoured = 0;

        for(int i = 1; i <= input; i++){
            int waterInput = Integer.parseInt(scanner.nextLine());

            if (waterPoured + waterInput > waterTank){
                System.out.println("Insufficient capacity!");
            }else {
                waterPoured += waterInput;
            }
        }
        System.out.println(waterPoured);
    }
}
