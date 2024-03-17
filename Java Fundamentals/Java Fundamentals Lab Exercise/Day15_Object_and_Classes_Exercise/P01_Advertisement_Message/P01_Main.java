package Day15_Object_and_Classes_Exercise.P01_Advertisement_Message;

import java.util.*;

public class P01_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        P01_Advertisement_Message message = new P01_Advertisement_Message();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String output = message.randomMessage();
            System.out.println(output);
        }
    }
}
