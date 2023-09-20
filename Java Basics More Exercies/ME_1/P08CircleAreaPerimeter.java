package ME_1;

import java.util.Scanner;

public class P08CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        double circleSize = Math.PI * (radius * radius);
        double circlePerimeter = 2 * (Math.PI * radius);

        System.out.printf("%.2f" , circleSize);
        System.out.println();
        System.out.printf("%.2f" , circlePerimeter);
    }
}
