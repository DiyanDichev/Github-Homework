package Day4_Multidimensional_Arrays_Exercise;

import java.util.*;

public class P06_String_Matrix_Rotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] command = scanner.nextLine().split("\\(");
        String degrees = command[1];
        degrees = degrees.substring(0, degrees.length() - 1);


        String input = scanner.nextLine();
        List<String> inputs = new ArrayList<>();


        while (!"END".equals(input)) {
            inputs.add(input);
            input = scanner.nextLine();
        }

        int longestInput = 0;


        for (int i = 0; i < inputs.size(); i++) {

            if (inputs.get(i).length() > longestInput) {
                longestInput = inputs.get(i).length();
            }
        }
        for (int i = 0; i < inputs.size(); i++) {
            String getString = inputs.get(i);
            if (getString.length() < longestInput) {
                int rotations = longestInput - getString.length();
                for (int j = 0; j < rotations; j++) {
                    getString = getString.substring(0, getString.length()) + " ";
                }
            }
            inputs.remove(i);
            inputs.add(i, getString);
        }


        switch (degrees){
            case "0":
                int rows = inputs.size();
                int cols = longestInput;
                String[][] matrix = new String[rows][cols];
                fillMatrix0(matrix,inputs,longestInput);
                printMatrix(matrix);
                break;
            case "90":
                List<String> rotated90 = new ArrayList<>();
                rotated90(rotated90,inputs);
                int rows90 = longestInput;
                int cols90 = rotated90.size();
                String[][] matrix90 = new String[rows90][cols90];
                fillMatrix90(matrix90,inputs,longestInput,inputs);
                printMatrix(matrix90);
                break;
            //case "180":
            //    List<String> rotated180 = new ArrayList<>();
            //    rotated90(rotated180,inputs);
            //    rotated90(rotated180,inputs);
            //    int rows180 = rotated180.size();
            //    int cols180 = longestInput;
            //    String[][] matrix180 = new String[rows180][cols180];
            //    fillMatrix90(matrix180,inputs,longestInput,inputs);
            //    printMatrix(matrix180);
            //    break;
        }
    }

    private static void rotated90(List<String> rotated90,List<String>inputs) {
        for (int i = inputs.size() - 1; i >= 0; i--) {
            rotated90.add(inputs.get(i));
        }
    }
    private static void fillMatrix90(String[][] matrix90,List<String> rotated90,int longestInput,List<String>inputs){
        int cols = longestInput;
        int forRow90 = 0;
        int forCol90 = 0;
        String rotated = "";
        String rotated1 = "";
        for (int y = 0; y < longestInput; y++){
            for (int i = 0; i < rotated90.size(); i++) {
                rotated += String.valueOf(rotated90.get(i).charAt(0));
                String string = rotated90.get(i);
                string = string.substring(1);
                rotated90.remove(rotated90.get(i));
                rotated90.add(i, string);
            }
            for (int i = rotated.length() -1; i >= 0 ; i--) {
                rotated1+= String.valueOf(rotated.charAt(i));
            }

            for (int i = 0; i <= rotated90.size()-1;) {
                for (int j = 0; j < rotated1.length(); j++) {
                    String currentChar = String.valueOf(rotated1.charAt(j));
                    for (int row = forRow90; row < matrix90.length;) {
                        for (int col = forCol90; col < cols;) {
                            matrix90[row][col] = currentChar;
                            forCol90++;
                            break;
                        }
                        break;
                    }
                }
                forRow90++;
                forCol90 = 0;
                rotated = "";
                rotated1 = "";
                break;
            }
        }

    }


    private static void fillMatrix0 (String[][] matrix,List<String> inputs,int longestInput){
        int rows = inputs.size();
        int cols = longestInput;
        int forRow = 0;
        int forCol = 0;
        for (int i = 0; i < rows; i++) {
            String stringToFill = inputs.get(i);
            for (int j = 0; j < stringToFill.length(); j++) {
                String currentChar = String.valueOf(stringToFill.charAt(j));
                for (int row = forRow; row < matrix.length;) {
                    for (int col = forCol; col < cols;) {
                        matrix[row][col] = currentChar;
                        forCol++;
                        break;
                    }
                    break;
                }
            }
            forRow++;
            forCol = 0;
        }
    }
    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}
