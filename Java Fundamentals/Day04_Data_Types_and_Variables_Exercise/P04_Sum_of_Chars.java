package Day04_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class P04_Sum_of_Chars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countSymbols = Integer.parseInt(scanner.nextLine());

        int sumOfSymbols = 0;
        for (int i = 1; i <= countSymbols; i++){
            char symbol = scanner.nextLine().charAt(0);
            sumOfSymbols += symbol;
        }
        System.out.printf("The sum equals: %d", sumOfSymbols);
    }
}
