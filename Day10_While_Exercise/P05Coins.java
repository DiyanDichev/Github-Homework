package Day10_While_Exercise;

import java.util.Scanner;

public class P05Coins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double sum = Math.round(change * 100);

        int coins = 0;

        while (sum > 0) {

            if(sum - 200 >= 0) {
                sum -= 200;
                coins++;
            } else if (sum - 100 >= 0) {
                 sum -= 100;
                 coins++;
            } else if (sum - 50 >= 0) {
                 sum -= 50;
                 coins++;
            } else if (sum - 20 >= 0) {
                 sum -= 20;
                 coins++;
            } else if (sum - 10 >= 0) {
                 sum -= 10;
                 coins++;
            } else if (sum - 5 >= 0) {
                 sum -= 5;
                 coins++;
            } else if (sum - 2 >= 0) {
                 sum -= 2;
                 coins++;
            } else {
                sum -= 1;
                coins++;
            }
        }
        System.out.println(coins);
    }
}
