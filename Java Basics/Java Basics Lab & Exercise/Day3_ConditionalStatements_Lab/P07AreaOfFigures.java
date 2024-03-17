package Day3_ConditionalStatements_Lab;

import java.util.Scanner;

public class P07AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();

        double area = 0;

        if (shape.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
             area = a * a;

        } else if (shape.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
             area = a * b;

        } else if (shape.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
             area = r * r * Math.PI;

        } else if (shape.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
             area = a * h / 2;
        }
        System.out.printf("%.3f" , area);
    }
}
