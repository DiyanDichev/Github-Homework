package ME_2;

import java.util.Scanner;

public class P04TransportPrice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int km =  Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double pricePerKm = 0.00;
        double busPrice = 0.09 * km;
        double trainPrice = 0.06 * km;

        if (dayOrNight.equals("day")) {
            if(km >= 100){
                pricePerKm = trainPrice;
            } else if (km >= 20) {
                pricePerKm = busPrice;
            }else {
                pricePerKm = 0.70 + 0.79 * km;
            }
        } else if(dayOrNight.equals("night")) {
            if(km >= 100){
                pricePerKm = trainPrice;
            } else if (km >= 20) {
                pricePerKm = busPrice;
            }else {
                pricePerKm = 0.70 + 0.90 * km;
            }
        }
        System.out.printf("%.2f" , pricePerKm);
    }
}
