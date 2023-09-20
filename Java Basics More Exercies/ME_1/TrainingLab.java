package ME_1;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double wide = Double.parseDouble(scanner.nextLine());

        double lengthInCm = length * 100;
        double wideInCm = (wide * 100) - 100;

        double workingPlacesWide = Math.floor(wideInCm / 70);
        double workingPlacesLength = Math.floor(lengthInCm / 120);
        double workingPlacesCount = workingPlacesWide * workingPlacesLength - 3;

        System.out.printf("%.0f" , workingPlacesCount);
    }
}