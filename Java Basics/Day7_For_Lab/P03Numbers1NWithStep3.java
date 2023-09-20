package Day7_For_Lab;

import java.util.Scanner;

public class P03Numbers1NWithStep3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n =  Integer.parseInt(scanner.nextLine());


        for ( int number = 1; number <= n ; number +=3) {
            System.out.println(number);
        }
    }
}
