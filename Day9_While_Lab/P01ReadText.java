package Day9_While_Lab;

import java.util.Scanner;

public class P01ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while(!input.equals("Stop")) {
            System.out.println(input);
            input = scanner.nextLine();
        }

    }
}
