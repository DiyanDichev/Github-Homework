package Day5_ConditionalStatementsAdvanced_Lab;


import java.util.Scanner;

public class P05SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());

        double price = 0;
        if (city.equals("Sofia")){

            if(product.equals("coffee")){
                price = 0.50;
            }else if (product.equals("water")){
                price = 0.80;
            }else if (product.equals("beer")){
                price = 1.20;
            }else if (product.equals("sweets")){
                price = 1.45;
            }else if (product.equals("peanuts")){
                price = 1.60;
            }
        } else if (city.equals("Plovdiv")) {

            if(product.equals("coffee")){
                price = 0.40;
            }else if (product.equals("water")){
                price = 0.70;
            }else if (product.equals("beer")){
                price = 1.15;
            }else if (product.equals("sweets")){
                price = 1.30;
            }else if (product.equals("peanuts")){
                price = 1.50;
            }
        } else if (city.equals("Varna")){

            if(product.equals("coffee")){
                price = 0.45;
            }else if (product.equals("water")){
                price = 0.70;
            }else if (product.equals("beer")){
                price = 1.10;
            }else if (product.equals("sweets")){
                price = 1.35;
            }else if (product.equals("peanuts")){
                price = 1.55;
            }
        }
        double total = price * count;
        System.out.println(total);
    }
}
