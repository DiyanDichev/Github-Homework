package ME_4_ForLoopMoreExercises;

import java.util.Scanner;

public class P09Clock {
    public static void main(String[] args) {

            int h = 0;
            while(h <=23) {

                int m = 0;
                while (m <= 59) {
                    System.out.printf("%d : %d\n", h, m);
                    m++;
                }
                h++;
            }
        }
    }
