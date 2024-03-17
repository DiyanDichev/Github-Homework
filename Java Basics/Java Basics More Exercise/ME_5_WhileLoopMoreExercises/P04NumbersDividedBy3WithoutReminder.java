package ME_5_WhileLoopMoreExercises;

import java.util.Scanner;

public class P04NumbersDividedBy3WithoutReminder {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){

            if(i % 3 == 0){
                System.out.printf("%d\n", i);
            }
        }

    }
}
