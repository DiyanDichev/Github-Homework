package Day04_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class P05_Print_Part_Of_ASCII_Table {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int lastNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <= lastNumber; i++){
            char asciiSymbol = (char) i;
            System.out.print(asciiSymbol + " ");
        }
    }
}
