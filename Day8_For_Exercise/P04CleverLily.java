package Day8_For_Exercise;

import java.util.Scanner;

public class P04CleverLily {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age =  Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice =  Integer.parseInt(scanner.nextLine());

        int toys = 0;
        double birthDayMoney = 10.00;
        double lilyMoney = 0.00;

        for( int i = 1; i <= age; i++){

            if (i % 2 == 0) {
                lilyMoney += birthDayMoney;
                birthDayMoney += 10.00;
                lilyMoney -= 1;
            }else {
                toys++;
            }
        }
        lilyMoney += toys * toyPrice;

        if(lilyMoney >= washingMachinePrice){
            System.out.printf("Yes! %.2f", lilyMoney - washingMachinePrice);
        }else {
            System.out.printf("No! %.2f", washingMachinePrice - lilyMoney);
        }
    }
}
