package Day19_Text_Processing_Exercise;

import java.util.Scanner;

public class P08_Letters_Change_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] codes = scanner.nextLine().split("\\s+");

        double sum = 0;
        for (String code : codes) {

            double modifiedNumber = getModifiedNumber(code);
            sum += modifiedNumber;
        }
        System.out.printf("%.2f", sum);
    }

    private static double getModifiedNumber(String code) {

        char letterBefore = code.charAt(0);
        char letterAfter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(letterBefore, ' ')
                .replace(letterAfter, ' ')
                .trim());
        if (Character.isUpperCase(letterBefore)) {
            int positionUpperLetter = (int) letterBefore - 64;
            number /= positionUpperLetter;
        } else {
            int positionLowerLetter = (int) letterBefore - 96;
                    number *= positionLowerLetter;
        }
        if (Character.isUpperCase(letterAfter)) {
            int positionUpperLetter = (int) letterAfter - 64;
            number -= positionUpperLetter;
        } else {
            int positionLowerLetter = (int) letterAfter - 96;
            number += positionLowerLetter;
        }
        return number;
    }
}
