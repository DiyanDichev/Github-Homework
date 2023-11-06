package MidExam02;

import java.util.Scanner;

public class P01_SoftUni_Reception {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int employeeTotalServe = firstEmployee + secondEmployee + thirdEmployee;

        int hoursCounter = 0;
        int brakeHoursCounter = 0;

        while (studentsCount > 0) {
            studentsCount -= employeeTotalServe;
            hoursCounter++;
            if (studentsCount > 0 && hoursCounter % 3 == 0) {
                brakeHoursCounter++;
            }
        }
        System.out.printf("Time needed: %dh.", hoursCounter + brakeHoursCounter);
    }
}
