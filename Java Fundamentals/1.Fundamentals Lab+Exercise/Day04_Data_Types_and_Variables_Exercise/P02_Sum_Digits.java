package Day04_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class P02_Sum_Digits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (input > 0){
            int number = input;
            number = input % 10;
            sum += number;

            number = input / 10;
            input = number;
        }
        System.out.println(sum);
    }
}
