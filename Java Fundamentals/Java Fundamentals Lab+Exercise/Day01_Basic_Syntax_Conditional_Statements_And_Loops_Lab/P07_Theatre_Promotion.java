package Day01_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P07_Theatre_Promotion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        if (age >=0 && age <=18){
            switch (day){
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("5$");
                    break;
            }
        } else if (age >18 && age <=64) {
            switch (day){
                case "Weekday":
                    System.out.println("18$");
                    break;
                case "Weekend":
                    System.out.println("20$");
                    break;
                case "Holiday":
                    System.out.println("12$");
                    break;
            }
        } else if (age >64 && age <=122) {
            switch (day) {
                case "Weekday":
                    System.out.println("12$");
                    break;
                case "Weekend":
                    System.out.println("15$");
                    break;
                case "Holiday":
                    System.out.println("10$");
                    break;
            }
        } else {
            System.out.println("Error!");
        }
    }
}