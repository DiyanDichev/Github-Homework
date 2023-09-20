package Day9_While_Lab;

import java.util.Scanner;

public class P06MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numMax = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {
            int  number = Integer.parseInt(input);

            if (numMax< number){
                numMax = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(numMax);
    }
}
