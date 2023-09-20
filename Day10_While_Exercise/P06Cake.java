package Day10_While_Exercise;

import java.util.Scanner;

public class P06Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cakeL = Integer.parseInt(scanner.nextLine());
        int cakeH = Integer.parseInt(scanner.nextLine());

        int cakePieces = cakeH * cakeL;

        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int currentCakePieces = Integer.parseInt(input);
            cakePieces -= currentCakePieces ;

            if (cakePieces <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", cakePieces);
        }
    }
}
