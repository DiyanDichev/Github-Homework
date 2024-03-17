package PB_More_Exams_4;

import java.util.Scanner;

public class P05FitnessCenter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int customers = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;

        for (int i = 1; i <= customers; i++){
            String trainingType = scanner.nextLine();

            switch (trainingType){
                case "Back":
                    back++;
                    break;
                case "Chest":
                    chest++;
                    break;
                case "Legs":
                    legs++;
                    break;
                case "Abs":
                    abs++;
                    break;
                case "Protein shake":
                    proteinShake++;
                    break;
                case "Protein bar":
                    proteinBar++;
                    break;
            }
        }
        double workOut = back + chest + legs + abs;
        double protein = proteinShake + proteinBar;

        System.out.printf("%d - back\n",back );
        System.out.printf("%d - chest\n",chest );
        System.out.printf("%d - legs\n",legs );
        System.out.printf("%d - abs\n",abs );
        System.out.printf("%d - protein shake\n",proteinShake );
        System.out.printf("%d - protein bar\n",proteinBar );
        System.out.printf("%.2f%% - work out\n",workOut / customers * 100 );
        System.out.printf("%.2f%% - protein\n",protein / customers * 100 );
    }
}
