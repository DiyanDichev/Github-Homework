package More_Exercise.ME8_Text_Processing_More_Exercise;

import java.util.Scanner;

public class P01_Extract_Person_Information {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int inxBeforeName = input.indexOf('@');
            int inxAfterName = input.indexOf('|');
            String name = input.substring(inxBeforeName +1, inxAfterName);

            int inxBeforeAge = input.indexOf('#');
            int inxAfterAge = input.indexOf('*');
            String age = input.substring(inxBeforeAge +1, inxAfterAge);

            System.out.printf("%s is %s years old.\n", name, age);
        }
    }
}
