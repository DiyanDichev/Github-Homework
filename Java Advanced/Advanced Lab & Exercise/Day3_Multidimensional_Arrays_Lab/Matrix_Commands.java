package Day3_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Commands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = 4; //общ брой на редовете в матрицата
        int cols = 4; //общ брой на колони в матрицата
        //1. Какво е матрица?
        int [][] matrix = new int[rows][cols];
        //2. Как се чете матрица?
        //вариант 1 -> вложен for цикли
        for (int row = 0; row < rows; row++) { //обхожда редовете
            for (int col = 0; col < cols; col++) { //обхожда колоните
                matrix[row][col] = scanner.nextInt();
            }
        }
        //вариант 2 -> streamAPI
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine()
                            .split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        //вариант 3 -> for loop
        for (int row = 0; row < rows; row++) {
            String [] input = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix [row][col]= Integer.parseInt(input[col]);
            }
        }

        //3. Как се отпечатва матрица?
        //вариант 1 -> foreach
        for (int [] row : matrix) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        //вариант 2 -> for loop
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols ; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        //4. Движения в матрица
        //нагоре -> ред - 1
        //надолу -> ред + 1
        //дясно -> колона + 1
        //ляво-> колона - 1


        //5. Валидиране на индекси
        //колона -> колона >= 0 и колона < брой колони
        //ред -> ред >= 0 и ред < брой редове
    }
    private static boolean validateCommand(String[] commandParts, int rows, int cols) {
        if (commandParts.length != 5) {
            return false;
        }
        if (!"swap".equals(commandParts[0])) {
            return false;
        }

        int rowFirstElement = Integer.parseInt(commandParts[1]);
        int colFirstElement = Integer.parseInt(commandParts[2]);
        int rowSecondElement = Integer.parseInt(commandParts[3]);
        int colSecondElement = Integer.parseInt(commandParts[4]);

        if (rowFirstElement >= 0 && rowFirstElement < rows && rowSecondElement >= 0 && rowSecondElement < rows
                && colFirstElement >= 0 && colFirstElement < cols && colSecondElement >= 0 && colSecondElement < cols) {
            return true;
        }else {
            return false;
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }

}