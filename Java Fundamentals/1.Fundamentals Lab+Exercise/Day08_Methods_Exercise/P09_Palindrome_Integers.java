package Day08_Methods_Exercise;

import java.util.Scanner;

public class P09_Palindrome_Integers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            backwardInput(input);
            print(input);

            input = scanner.nextLine();
        }
    }
    public static boolean backwardInput (String input){
        String backwardInput = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            backwardInput += input.charAt(i);;
        }
        return input.equals(backwardInput);
    }
    public static void print(String input){
        System.out.println(backwardInput(input));
    }
}
