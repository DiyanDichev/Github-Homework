package ME_3;

import java.util.Scanner;

public class P01MatchTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String ticket = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());

        double vipTicket = 0.00;
        double normalTicket = 0.00;
        double transportPrice = 0.00;

        switch (ticket){
            case "VIP":
                vipTicket = peopleCount * 499.99;
                break;
            case "Normal":
                normalTicket = peopleCount * 249.99;
                break;
        }

        if (peopleCount >= 50){
            transportPrice = budget * 0.25;
        } else if (peopleCount >= 25) {
            transportPrice = budget * 0.40;
        } else if (peopleCount >= 10) {
            transportPrice = budget * 0.50;
        } else if (peopleCount >= 5) {
            transportPrice = budget * 0.60;
        }else {
            transportPrice = budget * 0.75;
        }

        double totalPrice = (vipTicket + normalTicket) + transportPrice;

        if (budget >= (totalPrice)){
            System.out.printf("Yes! You have %.2f leva left." , budget - totalPrice);
        }else {
            System.out.printf("Not enough money! You need %.2f leva." , totalPrice - budget);
        }
    }
}
