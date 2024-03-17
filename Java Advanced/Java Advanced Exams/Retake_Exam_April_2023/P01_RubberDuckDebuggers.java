package Java_Advanced_Exams.Retake_Exam_April_2023;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01_RubberDuckDebuggers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] queueInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] stackInput = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> stack = new ArrayDeque<>();


        for (int i = 0; i < queueInput.length; i++) {
            queue.offer(queueInput[i]);
        }
        for (int i = 0; i < stackInput.length; i++) {
            stack.push(stackInput[i]);
        }

        int darthVaderDucky = 0;
        int thorDucky = 0;
        int bigBlueRubberDucky = 0;
        int smallYellowRubberDucky = 0;

        while (!queue.isEmpty()) {
            int queueNum = queue.peek();
            int stackNum = stack.peek();
            int sum = queueNum * stackNum;
            if (sum < 61) {
                darthVaderDucky++;
                queue.poll();
                stack.pop();
            } else if (sum < 121) {
                thorDucky++;
                queue.poll();
                stack.pop();
            } else if (sum < 181) {
                bigBlueRubberDucky++;
                queue.poll();
                stack.pop();
            } else if (sum < 241) {
                smallYellowRubberDucky++;
                queue.poll();
                stack.pop();
            } else {
                queue.addLast(queue.poll());
                stack.pop();
                stack.push(stackNum - 2);
            }
        }
        System.out.println("Congratulations, all tasks have been completed! Rubber ducks rewarded:");
        System.out.printf("Darth Vader Ducky: %d\n",darthVaderDucky);
        System.out.printf("Thor Ducky: %d\n",thorDucky);
        System.out.printf("Big Blue Rubber Ducky: %d\n",bigBlueRubberDucky);
        System.out.printf("Small Yellow Rubber Ducky: %d\n",smallYellowRubberDucky);
    }
}
