package Day12_Nested_Loops_Exercise;

import java.util.Scanner;

public class P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());


        for (int currentNumber = firstNumber; currentNumber <= secondNumber; currentNumber++){

            String textNumber = currentNumber + "";
            int evenPositionSum = 0;
            int oddPositionSum = 0;

            for (int position = 0; position < textNumber.length(); position++){

                int currentDigit = Integer.parseInt(String.valueOf(textNumber.charAt(position)));

                if (position % 2 == 0){
                    evenPositionSum += currentDigit;
                }else {
                    oddPositionSum += currentDigit;
                }
            }
            if (evenPositionSum == oddPositionSum){
                System.out.print(currentNumber + " ");
            }
        }
    }
}
