package PB_More_Exams_4;

import java.util.Scanner;

public class P06HighJump {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int desiredHeight = Integer.parseInt(scanner.nextLine());
        int attempt = Integer.parseInt(scanner.nextLine());

        int failed = 0;
        int jumps = 0;
        int startingHeight = desiredHeight - 30;

        while (failed < 3){

            if (startingHeight < attempt ){
                startingHeight+=5;
                jumps++;
                failed = 0;
            }else {
                jumps++;
                failed++;
            }
            if (startingHeight > desiredHeight){
                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.\n", desiredHeight , jumps);
                return;
            }
            if (failed == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.\n", startingHeight , jumps);
                return;
            }
            attempt = Integer.parseInt(scanner.nextLine());
        }

    }
}
