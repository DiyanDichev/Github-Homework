package Day4_Multidimensional_Arrays_Exercise;

import javax.swing.*;
import java.util.Scanner;

public class P01_Fill_The_Matrix_V2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int dim = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[dim][dim];
        if(pattern.equals("A")) {
            patternA(matrix);
        }else {
            patternB(matrix);
        }

        printMatrix(matrix);


    }

    public static void printMatrix(int matrix[][]){
        for (int [] row : matrix) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
    public static void patternA(int matrix[][]) {
        int dim = matrix.length;
        int counter = 1;
        for (int col = 0; col < dim; col++) {
            for (int row = 0; row < dim; row++) {
                matrix[row][col] = counter++;
            }
        }
    }

    public static void patternB(int matrix[][]) {
        int dim = matrix.length;
        int counter = 1;
        for (int col = 0; col < dim; col++) {
            if(col % 2 == 0){
                for (int row = 0; row < dim; row++) {
                    matrix[row][col] = counter++;
                }
            }else {
                for (int row = dim - 1; row >= 0; row--) {
                    matrix[row][col] = counter++;
                }
            }

        }
    }
}
