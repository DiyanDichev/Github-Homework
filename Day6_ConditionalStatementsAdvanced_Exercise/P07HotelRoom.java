package Day6_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P07HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        double rentDays = Double.parseDouble(scanner.nextLine());

        double apartmentPrice = 0.00;
        double studioPrice = 0.00;

        switch (month) {
            case "May":
            case "October":
                studioPrice = 50.0 * rentDays;
                apartmentPrice = 65.0 * rentDays;
                break;
            case "June":
            case "September":
                studioPrice = 75.2 * rentDays;
                apartmentPrice = 68.7 * rentDays;
                break;
            case "July":
            case "August":
                studioPrice = 76.0 * rentDays;
                apartmentPrice = 77.0 * rentDays;
                break;
        }

        if ((month.equals("May") || month.equals("October"))  && (rentDays < 14 && rentDays > 7)) {
            studioPrice *= 0.95;
        }else if ((month.equals("May") || month.equals("October")) && rentDays > 14){
            studioPrice *= 0.70;
        }else if ((month.equals("June") || month.equals("September")) && rentDays > 14){
            studioPrice *= 0.80;
        }
        if (rentDays > 14){
            apartmentPrice *= 0.90;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv." ,
                apartmentPrice , studioPrice);
    }
}