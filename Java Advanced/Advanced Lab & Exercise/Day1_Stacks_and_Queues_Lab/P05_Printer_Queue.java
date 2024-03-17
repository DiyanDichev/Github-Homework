package Day1_Stacks_and_Queues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_Printer_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!line.equals("print")){

            if(line.equals("cancel")){
                if(queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled " + queue.poll());
                }
            }else {
                queue.offer(line);
            }

            line = scanner.nextLine();
        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

       // for (String current : queue) {             // Втори метод.
       //     System.out.println(current);
       // }
    }
}
