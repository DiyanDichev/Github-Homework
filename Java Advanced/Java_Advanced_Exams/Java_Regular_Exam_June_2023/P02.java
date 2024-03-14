package Java_Advanced_Exams.Java_Regular_Exam_June_2023;

import java.util.Scanner;

public class P02 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] dimensions = scanner.nextLine()
                    .split(",", -1);

            int[] dimentions = new int[dimensions.length];
            for (int i = 0; i < dimensions.length; i++) {
                dimentions[i] = Integer.parseInt(dimensions[i]);
            }

            String[][] cupboard = new String[dimentions[0]][dimentions[1]];
            int mouseRow = -1;
            int mouseCol = -1;
            int totalCheeseNumber = 0;

            for (int i = 0; i < cupboard.length; i++) {
                String newRow = scanner.nextLine();
                for (int j = 0; j < cupboard[i].length; j++) {
                    cupboard[i][j] = String.valueOf(newRow.charAt(j));

                    if (newRow.charAt(j) == 'M') {
                        mouseRow = i;
                        mouseCol = j;
                        cupboard[mouseRow][mouseCol] = "*";
                    }
                    if (cupboard[i][j].equals("C")) {
                        totalCheeseNumber++;
                    }
                }
            }
            String command;
            while (!(command = scanner.nextLine()).equals("danger")) {
                if ((command.equals("left") && mouseCol == 0) ||
                        (command.equals("right") && mouseCol == cupboard[0].length - 1) ||
                        (command.equals("up") && mouseRow == 0) ||
                        (command.equals("down") && mouseRow == cupboard.length - 1)) {
                    System.out.println("No more cheese for tonight!");
                    break;
                } else {
                    if ((command.equals("left") && cupboard[mouseRow][mouseCol - 1].equals("@")) ||
                            (command.equals("right") && cupboard[mouseRow][mouseCol + 1].equals("@")) ||
                            (command.equals("up") && cupboard[mouseRow - 1][mouseCol].equals("@")) ||
                            (command.equals("down") && cupboard[mouseRow + 1][mouseCol].equals("@"))) {
                        continue;
                    } else {
                        if (command.equals("left")) {
                            mouseCol--;
                        } else if (command.equals("right")) {
                            mouseCol++;
                        } else if (command.equals("up")) {
                            mouseRow--;
                        } else if (command.equals("down")) {
                            mouseRow++;
                        }

                        if (cupboard[mouseRow][mouseCol].equals("C")) {
                            totalCheeseNumber--;
                            cupboard[mouseRow][mouseCol] = "*";
                            if (totalCheeseNumber == 0) {
                                cupboard[mouseRow][mouseCol] = "M";
                                System.out.println("Happy mouse! All the cheese is eaten, good night!");
                                break;
                            }
                            continue;
                        }
                        if (cupboard[mouseRow][mouseCol].equals("T")) {
                            System.out.println("Mouse is trapped!");
                            break;
                        }
                    }
                }
            }

            if (command.equals("danger")) {
                System.out.println("Mouse will come back later!");
            }
            cupboard[mouseRow][mouseCol] = "M";

            for (int i = 0; i < cupboard.length; i++) {
                for (int j = 0; j < cupboard[i].length; j++) {
                    System.out.print(cupboard[i][j]);
                }
                System.out.println();
            }
        }
    }