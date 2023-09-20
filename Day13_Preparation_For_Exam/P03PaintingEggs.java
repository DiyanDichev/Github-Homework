package Day13_Preparation_For_Exam;

import java.util.Scanner;

public class P03PaintingEggs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String eggsSize = scanner.nextLine();
        String eggsColor = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        int eggsPrice = 0;

        switch (eggsSize){
            case "Small":
                switch (eggsColor){
                    case "Red":
                        eggsPrice += 9;
                        break;
                    case  "Green":
                        eggsPrice += 8;
                        break;
                    case "Yellow":
                        eggsPrice += 5;
                        break;
                }
                break;
            case "Medium":
                switch (eggsColor){
                    case "Red":
                        eggsPrice += 13;
                        break;
                    case  "Green":
                        eggsPrice += 9;
                        break;
                    case "Yellow":
                        eggsPrice += 7;
                        break;
                }
                break;
            case "Large":
                switch (eggsColor){
                    case "Red":
                        eggsPrice += 16;
                        break;
                    case  "Green":
                        eggsPrice += 12;
                        break;
                    case "Yellow":
                        eggsPrice += 9;
                        break;
                }
                break;
        }
        double eggsTotalPrice = eggsPrice * count * 0.65;
        System.out.printf("%.2f leva.", eggsTotalPrice );
    }
}
