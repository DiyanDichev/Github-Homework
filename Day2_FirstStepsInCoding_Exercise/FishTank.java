package Day2_FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double volumeInCm = length * width * height;
        double volumeInLitters = volumeInCm / 1000;
        double takenSpace = volumeInLitters * (percent / 100.0);
        System.out.println(volumeInLitters - takenSpace);
    }
}

