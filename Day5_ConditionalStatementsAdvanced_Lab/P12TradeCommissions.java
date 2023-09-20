package Day5_ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double commision = 0;
        if(city.equals("Sofia")){
            if(quantity >= 0 && quantity <= 500){
                commision = 5;
            } else if (quantity >= 500 && quantity <= 1000){
                commision = 7;
            } else if (quantity >= 1000 && quantity <= 10000){
                commision = 8;
            } else if (quantity >= 10000){
                commision = 12;
            }else{
                System.out.println("error");
            }

        } else if (city.equals("Varna")) {
            if(quantity >= 0 && quantity <= 500){
                commision = 4.5;
            } else if (quantity >= 500 && quantity <= 1000){
                commision = 7.5;
            } else if (quantity >= 1000 && quantity <= 10000){
                commision = 10;
            } else if (quantity >= 10000){
                commision = 13;
            }else{
                System.out.println("error");
            }

        } else if (city.equals("Plovdiv")) {
            if(quantity >= 0 && quantity <= 500){
                commision = 5.5;
            } else if (quantity >= 500 && quantity <= 1000){
                commision = 8;
            } else if (quantity >= 1000 && quantity <= 10000){
                commision = 12;
            } else if (quantity >= 10000){
                commision = 14.5;
            }else{
                System.out.println("error");
            }

        }else{
            System.out.println("error");
        }
        if (commision > 0){
            System.out.printf("%.2f" , commision/100 * quantity);
        }

    }
}
