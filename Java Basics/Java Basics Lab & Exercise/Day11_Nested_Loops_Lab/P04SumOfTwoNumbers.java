package Day11_Nested_Loops_Lab;

import java.util.Scanner;

public class P04SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lower = Integer.parseInt(scanner.nextLine());
        int upper = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int combinations = 0;
        boolean isCombinationFound = false;

        for (int i = lower; i <= upper; i++){
            for(int j = lower; j <= upper; j++){
                combinations ++;
                int result = i + j;

                if(result == magicNum){
                    isCombinationFound = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)\n", combinations, i ,j, magicNum);
                    break;
                }
            }
            if (isCombinationFound){
                break;
            }
        }
        if(!isCombinationFound){
            System.out.printf("%d combinations - neither equals %d", combinations , magicNum);
        }
    }
}
