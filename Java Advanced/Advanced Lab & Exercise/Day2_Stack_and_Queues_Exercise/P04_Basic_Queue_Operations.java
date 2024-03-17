package Day2_Stack_and_Queues_Exercise;

import java.util.*;

public class P04_Basic_Queue_Operations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<Integer> queue = new ArrayDeque<>();
        int[] commands = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int S = commands[1];
        int X = commands[2];

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(queue::offer);

        for (int i = 0; i < S; i++) {
            queue.poll();
        }
        if(queue.isEmpty()){
            System.out.println(0);
        } else if (queue.contains(X)) {
            System.out.println(true);
        }else {
            Integer smallestElement = Collections.min(queue);
            System.out.println(smallestElement);
        }
    }
}
