package Day13_Preparation_For_Exam;

import java.util.Scanner;

public class P02Skeleton {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double metres = Double.parseDouble(scanner.nextLine());
        double secondsPer100Metres = Double.parseDouble(scanner.nextLine());

        int totalSeconds = minutes * 60 + seconds;
        double reducedTime = (metres / 120) * 2.5;
        double marinTime = (metres / 100) * secondsPer100Metres - reducedTime;

        if(marinTime <= totalSeconds){
            System.out.printf("Marin Bangiev won an Olympic quota!\n");
            System.out.printf("His time is %.3f.\n", marinTime);
        }else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", marinTime - totalSeconds);
        }
    }
}
