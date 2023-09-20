package ME_2;

import java.util.Locale;
import java.util.Scanner;

public class P07FuelTank {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine().toLowerCase(Locale.ROOT);
        int fuelAmount =  Integer.parseInt(scanner.nextLine());

        if(fuelAmount >= 25){
            System.out.printf("You have enough %s." , fuelType);
            return;
        }
        if (fuelAmount < 25){
            switch (fuelType){
                case "diesel":
                    System.out.printf("Fill your tank with %s!" , fuelType);
                    break;
                case "gasoline":
                    System.out.printf("Fill your tank with %s!" , fuelType);
                    break;
                case "gas":
                    System.out.printf("Fill your tank with %s!" , fuelType);
                    break;
                default:
                    System.out.println("Invalid fuel!");
            }
        }

    }
}
