package ME_3;

import java.util.Scanner;

public class P02BikeRace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int juniors =  Integer.parseInt(scanner.nextLine());
        int seniors =  Integer.parseInt(scanner.nextLine());
        String trace = scanner.nextLine();

        double juniorsPrice = 0.00;
        double seniorsPrice = 0.00;

        switch (trace){
            case "trail":
                juniorsPrice = juniors * 5.50;
                seniorsPrice = seniors * 7.00;
                break;
            case "cross-country":
                juniorsPrice = juniors * 8.00;
                seniorsPrice = seniors * 9.50;
                break;
            case "downhill":
                juniorsPrice = juniors * 12.25;
                seniorsPrice = seniors * 13.75;
                break;
            case "road":
                juniorsPrice = juniors * 20.00;
                seniorsPrice = seniors * 21.50;
                break;
        }

        double totalPrice = seniorsPrice + juniorsPrice;

        if (trace.equals("cross-country") && (juniors + seniors >= 50)){
            totalPrice *= 0.75;
        }

        double expenses = totalPrice * 0.95;

        System.out.printf("%.2f" , expenses);
    }
}
