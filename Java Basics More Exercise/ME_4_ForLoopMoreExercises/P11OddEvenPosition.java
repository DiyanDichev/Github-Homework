package ME_4_ForLoopMoreExercises;

import java.util.Scanner;

public class P11OddEvenPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        double evenMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double oddMin = Integer.MAX_VALUE;

        double oddPositionSum = 0.00;
        double evenPositionSum = 0.00;

        for (double i = 1; i <= n;i++ ){
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0){
                evenPositionSum += number;
                if (number > evenMax){
                    evenMax = number;
                }
                if (number < evenMin){
                    evenMin = number;
                }
            }else {
                oddPositionSum += number;
                if (number > oddMax){
                    oddMax = number;
                }
                if ( number < oddMin) {
                    oddMin = number;
                }
            }
        }
        System.out.printf("OddSum=%.2f,\n", oddPositionSum);


        if (oddMin == Integer.MAX_VALUE ){
            System.out.println("OddMin=No,");
        }else {
            System.out.printf("OddMin=%.2f,\n", oddMin);
        }
        if (oddMax == Integer.MIN_VALUE ){
            System.out.println("OddMax=No,");
        }else {
            System.out.printf("OddMax=%.2f,\n", oddMax);
        }

        System.out.printf("EvenSum=%.2f,\n", evenPositionSum);

        if (evenMin == Integer.MAX_VALUE ){
            System.out.println("EvenMin=No,");
        }else {
            System.out.printf("EvenMin=%.2f,\n", evenMin);
        }
        if (evenMax == Integer.MIN_VALUE ){
            System.out.println("EvenMax=No");
        }else {
            System.out.printf("EvenMax=%.2f", evenMax);
        }

    }
}
