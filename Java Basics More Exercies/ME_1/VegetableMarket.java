package ME_1;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        int vegetablesWeigh = Integer.parseInt(scanner.nextLine());
        int fruitsWeigh = Integer.parseInt(scanner.nextLine());
        double vegetablesTotalPrice = vegetablesPrice * vegetablesWeigh;
        double fruitsTotalPrice = fruitsPrice * fruitsWeigh;
        double totalPrice = vegetablesTotalPrice + fruitsTotalPrice;
        double bgnToEuro = totalPrice * 0.5154639175257732;
        System.out.printf("%.2f" , bgnToEuro);
    }
}
