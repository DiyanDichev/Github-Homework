package Day02_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int i = userName.length() -1; i >= 0; i--){
            char currentSymbol = userName.charAt(i);
            password += currentSymbol;
        }

        int counter = 0;
        String enteredPassword = scanner.nextLine();

        while (!enteredPassword.equals(password)){
            counter ++;
            if (counter == 4){
                System.out.printf("User %s blocked!", userName);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        System.out.printf("User %s logged in.",userName);
    }
}