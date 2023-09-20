package ME_4_ForLoopMoreExercises;

import java.util.Scanner;

public class P03Logistics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cargoCount = Integer.parseInt(scanner.nextLine());

        int busTons = 0;
        int truckTons = 0;
        int trainTons = 0;
        double totalCargo = 0.00;

        for (int i = 1 ; i <= cargoCount ; i++) {
            int tonsCount = Integer.parseInt(scanner.nextLine());
            totalCargo += tonsCount;

            if ( tonsCount >= 12 ){
                trainTons += tonsCount;
            }else if ( tonsCount > 3){
                truckTons += tonsCount;
            }else {
                busTons += tonsCount;
            }
        }
        double averagePricePerTon = ((busTons * 200) + (truckTons * 175) + (trainTons * 120)) / totalCargo;
        System.out.printf("%.2f\n" , averagePricePerTon);
        System.out.printf("%.2f%%\n" , (busTons/totalCargo) * 100);
        System.out.printf("%.2f%%\n" , (truckTons/totalCargo) * 100);
        System.out.printf("%.2f%%\n" , (trainTons/totalCargo) * 100);
    }
}
