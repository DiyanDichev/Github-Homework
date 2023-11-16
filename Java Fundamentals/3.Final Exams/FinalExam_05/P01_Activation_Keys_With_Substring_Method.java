package Final_Exams.FinalExam_05;

import java.util.Scanner;

public class P01_Activation_Keys_With_Substring_Method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String activationKey = scanner.nextLine();
        StringBuilder newActivationKey = new StringBuilder(activationKey);

        String[] command = scanner.nextLine().split(">>>");
        while (!command[0].equals("Generate")) {
            String operator = command[0];
            if (operator.equals("Contains")) {
                String substring = command[1];
                if (newActivationKey.toString().contains(substring)) {
                    System.out.printf("%s contains %s%n", newActivationKey, substring);
                } else {
                    System.out.println("Substring not found!");
                }
            } else if (operator.equals("Flip")) {
                String upperOrLower = command[1];
                int startIndex = Integer.parseInt(command[2]);
                int endIndex = Integer.parseInt(command[3]);
                String flippedString = "";
                if (upperOrLower.equals("Upper")) {
                    flippedString = newActivationKey.substring(startIndex,endIndex).toUpperCase();
                } else if (upperOrLower.equals("Lower")) {
                    flippedString = newActivationKey.substring(startIndex, endIndex).toLowerCase();
                }
                newActivationKey.replace(startIndex, endIndex, flippedString);
                System.out.println(newActivationKey);
            } else if (operator.equals("Slice")) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                newActivationKey.delete(startIndex, endIndex);
                System.out.println(newActivationKey);
            }
            command = scanner.nextLine().split(">>>");
        }
        System.out.printf("Your activation key is: %s%n", newActivationKey);
    }
}
