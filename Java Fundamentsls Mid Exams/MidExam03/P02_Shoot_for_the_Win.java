package MidExam03;

import java.util.Arrays;
import java.util.Scanner;

public class P02_Shoot_for_the_Win {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int shotTargets = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")){
            int index = Integer.parseInt(input);
            if(index < numbers.length ){
                int currentIndex = numbers[index];
                for (int i = 0; i < numbers.length; i++) {
                    if(numbers[i] != -1) {
                        if(numbers[i] > currentIndex) {
                            numbers[i] -= currentIndex;
                        }else {
                            numbers[i] += currentIndex;
                        }
                    }
                }
            }
            if(index < numbers.length ) {
                numbers[index] = -1;
                shotTargets++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",shotTargets);
        for (int number : numbers) {
            System.out.printf("%d ", number);
        }
    }
}
