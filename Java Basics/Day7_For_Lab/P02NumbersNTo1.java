package Day7_For_Lab;

import java.util.Scanner;

public class P02NumbersNTo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int n = number ; number > 0 ; number--){
            System.out.println(number);
        }



    }
}
