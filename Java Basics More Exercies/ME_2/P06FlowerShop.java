package ME_2;

import java.util.Scanner;

public class P06FlowerShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int flower1Count =  Integer.parseInt(scanner.nextLine());
        int flower2Count =  Integer.parseInt(scanner.nextLine());
        int flower3Count =  Integer.parseInt(scanner.nextLine());
        int flower4Count =  Integer.parseInt(scanner.nextLine());
        double giftPrice =  Double.parseDouble(scanner.nextLine());

        double profit = (flower1Count * 3.25) + (flower2Count * 4.00) + (flower3Count * 3.50) + (flower4Count * 8.00);
        double tax = profit * 0.95;

        if (tax >= giftPrice){
            System.out.printf("She is left with %.0f leva." , Math.floor(tax - giftPrice));
        }else {
            System.out.printf("She will have to borrow %.0f leva." , Math.ceil(giftPrice - tax));
        }
    }
}
