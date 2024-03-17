package Day2_Stack_and_Queues_Exercise;

import java.util.*;

public class P02_Basic_Stack_Operation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> newStack = new ArrayDeque<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        String[] commands = scanner.nextLine().split("\\s+");
        String[] input = scanner.nextLine().split("\\s+");

        int N = Integer.parseInt(commands[0]);
        int S = Integer.parseInt(commands[1]);
        int X = Integer.parseInt(commands[2]);

        for (int i = 0; i < N; i++) {
            stack.push(Integer.valueOf(input[i]));
        }

        for (int i = 0; i < S; i++) {
            stack.pop();
        }

        boolean flag = false;
        while (!stack.isEmpty()) {
            priorityQueue.offer(stack.peek());
            newStack.push(stack.pop());
            if(newStack.peek().equals(X)){
                flag = true;
            }

        }
        if(flag) {
            System.out.println(true);
        } else if (priorityQueue.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(priorityQueue.peek());
        }
    }
}
