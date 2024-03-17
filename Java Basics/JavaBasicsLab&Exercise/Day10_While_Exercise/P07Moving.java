package Day10_While_Exercise;

import java.util.Scanner;

public class P07Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wight = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int freeSpace = wight * length * height;

        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            int packages = Integer.parseInt(input);
            freeSpace -= packages;

            if (freeSpace < 0){
                System.out.printf("No more free space! You need %d Cubic meters more." , Math.abs(freeSpace));
                break;
            }
            input = scanner.nextLine();
        }
        if (freeSpace >= 0){
            System.out.printf("%d Cubic meters left." , freeSpace);
        }
    }
}
