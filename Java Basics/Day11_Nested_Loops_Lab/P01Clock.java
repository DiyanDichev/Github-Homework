package Day11_Nested_Loops_Lab;

import java.util.Scanner;

public class P01Clock {
    public static void main(String[] args) {

        int h = 0;
        while(h <=23) {

            int m = 0;
            while (m <= 59) {
                System.out.printf("%d:%d\n", h, m);
                m++;
            }
            h++;
        }
    }
}
