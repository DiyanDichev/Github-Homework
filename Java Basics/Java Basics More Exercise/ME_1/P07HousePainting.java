package ME_1;

import java.util.Scanner;

public class P07HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double houseHeight = Double.parseDouble(scanner.nextLine());
        double houseWide = Double.parseDouble(scanner.nextLine());
        double houseRoof = Double.parseDouble(scanner.nextLine());

        double sideWalls =  (2 *(houseHeight * houseWide)) - (2 * (1.5 * 1.5));
        double frontWalls = 2 * houseHeight * houseHeight - (1.2 * 2.0);
        double wallsSize = sideWalls + frontWalls;
        double greenPaint = wallsSize / 3.4;

        double roofWide = 2 * (houseHeight * houseWide);
        double roofHeight = 2 * (houseHeight * houseRoof / 2);
        double roofSize = roofWide + roofHeight;
        double redPaint = roofSize / 4.3;

        System.out.printf("%.2f" , greenPaint);
        System.out.println();
        System.out.printf("%.2f" , redPaint);
    }
}
