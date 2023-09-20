package ME_2;

import java.util.Scanner;

public class P01PipesInPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int v =  Integer.parseInt(scanner.nextLine());
        int p1 =  Integer.parseInt(scanner.nextLine());
        int p2 =  Integer.parseInt(scanner.nextLine());
        double h =  Double.parseDouble(scanner.nextLine());

        double p1Debit = p1 * h;
        double p2Debit = p2 * h;
        double totalDebit = p1Debit + p2Debit;
        double percent = (totalDebit / v) * 100;
        double p1Percent = (p1Debit / totalDebit) * 100;
        double p2Percent = (p2Debit / totalDebit) * 100;
        double overFlow = totalDebit - v;

        if (totalDebit <= v) {
            System.out.printf("The pool is %.2f", percent);
            System.out.print("% full. ");
            System.out.printf("Pipe 1: %.2f",p1Percent);
            System.out.print("%. ");
            System.out.printf("Pipe 2: %.2f",p2Percent);
            System.out.print("%.");
        }else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters." , h , overFlow);
        }
    }
}
