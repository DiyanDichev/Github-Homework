package ME_4_ForLoopMoreExercises;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int even = 0;
        int evenMinus = 0;
        int odd = 0;
        int oddMinus = 0;
        int numbersSum;


        for (int i = 1 ; i <= n ; i++) {
            int n1 = Integer.parseInt(scanner.nextLine());
            int n2 = Integer.parseInt(scanner.nextLine());
            numbersSum = n1 + n2 ;

            if (numbersSum %2 == 0 && numbersSum >0){
                even = numbersSum;
            } else if (numbersSum %2 == 0 && numbersSum < 0) {
                evenMinus = numbersSum;
            } else if (numbersSum < 0) {
                oddMinus = numbersSum;
            }else {
                odd = numbersSum;
            }
        }
        if (even > 0 || odd > 0) {
            if (even % 2 == odd % 2){
                System.out.printf("Yes, value=%d", even + odd);
            } else if (even %3 == odd %3) {
                System.out.printf("Yes, value=%d", even + odd);
            }else if (even > odd ){
                System.out.printf("No, maxdiff=%d", even - odd);
            }else {
                System.out.printf("No, maxdiff=%d", odd - even);
            }
        }
        if (evenMinus < 0 || oddMinus < 0) {
            if (evenMinus % 2 == oddMinus % 2){
                System.out.printf("No, maxdiff=%d", evenMinus - oddMinus);
            } else if (evenMinus %3 == oddMinus %3) {
                System.out.printf("No, maxdiff=%d", evenMinus - oddMinus);
            }else if (evenMinus > oddMinus ){
                System.out.printf("Yes, value=%d", evenMinus + oddMinus);
            }else {
                System.out.printf("Yes, value=%d", oddMinus + evenMinus);
            }
        }
    }
}