package Day4_Multidimensional_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P02_Matrix_of_Palindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, dimensions);
        printMatrix(matrix);


    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
    private static void fillMatrix(String[][] matrix, int[] dimensions) {
        int rows = dimensions[0];
        int cols = dimensions[1];
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                int ASCII = 97;
                char letter1 = (char) (ASCII + row);
                char letter2 = (char) (ASCII + row + col);
                matrix[row][col] = String.valueOf(letter1) + String.valueOf(letter2) + String.valueOf(letter1);
            }
        }
    }
}
