package Day08_Methods_Exercise;

import java.util.Scanner;

public class P06_Middle_Characters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleChar(text);
    }
    public static void printMiddleChar(String text){
        int length = text.length();
        if (length % 2 != 0){
            int midCharPos = length / 2;
            System.out.println(text.charAt(midCharPos));
        }else {
            int midCharPos = (length / 2) -1;
            int secondMidCharPos = length / 2;
            System.out.print(text.charAt(midCharPos));
            System.out.print(text.charAt(secondMidCharPos));
        }
    }
}
