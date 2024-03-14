package Day3_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P05_Maximum_Sum_of_2x2_Submatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dim = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[dim[0]][dim[1]];

        for (int row = 0; row < dim[0]; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int sum = Integer.MIN_VALUE;
        int[][] res = new int[2][2];

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int currentSum = matrix[row][col] +
                        matrix[row][col + 1] +
                        matrix[row + 1][col] +
                        matrix[row + 1][col + 1];
                if (currentSum > sum) {
                    sum = currentSum;
                    res[0][0] = matrix[row][col];
                    res[0][1] = matrix[row][col + 1];
                    res[1][0] = matrix[row + 1][col];
                    res[1][1] = matrix[row + 1][col + 1];

                }
            }
        }
        printMultiDimArray(res);
        System.out.println(sum);
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
}
