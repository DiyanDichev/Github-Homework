package ME_3;

import java.util.Scanner;

public class P03Flowers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int flower1 =  Integer.parseInt(scanner.nextLine());
        int flower2 =  Integer.parseInt(scanner.nextLine());
        int flower3 =  Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double flowerPrice1 = 0.00;
        double flowerPrice2 = 0.00;
        double flowerPrice3 = 0.00;


        switch (season){
            case "Spring":
            case "Summer":
                flowerPrice1 = flower1 * 2.00;
                flowerPrice2 = flower2 * 4.10;
                flowerPrice3 = flower3 * 2.50;
                break;
            case "Autumn":
            case "Winter":
                flowerPrice1 = flower1 * 3.75;
                flowerPrice2 = flower2 * 4.50;
                flowerPrice3 = flower3 * 4.15;
                break;
        }

        double totalFlowerPrice = flowerPrice1 + flowerPrice2 + flowerPrice3;

        if (holiday.equals("Y")){
            totalFlowerPrice *= 1.15;

        }
        if (flower3 > 7 && season.equals("Spring")){
            totalFlowerPrice *= 0.95;
        }
        if (flower2 > 10 && season.equals("Winter")){
            totalFlowerPrice *= 0.90;
        }
        if (flower1 + flower2 + flower3 > 20){
            totalFlowerPrice *= 0.80;
        }

        System.out.printf("%.2f" , totalFlowerPrice + 2);
    }
}
