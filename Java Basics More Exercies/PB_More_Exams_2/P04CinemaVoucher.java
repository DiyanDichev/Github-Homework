package PB_More_Exams_2;

import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int voucherPrice = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int ticketsBought = 0;
        int others = 0;

        while (!input.equals("End")){

            for (int i = 0; i < input.length(); i++) {
                char position = input.charAt(i);
                double priceCounter = 0;

                if (input.length() > 8 && i < 1 ) {
                    priceCounter += position;
                    if(priceCounter <= voucherPrice){
                        voucherPrice -= position;
                    }
                } else if (input.length() > 8 && i == 1) {
                    priceCounter += position;
                    if(priceCounter <= voucherPrice){
                        voucherPrice -= position;
                        ticketsBought++;
                    }
                } else if (input.length() <= 8 && i < 1){
                    priceCounter += position;
                    if(priceCounter <= voucherPrice){
                        voucherPrice -= position;
                        others++;
                    }
                }
                if (priceCounter > voucherPrice){
                    System.out.println(ticketsBought);
                    System.out.println(others);
                    return;
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(ticketsBought);
        System.out.println(others);
    }
}
