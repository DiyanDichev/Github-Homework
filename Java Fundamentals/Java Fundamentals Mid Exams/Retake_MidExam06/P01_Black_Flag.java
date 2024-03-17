package Retake_MidExam06;

import java.util.Scanner;

public class P01_Black_Flag {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int plunderForDay = Integer.parseInt(scanner.nextLine());
        int expectedPlunder = Integer.parseInt(scanner.nextLine());

        double totalGain = 0;

        for (int i = 1; i <= days; i++) {
            totalGain += plunderForDay;
            if(i % 3 == 0){
                totalGain += plunderForDay * 1.0 / 2;
            }
            if(i % 5 == 0){
                totalGain *= 0.7;
            }
        }
        if( totalGain >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", totalGain);
        }else {
            System.out.printf("Collected only %.2f%% of the plunder.",(totalGain / expectedPlunder) * 100 );
        }
    }
}