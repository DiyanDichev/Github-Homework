package ME_3;

import java.util.Scanner;

public class P08PointRectangleBorder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        String print = "";

        if (((x == x1 || x == x2) && (y >= y1 && y <= y2)) ||
                ((y == y1 || y == y2) && (x >= x1 && x <= x2))) {
            print =  "Border";
        }else {
            print = "Inside / Outside";
        }
        System.out.println(print);
    }
}
