package Java_Advanced_Exams.Retake_Exam_April_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_TheSquirrel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dim = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(", ");

        String[][] matrix = new String[dim][dim];
        int squirrelRowIndx = 0;
        int squirrelColIndx = 0;
        for (int row = 0; row < dim; row++) {
            List<String> matrixInput = Arrays.stream(scanner.nextLine()
                            .split(""))
                    .collect(Collectors.toList());
            for (int col = 0; col < dim; col++) {
                matrix[row][col] = matrixInput.get(col);
                if (matrixInput.get(col).equals("s")) {
                    squirrelRowIndx = row;
                    squirrelColIndx = col;
                    matrix[row][col] = "*";
                }
            }
        }
        int hazelnut = 0;

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals("up") && squirrelRowIndx == 0 ||
                    commands[i].equals("down") && squirrelRowIndx == dim-1 ||
                    commands[i].equals("left") && squirrelColIndx == 0 ||
                    commands[i].equals("right") && squirrelColIndx == dim-1) {
                System.out.println("The squirrel is out of the field.");
                break;
            }
            if (commands[i].equals("up") && matrix[squirrelRowIndx - 1][squirrelColIndx].equals("t") ||
                    commands[i].equals("down") && matrix[squirrelRowIndx + 1][squirrelColIndx].equals("t") ||
                    commands[i].equals("left") && matrix[squirrelRowIndx][squirrelColIndx - 1].equals("t") ||
                    commands[i].equals("right") && matrix[squirrelRowIndx][squirrelColIndx + 1].equals("t")) {
                System.out.println("Unfortunately, the squirrel stepped on a trap...");
                break;
            }

            if (commands[i].equals("up") && matrix[squirrelRowIndx - 1][squirrelColIndx].equals("h") ||
                    commands[i].equals("down") && matrix[squirrelRowIndx + 1][squirrelColIndx].equals("h") ||
                    commands[i].equals("left") && matrix[squirrelRowIndx][squirrelColIndx - 1].equals("h") ||
                    commands[i].equals("right") && matrix[squirrelRowIndx][squirrelColIndx + 1].equals("h")) {
                hazelnut++;
                if(commands[i].equals("up")){
                    matrix[squirrelRowIndx -1][squirrelColIndx] = "*";
                } else if(commands[i].equals("down")){
                    matrix[squirrelRowIndx +1][squirrelColIndx] = "*";
                } else if(commands[i].equals("left")){
                    matrix[squirrelRowIndx][squirrelColIndx -1] = "*";
                } else if(commands[i].equals("right")){
                    matrix[squirrelRowIndx][squirrelColIndx +1] = "*";
                }
            }
            if (commands[i].equals("up")) {
                squirrelRowIndx--;
            } else if (commands[i].equals("down")) {
                squirrelRowIndx++;
            } else if (commands[i].equals("left")) {
                squirrelColIndx--;
            } else if (commands[i].equals("right")) {
                squirrelColIndx++;
            }
            if (hazelnut == 3) {
                System.out.println("Good job! You have collected all hazelnuts!");
                break;
            }
            if(i == commands.length - 1){
                System.out.println("There are more hazelnuts to collect.");
            }
        }
        System.out.printf("Hazelnuts collected: %d",hazelnut);
    }
}