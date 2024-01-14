package Day2_Stack_and_Queues_Exercise;

import java.util.*;

public class P02_Basic_Stack_Operation_Compact_Code {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        int[] commands = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int S = commands[1];
        int X = commands[2];

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(stack::push);

        for (int i = 0; i < S; i++) {
            stack.pop();
        }
        if(stack.isEmpty()){
            System.out.println(0);
        } else if (stack.contains(X)) {
            System.out.println(true);
        }else {
            Integer smallestElement = Collections.min(stack);
            System.out.println(smallestElement);
        }
    }
}
