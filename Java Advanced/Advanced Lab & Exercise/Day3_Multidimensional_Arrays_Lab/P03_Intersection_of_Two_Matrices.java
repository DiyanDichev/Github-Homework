package Day3_Multidimensional_Arrays_Lab;

import java.util.Scanner;

public class P03_Intersection_of_Two_Matrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] first = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            first[row] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }
        char[][] second = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            second[row] = scanner.nextLine().replaceAll("\\s+", "")
                    .toCharArray();
        }
        char[][] result = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char a = first[row][col];
                char b = second[row][col];
                result[row][col] = a == b ? a : '*';
            }
        }
        printMultiDimArray(result);
    }

    public static void printMultiDimArray(char[][] array){
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
