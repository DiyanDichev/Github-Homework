package Day2_Stack_and_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01_Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();
       // String[] array = scanner.nextLine().split(" ");

        Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .forEach(stack::push);


       // for (int i = 0; i < array.length; i++) {
       //     int number = Integer.parseInt(array[i]);
       //     stack.push(number);
       // }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
