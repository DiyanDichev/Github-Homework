package Day3_Multidimensional_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01_P01_Compare_Matrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] dimensionsFirst = readInputAsArray(scanner);
        int firstRows = dimensionsFirst[0];
        int firstCols = dimensionsFirst[1];

        int[][] firstArray = new int[firstRows][firstCols];

        for (int row = 0; row < firstRows; row++) {
            firstArray[row] = readInputAsArray(scanner);
        }
        int[] dimensionsSecond = readInputAsArray(scanner);

        int secondRows = dimensionsSecond[0];
        int secondCols = dimensionsSecond[1];

        int[][] secondArray = new int[secondRows][secondCols];

        for (int row = 0; row < firstRows; row++) {
            secondArray[row] = readInputAsArray(scanner);
        }

        if(!areEquals(dimensionsFirst,dimensionsSecond)){
            System.out.println("not equal");
            return;
        }
        for (int i = 0; i < firstRows; i++) {
            if(!areEquals(firstArray[i],secondArray[i])){
                System.out.println("not equal");
                return;
            }
        }
        System.out.println("equal");
    }

    public static boolean areEquals(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) return  false;

        boolean areEqual = true;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                areEqual = false;
                break;
            }
        }
        return areEqual;
    }
    public static int[] readInputAsArray(Scanner scanner){
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
