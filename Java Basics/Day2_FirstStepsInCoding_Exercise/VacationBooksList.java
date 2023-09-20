package Day2_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int totalDays = Integer.parseInt(scanner.nextLine());
        int totalHours = totalPages / pagesPerHour;
        int readingHoursPerDay = totalHours / totalDays;
        System.out.println(readingHoursPerDay);
    }
}
