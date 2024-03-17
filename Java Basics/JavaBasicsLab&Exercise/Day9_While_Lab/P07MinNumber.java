package Day9_While_Lab;

import java.util.Scanner;

public class P07MinNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numMin = Integer.MAX_VALUE;

        while (!input.equals("Stop")) {
            int  number = Integer.parseInt(input);

            if (numMin > number){
                numMin = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(numMin);
    }
}
