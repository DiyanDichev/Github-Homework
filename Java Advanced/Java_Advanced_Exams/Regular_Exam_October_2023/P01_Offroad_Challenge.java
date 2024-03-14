package Java_Advanced_Exams.Regular_Exam_October_2023;

import java.util.*;

public class P01_Offroad_Challenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Deque<Integer> fuel = new ArrayDeque<>();
        Deque<Integer> consumption = new ArrayDeque<>();
        Deque<Integer> quantities = new ArrayDeque<>();
        String reached = "";

        for (int i = 0; i < 3; i++) {
            String input = scanner.nextLine();
            for (int j = 0; j < 4; j++) {
                int[] array = Arrays.stream(input.split("\\s+"))
                        .mapToInt(Integer::parseInt)
                        .toArray();
                if(i == 0) {
                    fuel.push(array[j]);
                } else if (i == 1) {
                    consumption.offer(array[j]);
                } else if (i == 2) {
                    quantities.offer(array[j]);
                }
            }
        }
        for (int i = 1; i <= 4; i++) {
            int fuel1 = fuel.pop();
            int consumption1 = consumption.poll();
            int quantities1 = quantities.poll();

            if(fuel1 - consumption1 >= quantities1){
                System.out.printf("John has reached: Altitude %d\n",i);
                reached += " Altitude " + i + ",";
                if(i == 4){
                    System.out.println("John has reached all the altitudes and managed to reach the top!");
                }
            }else{
                System.out.printf("John did not reach: Altitude %d\n",i);
                System.out.println("John failed to reach the top.");
                if(i > 1) {
                    reached = reached.substring(0, reached.length() - 1);
                }else {
                    System.out.println("John didn't reach any altitude.");
                    break;
                }
                System.out.print("Reached altitudes:" + reached);
                break;
            }
        }
    }
}
