package Day5_Sets_And_Maps_Advanced_Lab;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_Parking_Lot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        Set<String> parkingLot = new LinkedHashSet<>();

        while (!"END".equals(input[0])){
            if("IN".equals(input[0])){
                parkingLot.add(input[1]);
            } else if ("OUT".equals(input[0])) {
                parkingLot.remove(input[1]);
            }
            input = scanner.nextLine().split(",\\s+");
        }
        if(parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }

        for (String carNumber : parkingLot) {
            System.out.println(carNumber);
        }
    }
}
