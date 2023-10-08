package Day5_Arrays_Lab;

import java.util.Scanner;

public class P01_Day_of_Week {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());

        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };
        if (day >= 1 && day <= days.length){
            System.out.println(days[day-1] );
        }else {
            System.out.println("Invalid day!");
        }
    }
}
