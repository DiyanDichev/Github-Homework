package ME_4_ForLoopMoreExercises;

import java.util.Scanner;

public class P06Bills {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double electricityTotal = 0.00;
        double water = months * 20.00;
        double internet = months * 15.00;


        for ( int i = 1 ; i <= months ; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            electricityTotal += electricityBill;
        }

        double other = (electricityTotal + water + internet) * 1.2;
        double average = (electricityTotal + water + internet + other) / months;
        System.out.printf("Electricity: %.2f lv\n" ,electricityTotal);
        System.out.printf("Water: %.2f lv\n" , water);
        System.out.printf("Internet: %.2f lv\n" , internet);
        System.out.printf("Other: %.2f lv\n" , other);
        System.out.printf("Average: %.2f lv\n" , average);
    }
}
