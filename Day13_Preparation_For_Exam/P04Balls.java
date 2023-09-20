package Day13_Preparation_For_Exam;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ballsCount = Integer.parseInt(scanner.nextLine());

        int ballsPoints = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherBalls = 0;

        for (int i = 1; i <= ballsCount; i++){
            String ballsColor = scanner.nextLine();

            switch (ballsColor) {
                case "red":
                    ballsPoints += 5;
                    redBalls++;
                    break;
                case "orange":
                    ballsPoints += 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    ballsPoints += 15;
                    yellowBalls++;
                    break;
                case "white":
                    ballsPoints += 20;
                    whiteBalls++;
                    break;
                case "black":
                    ballsPoints /= 2;
                    blackBalls++;
                    break;
                default:
                    otherBalls++;
                    break;
            }
        }
        System.out.printf("Total points: %d\n", ballsPoints);
        System.out.printf("Red balls: %d\n", redBalls);
        System.out.printf("Orange balls: %d\n", orangeBalls);
        System.out.printf("Yellow balls: %d\n", yellowBalls);
        System.out.printf("White balls: %d\n", whiteBalls);
        System.out.printf("Other colors picked: %d\n", otherBalls);
        System.out.printf("Divides from black balls: %d\n", blackBalls);
    }
}
