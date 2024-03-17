package PB_More_Exams_2;

import java.util.Scanner;

public class P01OscarsCeremony {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rentPrice = Integer.parseInt(scanner.nextLine());

        double statuePrice = rentPrice * 0.70;
        double ketaringPrice = statuePrice * 0.85;
        double soundPrice = ketaringPrice / 2;

        System.out.printf("%.2f", rentPrice + soundPrice + ketaringPrice + statuePrice);
    }
}
