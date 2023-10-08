package Day08_Methods_Exercise;

import java.util.Scanner;

public class P04_Password_Validator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password:");
        String input = scanner.nextLine();
        scanner.close();

        if (isLengthValid(input) && hasOnlyLettersAndDigits(input) && hasAtLeastTwoDigits(input)) {
            System.out.println("Password is valid");
        }
    }


    private static boolean isLengthValid(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }


    private static boolean hasOnlyLettersAndDigits(String password) {
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }


    private static boolean hasAtLeastTwoDigits(String password) {
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        if (digitCount >= 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }
}