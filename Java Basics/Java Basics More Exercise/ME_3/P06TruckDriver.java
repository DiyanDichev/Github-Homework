package ME_3;

import java.util.Scanner;

public class P06TruckDriver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double km =  Double.parseDouble(scanner.nextLine());

        double payment = 0.00;

        if (km > 10000 && km <= 20000){
            payment = km * 1.45;
        } else if (km > 5000 && km <= 10000) {
            switch (season){
                case "Spring":
                case "Autumn":
                    payment = km * 0.95;
                    break;
                case "Summer":
                    payment = km * 1.10;
                    break;
                case "Winter":
                    payment = km * 1.25;
            }
        }else {
            switch (season){
                case "Spring":
                case "Autumn":
                    payment = km * 0.75;
                    break;
                case "Summer":
                    payment = km * 0.90;
                    break;
                case "Winter":
                    payment = km * 1.05;
            }
        }
        double taxes = (payment * 0.90) * 4;
        System.out.printf("%.2f" , taxes);
    }
}
