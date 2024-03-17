package Day07_Methods_Lab;

import java.util.Scanner;

public class P02_Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printGrade(grade);
    }
    public static void printGrade (double number){

        if(number <= 6.00 && number >= 5.50){
            System.out.printf("Excellent\n", number);
        }else if (number <= 5.49 && number >= 4.50) {
            System.out.printf("Very good\n", number);
        }else if (number <= 4.49 && number >= 3.50) {
            System.out.printf("Good\n", number);
        }else if (number <= 3.49 && number >= 3.00) {
            System.out.printf("Poor\n", number);
        }else if (number <= 2.99 && number >= 2.00) {
            System.out.printf("Fail\n", number);
        }
    }
}
