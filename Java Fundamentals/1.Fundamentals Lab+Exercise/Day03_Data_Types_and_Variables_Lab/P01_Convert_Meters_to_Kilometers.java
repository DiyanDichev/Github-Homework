package Day03_Data_Types_and_Variables_Lab;


import java.util.Scanner;

public class P01_Convert_Meters_to_Kilometers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());

        double kilometers = meters * 1.0 / 1000;

        System.out.printf("%.2f",kilometers);
    }
}
