package ME_2;

import java.util.Scanner;

public class P08FuelTankPart2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelAmount =  Double.parseDouble(scanner.nextLine());
        String discountCard = scanner.nextLine();

        double fuelPrice = 0.00;

        if(discountCard.equals("Yes")){
            switch (fuelType){
                case "Gasoline":
                    fuelPrice = fuelAmount * (2.22 - 0.18);
                    break;
                case "Diesel":
                    fuelPrice = fuelAmount * (2.33 - 0.12);
                    break;
                case "Gas":
                    fuelPrice = fuelAmount * (0.93 - 0.08);
                    break;
            }
        }else {
            switch (fuelType){
                case "Gasoline":
                    fuelPrice = fuelAmount * 2.22;
                    break;
                case "Diesel":
                    fuelPrice = fuelAmount * 2.33;
                    break;
                case "Gas":
                    fuelPrice = fuelAmount * 0.93;
                    break;
            }
        }
        if (fuelAmount >= 20 && fuelAmount <= 25){
            fuelPrice *= 0.92;
        }else if (fuelAmount >25){
            fuelPrice *= 0.90;
        }else {
            fuelPrice = fuelPrice;
        }
        System.out.printf("%.2f lv." ,fuelPrice);
    }
}
