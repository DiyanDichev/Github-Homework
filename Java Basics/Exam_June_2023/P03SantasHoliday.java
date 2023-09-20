package Exam_June_2023;

import java.util.Scanner;

public class P03SantasHoliday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double rentDays =  Double.parseDouble(scanner.nextLine());
        String room = scanner.nextLine();
        String grade = scanner.nextLine();

        double roomPrice = 0.00;

        switch (room) {
            case "room for one person":
                roomPrice = 18.00 * (rentDays - 1);
                break;
            case "apartment":
                roomPrice = 25.00 * (rentDays - 1);
                break;
            case "president apartment":
                roomPrice = 35.00 * (rentDays - 1);
                break;
        }


        if (rentDays < 10 && room.equals("apartment")) {
            roomPrice = roomPrice * 0.70;
        } else if (rentDays < 10 && room.equals("president apartment")) {
            roomPrice = roomPrice * 0.90;
        } else if ((rentDays > 10 && rentDays < 15) && room.equals("apartment")) {
            roomPrice = roomPrice * 0.65;
        } else if ((rentDays > 10 && rentDays < 15) && room.equals("president apartment")) {
            roomPrice = roomPrice * 0.85;
        } else if ((rentDays > 15) && room.equals("apartment")) {
            roomPrice = roomPrice * 0.50;
        } else if ((rentDays > 15) && room.equals("president apartment")) {
            roomPrice = roomPrice * 0.80;
        }


        if (grade.equals("positive")) {
            roomPrice = roomPrice * 1.25;
        }else if (grade.equals("negative")) {
            roomPrice = roomPrice * 0.90;
        }
        System.out.printf("%.2f" , roomPrice);
    }
}
