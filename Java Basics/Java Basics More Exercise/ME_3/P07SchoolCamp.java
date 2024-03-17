package ME_3;

import java.util.Scanner;

public class P07SchoolCamp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String season =  scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentCount = Integer.parseInt(scanner.nextLine());
        int rentDays = Integer.parseInt(scanner.nextLine());

        double price = 0.00;
        String sportType = "";

        if (season.equals("Winter"))
        switch (groupType){
            case "boys":
                price = rentDays * 9.60;
                sportType = "Judo";
                break;
            case "girls":
                price = rentDays * 9.60;
                sportType = "Gymnastics";
                break;
            case "mixed":
                price = rentDays * 10.00;
                sportType = "Ski";
                break;
        }else if (season.equals("Spring")) {
            switch (groupType) {
                case "boys":
                    price = rentDays * 7.20;
                    sportType = "Tennis";
                    break;
                case "girls":
                    price = rentDays * 7.20;
                    sportType = "Athletics";
                    break;
                case "mixed":
                    price = rentDays * 9.50;
                    sportType = "Cycling";
                    break;
            }
        }else if (season.equals("Summer")) {
            switch (groupType) {
                case "boys":
                    price = rentDays * 15.00;
                    sportType = "Football";
                    break;
                case "girls":
                    price = rentDays * 15.00;
                    sportType = "Volleyball";
                    break;
                case "mixed":
                    price = rentDays * 20.00;
                    sportType = "Swimming";
                    break;
            }
        }
        if (studentCount >= 50){
            price *= 0.50;
        } else if (studentCount >= 20) {
            price *= 0.85;
        } else if (studentCount >= 10) {
            price *= 0.95;
        }
        System.out.printf("%s %.2f lv." , sportType , price * studentCount);
    }
}
