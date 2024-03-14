package Java_Advanced_Exams.Java_Regular_Exam_June_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_MouseInTheKitchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dim = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dim[0];
        int cols = dim[1];
        int cheeseCount = 0;
        int mouseRowIndx = 0;
        int mouseColIndx = 0;

        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            List<String> firstRow = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
            for (int col = 0; col < cols; col++) {
                for (int i = 0; i < firstRow.size(); ) {
                    matrix[row][col] = firstRow.get(i);
                    if (firstRow.get(i).equals("C")) {
                        cheeseCount++;
                    }
                    if (firstRow.get(i).equals("M")) {
                        mouseRowIndx = row;
                        mouseColIndx = col;
                    }
                    firstRow.remove(i);
                    break;
                }
            }
        }
        String command = scanner.nextLine();
        while (!"danger".equals(command)) {
            if (cheeseCount == 0) {
                System.out.println("Happy mouse! All the cheese is eaten, good night!");
                printHappy(matrix);
                return;
            }
            switch (command) {
                case "up":
                    if (mouseRowIndx != 0) {
                        String charToKeep = matrix[mouseRowIndx - 1][mouseColIndx];
                        if (charToKeep.equals("T")) {
                            matrix[mouseRowIndx][mouseColIndx] = "*";
                            mouseRowIndx--;
                            matrix[mouseRowIndx][mouseColIndx] = "M";
                            printTrap(matrix);
                            return;
                        } else if (charToKeep.equals("C")) {
                            cheeseCount--;
                        } else if (charToKeep.equals("@")) {
                            break;
                        }
                        matrix[mouseRowIndx][mouseColIndx] = "*";
                        mouseRowIndx--;
                        matrix[mouseRowIndx][mouseColIndx] = "M";
                    } else {
                        printCatch(matrix);
                        return;
                    }
                    break;
                case "down":
                    if (mouseRowIndx != dim[0]-1) {
                        String charToKeep = matrix[mouseRowIndx + 1][mouseColIndx];
                        if (charToKeep.equals("T")) {
                            matrix[mouseRowIndx][mouseColIndx] = "*";
                            mouseRowIndx++;
                            matrix[mouseRowIndx][mouseColIndx] = "M";
                            printTrap(matrix);
                            return;
                        } else if (charToKeep.equals("C")) {
                            cheeseCount--;
                        } else if (charToKeep.equals("@")) {
                            break;
                        }
                        matrix[mouseRowIndx][mouseColIndx] = "*";
                        mouseRowIndx++;
                        matrix[mouseRowIndx][mouseColIndx] = "M";
                    } else {
                        printCatch(matrix);
                        return;
                    }
                    break;
                case "right":
                    if (mouseColIndx != dim[1]-1) {
                        String charToKeep = matrix[mouseRowIndx][mouseColIndx + 1];
                        if (charToKeep.equals("T")) {
                            matrix[mouseRowIndx][mouseColIndx] = "*";
                            mouseColIndx++;
                            matrix[mouseRowIndx][mouseColIndx] = "M";
                            printTrap(matrix);
                            return;
                        } else if (charToKeep.equals("C")) {
                            cheeseCount--;
                        } else if (charToKeep.equals("@")) {
                            break;
                        }
                        matrix[mouseRowIndx][mouseColIndx] = "*";
                        mouseColIndx++;
                        matrix[mouseRowIndx][mouseColIndx] = "M";
                    } else {
                        printCatch(matrix);
                        return;
                    }
                    break;
                case "left":
                    if (mouseColIndx != 0) {
                        String charToKeep = matrix[mouseRowIndx][mouseColIndx - 1];
                        if (charToKeep.equals("T")) {
                            matrix[mouseRowIndx][mouseColIndx] = "*";
                            mouseColIndx--;
                            matrix[mouseRowIndx][mouseColIndx] = "M";
                            printTrap(matrix);
                            return;
                        } else if (charToKeep.equals("C")) {
                            cheeseCount--;
                        } else if (charToKeep.equals("@")) {
                            break;
                        }
                        matrix[mouseRowIndx][mouseColIndx] = "*";
                        mouseColIndx--;
                        matrix[mouseRowIndx][mouseColIndx] = "M";
                    } else {
                        printCatch(matrix);
                        return;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Mouse will come back later!");
        printHappy(matrix);
    }

    private static void printTrap(String[][] matrix) {
        System.out.println("Mouse is trapped!");
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }

    private static void printCatch(String[][] matrix) {
        System.out.println("No more cheese for tonight!");
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
    private static void printHappy(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
    //private static void fillMatrix(String[][] matrix, int[] dim, Scanner scanner) {
    //    int rows = dim[0];
    //    int cols = dim[1];
    //    for (int row = 0; row < rows; row++) {
    //        List<String> firstRow = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());
    //        for (int col = 0; col < cols; col++) {
    //            for (int i = 0; i < firstRow.size();) {
    //                matrix[row][col] = firstRow.get(i);
    //                //if(firstRow.get(i).equals("C")){
    //                //    cheeseCount++;
    //                //}
    //                firstRow.remove(i);
    //                break;
    //            }
    //        }
    //    }
    //}
}
