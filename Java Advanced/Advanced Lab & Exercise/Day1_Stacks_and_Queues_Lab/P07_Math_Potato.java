package Day1_Stacks_and_Queues_Lab;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P07_Math_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        PriorityQueue<String> queue = new PriorityQueue<>();
        for (String child : children) {
            queue.offer(child);
        }
        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++)
                queue.offer(Objects.requireNonNull(queue.poll()));

            if (isPrime(cycle))
                System.out.println("Prime " + queue.peek());
            else
                System.out.println("Removed " + queue.poll());
            cycle++;
        }
        System.out.println("Last is " + queue.poll());
    }
    static boolean isPrime(int cycle)
    {
        if (cycle <= 1)
            return false;
        for (int i = 2; i < cycle; i++)
            if (cycle % i == 0)
                return false;

        return true;
    }
}
