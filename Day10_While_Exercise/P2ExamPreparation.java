package Day10_While_Exercise;

import java.util.Scanner;

public class P2ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int failedTasksAvailability = Integer.parseInt(scanner.nextLine());
        String taskName = scanner.nextLine();

        int failedTasks = 0;
        int tasks = 0;
        double totalGrades = 0.00;
        String lastProblem = "";

        while (!taskName.equals("Enough")){
            int mark = Integer.parseInt(scanner.nextLine());
            tasks++;
            totalGrades += mark;

            if (mark <= 4){
                failedTasks++;
                if (failedTasks == failedTasksAvailability){
                    System.out.printf("You need a break, %d poor grades." , failedTasks);
                    return;
                }
            }
            lastProblem = taskName;

            taskName = scanner.nextLine();
        }

        double averageScore = totalGrades / tasks;

        System.out.printf("Average score: %.2f\n" , averageScore );
        System.out.printf("Number of problems: %d\n" , tasks );
        System.out.printf("Last problem: %s" , lastProblem);
    }
}
