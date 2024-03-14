package Day4_Multidimensional_Arrays_Exercise;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int dim = Integer.parseInt(input[0]);
        int rows = dim;
        int cols = dim;

        int[][] matrix = new int[rows][cols];


        switch (input[1]) {
            case "A":
                patternA(matrix);
                break;
            case "B":
                patternB(matrix);
                break;
        }
        printMultiDimArray(matrix);

    }
    public static void printMultiDimArray(int[][] array){
        for (int row = 0; row < array.length; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < array[row].length; col++) {
                sb.append(array[row][col])
                        .append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
    public static void patternA(int[][] matrix) {
        int rows = matrix.length;
        int counter = 1;
        for (int col = 0; col < rows; col++) {
            for (int row = 0; row < rows; row++) {
                matrix[row][col] = counter++;
            }
        }

    }

    public static void patternB(int[][] matrix) {
        int rows = matrix.length;
        int counter = 1;
        for (int col = 0; col < rows; col++) {
            if(col % 2 == 0) {
                for (int row = 0; row < rows; row++) {
                    matrix[row][col] = counter++;
                }
            }else {
                for (int row = rows - 1; row >= 0 ; row--) {
                    matrix[row][col] = counter++;
                }
            }
        }
    }
}
