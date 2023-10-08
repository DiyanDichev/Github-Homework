package Day6_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P10_The_Lift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int peopleInQueue = Integer.parseInt(scanner.nextLine());
        int[] liftsCount = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean peopleLeft = false;

        for(int i = 0; i < liftsCount.length; i++){
            int emptySpaceCheck = 4 - liftsCount[i];
            if (peopleInQueue == 3){
                emptySpaceCheck = 3;
            } else if (peopleInQueue == 2) {
                emptySpaceCheck = 2;
            } else if (peopleInQueue == 1) {
                emptySpaceCheck = 1;
            }
            if(peopleInQueue == 0){
                break;
            }

            liftsCount[i] += emptySpaceCheck;
            peopleInQueue -= emptySpaceCheck;

        }
        if(peopleInQueue == 0){
            peopleLeft = true;
        }
        if(peopleInQueue == 0 && liftsCount[liftsCount.length-1] == 4){
            for (int number : liftsCount) {
                System.out.print(number + " ");
            }
            return;
        }
        if(peopleLeft){
        System.out.println("The lift has empty spots!");
            for (int number : liftsCount) {
                System.out.print(number + " ");
            }
        }else {
            System.out.printf("There isn't enough space! %d people in a queue!\n", peopleInQueue);
            for (int number : liftsCount) {
                System.out.print(number + " ");
            }
        }
    }
}
