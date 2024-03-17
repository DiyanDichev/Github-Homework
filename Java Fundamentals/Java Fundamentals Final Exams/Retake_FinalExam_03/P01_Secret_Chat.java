package Final_Exams.Retake_FinalExam_03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class P01_Secret_Chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] operator = scanner.nextLine().split(":\\|:");

        while (!operator[0].equals("Reveal")) {

            switch (operator[0]) {
                case ("InsertSpace"):
                    int index = Integer.parseInt(operator[1]);
                    input = input.substring(0,index) + " " + input.substring(index);
                    System.out.println(input);
                    break;
                case ("Reverse"):
                    String textToCheck = operator[1];
                    if (input.contains(textToCheck)) {
                        String revertedText = new StringBuilder(textToCheck).reverse().toString();
                        input = input.replaceFirst(Pattern.quote(textToCheck), "") + revertedText;
                        System.out.println(input);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case ("ChangeAll"):
                    input = input.replace(operator[1], operator[2]);
                    System.out.println(input);
                    break;
            }
            operator = scanner.nextLine().split(":\\|:");
        }
        System.out.printf("You have a new text message: %s", input);
    }
}
