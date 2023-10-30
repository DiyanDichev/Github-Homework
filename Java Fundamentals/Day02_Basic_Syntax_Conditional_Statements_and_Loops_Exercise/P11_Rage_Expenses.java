package Day02_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class P11_Rage_Expenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double lostGameCounter = 0;

        int brokenHeadsets = 0;
        int brokenMouses = 0;
        int brokenKeyboards = 0;
        int brokenKeyboards2 = 0;
        int brokenDisplays = 0;

        for(int i = 1; i <= lostGames; i++){
            lostGameCounter ++;

            if(lostGameCounter % 2 == 0){
                brokenHeadsets ++;
            }
            if(lostGameCounter % 3 == 0) {
                brokenMouses ++;
            }
            if(lostGameCounter % 2 == 0 && lostGameCounter % 3 == 0){
                brokenKeyboards++;
                brokenKeyboards2++;
            }
            if (brokenKeyboards2 % 2 == 0 && brokenKeyboards2 != 0) {
                brokenDisplays++;
                brokenKeyboards2 = 0;
            }
        }
        double totalPrice = (brokenHeadsets * headsetPrice) + (brokenMouses * mousePrice) +
                (brokenKeyboards * keyboardPrice) + (brokenDisplays * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
