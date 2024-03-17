package Day07_Methods_Lab;

import java.util.Scanner;

public class P10_Multiply_Evens_by_Odds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char negativeInput =  input.charAt(0);

        int evenNumbers = 0;
        int oddNumbers = 0;
        int startPoint = 0;

        if(negativeInput == 45){ //ASCII value of " - "
            startPoint = 1;
        }else {
            startPoint = 0;
        }
        for(int i = startPoint; i < input.length(); i++){
            char currentNumber = input.charAt(i);
            int number = Integer.parseInt(String.valueOf(currentNumber));

            if(number % 2 == 0){
                evenNumbers += number;
            }else {
                oddNumbers += number;
            }
        }
        System.out.println(evenNumbers * oddNumbers);
    }
}
