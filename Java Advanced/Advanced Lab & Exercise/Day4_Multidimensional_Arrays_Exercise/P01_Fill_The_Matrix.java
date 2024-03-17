package Day4_Multidimensional_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Fill_The_Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] params = scanner.nextLine().split(", ");
        int dim = Integer.parseInt(params[0]);
        String pattern = params[1];

        int[][] matrix = new int[dim][dim];
        if(pattern.equals("A")) {
            patternA(matrix);
        }else {
            patternB(matrix);
        }
        printMultiDimArray(matrix);
    }

    public static void patternA(int[][] array){
        int dim = array.length;
        int num = 1;
        for (int col = 0; col < dim; col++) {
            for (int row = 0; row < dim; row++) {
                array[row][col] = num++;
            }
        }
    }

    public static void patternB(int[][] matrix){
        int dim = matrix.length;
        int num = 1;
        for (int col = 0; col < dim; col++) {
            if(col % 2 == 0){
                for (int row = 0; row < dim; row++) {
                    matrix[row][col] = num++;
                }
            }else {
                for (int row = dim - 1;row >= 0; row--) {
                    matrix[row][col] = num++;
                }
            }
        }
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
    public static void printMultiDimArrayV2(int[][] array) {
        for (int row = 0; row < array.length; row++) {

            System.out.println(
                    Arrays.toString(array[row])
                            .replaceAll("[\\[\\],]", ""));
        }
    }
}
