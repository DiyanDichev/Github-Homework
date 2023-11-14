package Final_Exams.FinalExam_04;

import java.util.Scanner;

public class P01_Password_Reset {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("Done")) {
            switch (command[0]) {
                case "TakeOdd":
                    String temporaryString = "";
                    for (int i = 1; i <= input.length() - 1; i += 2) {
                        temporaryString += input.charAt(i);
                    }
                    input = temporaryString;
                    System.out.println(input);
                    break;
                case "Cut":
                    int index = Integer.parseInt(command[1]);
                    int length = Integer.parseInt(command[2]);
                    input = input.substring(0, index) + input.substring(index + length);
                    System.out.println(input);
                    break;
                case "Substitute":
                    if (input.contains(command[1])) {
                        input = input.replaceAll(command[1], command[2]);
                        System.out.println(input);
                    } else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        System.out.printf("Your password is: %s", input);
    }
}
