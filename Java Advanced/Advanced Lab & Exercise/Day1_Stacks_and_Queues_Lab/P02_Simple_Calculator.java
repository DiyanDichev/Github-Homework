package Day1_Stacks_and_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P02_Simple_Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque <String> stack = new ArrayDeque<>();
        Collections.addAll(stack,input); // Съкратен вариант на for loop долу.

       // for (int i = input.length - 1; i >= 0;i--) {
       //     String current = input[i];
       //     stack.push(current);
       // }
        while (stack.size() > 1){
            int firstNum = Integer.parseInt(stack.pop());
            String operand = stack.pop();
            int secondNum = Integer.parseInt(stack.pop());

            switch (operand){
                case  "+":
                    stack.push(String.valueOf(firstNum + secondNum));
                    break;
                case  "-":
                    stack.push(String.valueOf(firstNum - secondNum));
                    break;
            }
        }
        System.out.println(stack.peek());
    }
}
