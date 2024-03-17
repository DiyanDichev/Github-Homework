package Day19_Text_Processing_Exercise;

import java.util.Scanner;

public class P07_String_Explosion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder inputHolder = new StringBuilder();

        int explosionPower = 0;
        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            String currentChar = String.valueOf(input.charAt(i));
            if (flag) {
                explosionPower = explosionPower + Integer.parseInt(String.valueOf(input.charAt(i)));
                flag = false;
                explosionPower--;
            } else if (currentChar.equals(">")) {
                flag = true;
                inputHolder.append(currentChar);
            } else if (explosionPower > 0) {
                explosionPower--;
            } else {
                inputHolder.append(currentChar);
            }
        }
        System.out.println(inputHolder);
    }
}
