package Day5_ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class P04PersonalTitles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();

        String title = null;

        if (sex.equals("f")) {
            if (age >= 16) {
                title = "Ms.";
            } else {
                title = "Miss";
            }
        } else if (sex.equals("m")) {
            if (age >= 16) {
                title = "Mr.";
            } else {
                title = "Master";
            }
        }
        if (title != null) {
            System.out.println(title);
        }
    }
}
