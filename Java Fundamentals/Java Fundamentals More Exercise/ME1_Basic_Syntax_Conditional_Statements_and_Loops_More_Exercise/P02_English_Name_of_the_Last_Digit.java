package More_Exercise.ME1_Basic_Syntax_Conditional_Statements_and_Loops_More_Exercise;

import java.util.Scanner;

public class P02_English_Name_of_the_Last_Digit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int lastNumber = number % 10;

        if (lastNumber == 1){
            System.out.print("one");
        } else if (lastNumber == 2) {
            System.out.print("two");
        } else if (lastNumber == 3) {
            System.out.print("three");
        } else if (lastNumber == 4) {
            System.out.print("four");
        } else if (lastNumber == 5) {
            System.out.print("five");
        } else if (lastNumber == 6) {
            System.out.print("six");
        } else if (lastNumber == 7) {
            System.out.print("seven");
        } else if (lastNumber == 8) {
            System.out.print("eight");
        } else if (lastNumber == 9) {
            System.out.print("nine");
        } else if (lastNumber == 0) {
            System.out.print("zero");
        }
    }
}
