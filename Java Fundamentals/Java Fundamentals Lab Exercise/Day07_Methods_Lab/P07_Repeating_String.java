package Day07_Methods_Lab;

import java.util.Scanner;

public class P07_Repeating_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        String result = repeatString(text, count);

        System.out.println(result);
    }

    public static String repeatString(String text, int count) {
        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = text;
        }
        return String.join("", result);
    }
}