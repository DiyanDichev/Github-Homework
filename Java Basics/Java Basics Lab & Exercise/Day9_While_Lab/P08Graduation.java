package Day9_While_Lab;

import java.util.Scanner;

public class P08Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int classYear = 1;
        double sumGrade = 0;
        int timesExpeled = 0;




        while (classYear <= 12){
            if (timesExpeled > 1) {
                System.out.printf("%s has been excluded at %d grade" , studentName , classYear);
                return;
            }
        double grade = Double.parseDouble(scanner.nextLine());

        if (grade < 4){
            timesExpeled++;
            continue;
        }
        sumGrade += grade;
        classYear++;
        }

        double averageGrade = sumGrade / 12 ;
            System.out.printf("%s graduated. Average grade: %.2f\n", studentName , averageGrade);
    }
}
