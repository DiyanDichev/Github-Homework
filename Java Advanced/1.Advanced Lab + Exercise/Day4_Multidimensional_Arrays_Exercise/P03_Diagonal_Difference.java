package Day4_Multidimensional_Arrays_Exercise;

import java.util.Scanner;

public class P03_Diagonal_Difference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        fillMatrix(matrix, scanner);

        int sumPrimaryDiagonal = getSumElementsOnPrimaryDiagonal(matrix);
        int sumSecondaryDiagonal = getSumElementsOnSecondaryDiagonal(matrix);

        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));


    }

    private static int getSumElementsOnSecondaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int currentElement = matrix[row][col];
                if(col == matrix.length - row - 1){
                    sum += currentElement;
                }
            }
        }
        return sum;
    }

    private static int getSumElementsOnPrimaryDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int currentElement = matrix[row][col];
                if(row == col){
                    sum += currentElement;
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        int rows = matrix.length;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < rows; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

    }

}
