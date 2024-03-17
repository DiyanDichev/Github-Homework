package Day9_While_Lab;

import java.util.Scanner;

public class P04Sequence2kPlus1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int к = 1;

        while (к <= n) {
            System.out.println(к);
            к = к * 2 + 1;
        }
    }
}
