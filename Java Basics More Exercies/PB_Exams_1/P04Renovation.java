package PB_Exams_1;

import java.util.Scanner;

public class P04Renovation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int wide = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double totalSize = ((height * wide) * (100 - percent) * 0.01) * 4;
        double littersTotal = 0.00;

        while (!input.equals("Tired!")){
            int litters = Integer.parseInt(input);

            littersTotal += litters;

            if(littersTotal > totalSize ){
                System.out.printf("All walls are painted and you have %.0f l paint left!" , Math.ceil(littersTotal - totalSize));
                return;
            }
            if (littersTotal == totalSize) {
                System.out.print("All walls are painted! Great job, Pesho!");
                return;
            }
            input = scanner.nextLine();
        }
            System.out.printf("%.0f quadratic m left.", Math.ceil(totalSize - littersTotal));
    }
}
