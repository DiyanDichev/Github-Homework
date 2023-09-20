package Day3_ConditionalStatements_Lab;

import java.util.Scanner;

public class P04PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        if(inputText.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}
