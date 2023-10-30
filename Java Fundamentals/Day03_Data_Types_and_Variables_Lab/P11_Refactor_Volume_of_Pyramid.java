package Day03_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class P11_Refactor_Volume_of_Pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        double volume = (length * width * height) / 3;
        System.out.printf("Length: Width: Height: Pyramid Volume: %.2f", volume);
    }
}
