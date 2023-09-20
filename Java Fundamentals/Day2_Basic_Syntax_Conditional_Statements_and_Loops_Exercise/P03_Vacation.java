package Day2_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class P03_Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0.0;

        if(type.equals("Students")){
            switch (dayOfWeek){
                case "Friday":
                    price = 8.45;
                    break;
                case "Saturday":
                    price = 9.80;
                    break;
                case "Sunday":
                    price = 10.46;
                    break;
            }
        }else if(type.equals("Business")){
            switch (dayOfWeek){
                case "Friday":
                    price = 10.90;
                    break;
                case "Saturday":
                    price = 15.60;
                    break;
                case "Sunday":
                    price = 16.00;
                    break;
            }
        }else if(type.equals("Regular")){
            switch (dayOfWeek){
                case "Friday":
                    price = 15.00;
                    break;
                case "Saturday":
                    price = 20.00;
                    break;
                case "Sunday":
                    price = 22.50;
                    break;
            }
        }

        double discount;

        if (type.equals("Business") && studentsCount >= 100){
            discount = price;
            System.out.printf("Total price: %.2f", discount * (studentsCount - 10));
            return;
        }else if (type.equals("Students") && studentsCount >= 30){
            discount = price * 0.85;
            System.out.printf("Total price: %.2f",discount  * studentsCount);
            return;
        } else if (type.equals("Regular") && studentsCount >= 10 && studentsCount <=20) {
            discount = price * 0.95;
            System.out.printf("Total price: %.2f",discount  * studentsCount);
            return;
        }

        System.out.printf("Total price: %.2f",price * studentsCount);
    }
}


//https://pastebin.com/YhwTFDDU