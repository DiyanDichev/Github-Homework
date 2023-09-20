package ME_2;

import java.util.Scanner;

public class P03Harvest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x =  Integer.parseInt(scanner.nextLine());
        double y =  Double.parseDouble(scanner.nextLine());
        int z =  Integer.parseInt(scanner.nextLine());
        int workersCount =  Integer.parseInt(scanner.nextLine());

        double kg = x * y;
        double percent = 0.4 * kg / 2.5;


        double totalWineForWorkers = 0;
        double winePerWorker = 0;

        if (percent >= z){
            totalWineForWorkers = percent - z ;
            winePerWorker = totalWineForWorkers / workersCount;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n%.0f liters left -> %.0f liters per person." ,
                    Math.ceil(percent) , Math.ceil(totalWineForWorkers) , Math.ceil(winePerWorker));
        }else {
            percent -= z;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed." , Math.abs(Math.ceil(percent)));
        }
    }
}
