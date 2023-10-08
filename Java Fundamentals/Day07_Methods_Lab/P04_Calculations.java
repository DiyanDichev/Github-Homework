package Day07_Methods_Lab;

import java.util.Scanner;

public class P04_Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                    add(firstNumber,secondNumber);
                break;
            case "multiply":
                multiply(firstNumber,secondNumber);
                break;
            case "subtract":
                subtract(firstNumber,secondNumber);
                break;
            case "divide":
                divide(firstNumber,secondNumber);
                break;
        }
    }
    public static void add(int a, int b){
        System.out.println(a + b);
    }
    public static void multiply(int a, int b){
        System.out.println(a * b);
    }
    public static void subtract(int a, int b){
        System.out.println(a - b);
    }
    public static void divide(int a, int b){
        System.out.println(a / b);
    }
}
