package Exam_June_2023;

import java.util.Scanner;

public class P02MaidenParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int waxRoses = Integer.parseInt(scanner.nextLine());
        int keyChains = Integer.parseInt(scanner.nextLine());
        int karikaturi = Integer.parseInt(scanner.nextLine());
        int luckyGifts = Integer.parseInt(scanner.nextLine());

        double loveLettersPrice = loveLetters * 0.60;
        double waxRosesPrice = waxRoses * 7.20;
        double keyChainsPrice = keyChains * 3.60;
        double karikaturiPrice = karikaturi * 18.20;
        double luckyGiftsPrice = luckyGifts * 22.00;


        int totalOrders = loveLetters + waxRoses + keyChains + karikaturi + luckyGifts;
        double totalPrice = loveLettersPrice + waxRosesPrice + keyChainsPrice + karikaturiPrice + luckyGiftsPrice;

        if (totalOrders >= 25){
            totalPrice *= 0.65;
        }

        double totalPrice1 = totalPrice * 0.90;

        if (totalPrice1 >= partyPrice){
            System.out.printf("Yes! %.2f lv left.",totalPrice1 - partyPrice );
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", partyPrice - totalPrice1);
        }
    }
}
