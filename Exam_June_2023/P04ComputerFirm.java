package Exam_June_2023;

import java.util.Scanner;

public class P04ComputerFirm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int input = Integer.parseInt(scanner.nextLine());

        double soldPcs = 0;
        double rate1 = 0;

        for (int i = 1; i <= input; i++){
            int input1 = Integer.parseInt(scanner.nextLine());

            double rate = input1 % 10;
            double pcs = (input1 - rate) / 10;
            rate1 += rate;

            if (rate == 6) {
                soldPcs += pcs;
            } else if (rate == 5) {
                soldPcs += pcs * 0.85;
            } else if (rate == 4) {
                soldPcs += pcs * 0.70;
            } else if (rate == 3) {
                soldPcs += pcs * 0.50;
            } else {
                soldPcs += 0;
            }
        }
        System.out.printf("%.2f\n", soldPcs);
        System.out.printf("%.2f",rate1 / input);
    }
}
