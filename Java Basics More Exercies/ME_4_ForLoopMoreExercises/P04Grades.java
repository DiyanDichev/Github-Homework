package ME_4_ForLoopMoreExercises;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        double fail = 0.00;
        double poor = 0.00;
        double good = 0.00;
        double excellent = 0.00;
        double averageGrade = 0.00;


        for ( double i = 1; i <= studentsCount ; i++) {
            double studentsGrades = Double.parseDouble(scanner.nextLine());
            averageGrade += studentsGrades;

            if (studentsGrades >= 5){
                excellent++;
            } else if (studentsGrades >= 4) {
                good++;
            } else if (studentsGrades >=3 ) {
                poor++;
            }else {
                fail++;
            }
        }
        System.out.printf("Top students: %.2f%%\n" , (excellent / studentsCount) * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n" , (good / studentsCount) * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n" , (poor / studentsCount) * 100);
        System.out.printf("Fail: %.2f%%\n" , (fail / studentsCount) * 100);
        System.out.printf("Average: %.2f\n" , averageGrade / studentsCount);
    }
}
