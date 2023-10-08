package Day3_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class P04_Town_Info {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int square = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", town, population, square);
    }
}
