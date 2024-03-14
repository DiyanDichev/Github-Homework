package Java_Advanced_Exams.Regular_Exam_October_2023;

import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] fishingArea = new char[size][size];

        fillFishingArea(scanner, size, fishingArea);

        int[] currentPosition = findStartingPosition(size, fishingArea);
        int quota = 0;
        boolean whirlpool = false;

        String command;
        while (!(command = scanner.nextLine()).equals("collect the nets")) {
            assert currentPosition != null;
            move(command, currentPosition, fishingArea);
            handleBoundaries(currentPosition, size);

            char currentChar = fishingArea[currentPosition[0]][currentPosition[1]];
            if (Character.isDigit(currentChar)) {
                quota += Character.getNumericValue(currentChar);
            } else if (currentChar == 'W') {
                handleWhirlpool(currentPosition);
                whirlpool = true;
                quota = 0;
                break;
            }
            fishingArea[currentPosition[0]][currentPosition[1]] = 'S';
        }
        handleResults(quota, whirlpool, fishingArea);
    }

    private static void fillFishingArea(Scanner scanner, int size, char[][] fishingArea) {
        for (int i = 0; i < size; i++) {
            fishingArea[i] = scanner.nextLine().toCharArray();
        }
    }

    private static int[] findStartingPosition(int size, char[][] fishingArea) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (fishingArea[i][j] == 'S') {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    private static void move(String command, int[] position, char[][] fishingArea) {

        int row = position[0];
        int col = position[1];

        fishingArea[row][col] = '-';
        switch (command) {
            case "up":
                position[0]--;
                break;
            case "down":
                position[0]++;
                break;
            case "left":
                position[1]--;
                break;
            case "right":
                position[1]++;
                break;
        }
    }

    private static void handleBoundaries(int[] position, int size) {
        for (int i = 0; i < 2; i++) {
            if (position[i] < 0) position[i] = size - 1;
            else if (position[i] >= size) position[i] = 0;
        }
    }

    private static void handleWhirlpool(int[] position) {
        System.out.println("You fell into a whirlpool! The ship sank and you lost the fish you caught. " +
                "Last coordinates of the ship: [" + position[0] + "," + position[1] + "]");
    }

    private static void handleResults(int quota, boolean whirlpool, char[][] fishingArea) {
        if (quota >= 20) {
            System.out.println("Success! You managed to reach the quota!");
        } else if (!whirlpool) {
            int lack = 20 - quota;
            System.out.printf("You didn't catch enough fish and didn't reach the quota! You need %d tons of fish more.%n", lack);
        }

        if (quota > 0) {
            System.out.printf("Amount of fish caught: %d tons.%n", quota);
        }

        if (!whirlpool) {
            for (char[] chars : fishingArea) {
                System.out.println(chars);
            }
        }
    }
}
