package ME_4_ForLoopMoreExercises;

import java.util.Scanner;

public class P07FootballLeague {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int visitorsCount = Integer.parseInt(scanner.nextLine());

        double visitorsA = 0;
        double visitorsB = 0;
        double visitorsC = 0;
        double visitorsD = 0;

        for ( int i = 1 ; i <= visitorsCount ; i++){
            String visitorsPlace = scanner.nextLine();

            switch (visitorsPlace){
                case "A":
                    visitorsA++;
                    break;
                case "B":
                    visitorsB++;
                    break;
                case "V":
                    visitorsC++;
                    break;
                case "G":
                    visitorsD++;
                    break;
            }
        }
        System.out.printf("%.2f%%\n" , (visitorsA / visitorsCount) * 100);
        System.out.printf("%.2f%%\n" , (visitorsB / visitorsCount)* 100);
        System.out.printf("%.2f%%\n" , (visitorsC / visitorsCount)* 100);
        System.out.printf("%.2f%%\n" , (visitorsD / visitorsCount)* 100);
        System.out.printf("%.2f%%\n" , (visitorsCount / (stadiumCapacity * 0.01)));
    }
}
