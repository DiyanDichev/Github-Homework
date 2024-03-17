package Java_Advanced_Exams.Regular_Exam_October_2023;

import java.util.Arrays;
import java.util.Scanner;

public class P02_Fishing_Competition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dim = Integer.parseInt(scanner.nextLine());
        int rows = dim;
        int cols = dim;

        String[][] matrix = new String[rows][cols];

        fillMatrix(matrix, scanner);

        String coordinates = shipLocation(matrix);
        int[] coords = Arrays.stream(coordinates.split(" ")).mapToInt(Integer::parseInt).toArray();
        int shipRowIndx = coords[0];
        int shipColIndx = coords[1];

        int totalFishLoad = 0;
        String command = scanner.nextLine();

        while (!"collect the nets".equals(command)) {

            switch (command) {
                case "up":
                    if (shipRowIndx != 0) {
                        String charToKeep = matrix[shipRowIndx - 1][shipColIndx];
                        if (charToKeep.equals("W")) {
                            shipRowIndx--;
                            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                                    " Last coordinates of the ship: [%d,%d]\n",shipRowIndx,shipColIndx);
                            return;
                        }
                        if (Character.isDigit(charToKeep.charAt(0))) {
                            totalFishLoad += Integer.parseInt(charToKeep);
                            charToKeep = "-";
                        }
                        matrix[shipRowIndx - 1][shipColIndx] = "S";
                        matrix[shipRowIndx][shipColIndx] = charToKeep;
                        shipRowIndx--;
                    } else {
                        String charToKeep = matrix[matrix.length - 1][shipColIndx];
                        if (charToKeep.equals("W")) {
                            shipRowIndx = matrix.length - 1;
                            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                                    " Last coordinates of the ship: [%d,%d]\n",shipRowIndx,shipColIndx);
                            return;
                        }
                        if (Character.isDigit(charToKeep.charAt(0))) {
                            totalFishLoad += Integer.parseInt(charToKeep);
                            charToKeep = "-";
                        }
                        matrix[matrix.length - 1][shipColIndx] = "S";
                        matrix[shipRowIndx][shipColIndx] = charToKeep;
                        shipRowIndx = matrix.length - 1;
                    }
                    break;
                case "down":
                    if (shipRowIndx != matrix.length - 1) {
                        String charToKeep = matrix[shipRowIndx + 1][shipColIndx];
                        if (charToKeep.equals("W")) {
                            shipRowIndx++;
                            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                                    " Last coordinates of the ship: [%d,%d]\n",shipRowIndx,shipColIndx);
                            return;
                        }
                        if (Character.isDigit(charToKeep.charAt(0))) {
                            totalFishLoad += Integer.parseInt(charToKeep);
                            charToKeep = "-";
                        }
                        matrix[shipRowIndx + 1][shipColIndx] = "S";
                        matrix[shipRowIndx][shipColIndx] = charToKeep;
                        shipRowIndx++;
                    } else {
                        String charToKeep = matrix[0][shipColIndx];
                        if (charToKeep.equals("W")) {
                            shipRowIndx = 0;
                            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                                    " Last coordinates of the ship: [%d,%d]\n",shipRowIndx,shipColIndx);
                            return;
                        }
                        if (Character.isDigit(charToKeep.charAt(0))) {
                            totalFishLoad += Integer.parseInt(charToKeep);
                            charToKeep = "-";
                        }
                        matrix[0][shipColIndx] = "S";
                        matrix[shipRowIndx][shipColIndx] = charToKeep;
                        shipRowIndx = 0;
                    }
                    break;
                case "left":
                    if (shipColIndx != 0) {
                        String charToKeep = matrix[shipRowIndx][shipColIndx - 1];
                        if (charToKeep.equals("W")) {
                            shipColIndx--;
                            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                                    " Last coordinates of the ship: [%d,%d]\n",shipRowIndx,shipColIndx);
                            return;
                        }
                        if (Character.isDigit(charToKeep.charAt(0))) {
                            totalFishLoad += Integer.parseInt(charToKeep);
                            charToKeep = "-";
                        }
                        matrix[shipRowIndx][shipColIndx - 1] = "S";
                        matrix[shipRowIndx][shipColIndx] = charToKeep;
                        shipColIndx--;
                    } else {
                        String charToKeep = matrix[shipRowIndx][matrix.length - 1];
                        if (charToKeep.equals("W")) {
                            shipColIndx = matrix.length - 1;
                            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                                    " Last coordinates of the ship: [%d,%d]\n",shipRowIndx,shipColIndx);
                            return;
                        }
                        if (Character.isDigit(charToKeep.charAt(0))) {
                            totalFishLoad += Integer.parseInt(charToKeep);
                            charToKeep = "-";
                        }
                        matrix[shipRowIndx][matrix.length - 1] = "S";
                        matrix[shipRowIndx][shipColIndx] = charToKeep;
                        shipColIndx = matrix.length - 1;
                    }
                    break;
                case "right":
                    if (shipColIndx != matrix.length - 1) {
                        String charToKeep = matrix[shipRowIndx][shipColIndx + 1];
                        if (charToKeep.equals("W")) {
                            shipColIndx++;
                            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                                    " Last coordinates of the ship: [%d,%d]\n",shipRowIndx,shipColIndx);
                            return;
                        }
                        if (Character.isDigit(charToKeep.charAt(0))) {
                            totalFishLoad += Integer.parseInt(charToKeep);
                            charToKeep = "-";
                        }
                        matrix[shipRowIndx][shipColIndx + 1] = "S";
                        matrix[shipRowIndx][shipColIndx] = charToKeep;
                        shipColIndx++;
                    } else {
                        String charToKeep = matrix[shipRowIndx][0];
                        if (charToKeep.equals("W")) {
                            shipColIndx = 0;
                            System.out.printf("You fell into a whirlpool! The ship sank and you lost the fish you caught." +
                                    " Last coordinates of the ship: [%d,%d]\n",shipRowIndx,shipColIndx);
                            return;
                        }
                        if (Character.isDigit(charToKeep.charAt(0))) {
                            totalFishLoad += Integer.parseInt(charToKeep);
                            charToKeep = "-";
                        }
                        matrix[shipRowIndx][0] = "S";
                        matrix[shipRowIndx][shipColIndx] = charToKeep;
                        shipColIndx = 0;
                    }
                    break;

            }
            command = scanner.nextLine();
        }
        if (totalFishLoad >= 20) {
            System.out.println("Success! You managed to reach the quota!");
            System.out.printf("Amount of fish caught: %d tons.\n", totalFishLoad);
        } else {
            System.out.printf("You didn't catch enough fish and didn't reach the quota! You need %d tons of fish more.\n", 20 - totalFishLoad);
            System.out.printf("Amount of fish caught: %d tons.\n", totalFishLoad);
        }

        printMatrix(matrix);
    }
    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    private static String shipLocation(String[][] matrix) {
        int rows = matrix.length;
        int rowIndx = 0;
        int colIndx = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < rows; col++) {
                if (matrix[row][col].equals("S")) {
                    rowIndx = row;
                    colIndx = col;
                }
            }
        }
        String coordinates = String.valueOf(rowIndx) + " " + String.valueOf(colIndx);
        return coordinates;

    }

    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("");
        }
    }
}
