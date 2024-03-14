package Java_Advanced_Exams.Java_Regular_Exam_June_2023;

import java.util.*;
import java.util.stream.Collectors;

public class P01_TempleOfDoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deque<Integer> toolsQueue = new ArrayDeque<>();
        Deque<Integer> substancesStack = new ArrayDeque<>();
        List<Integer> challenges = new ArrayList<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(toolsQueue::offer);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(substancesStack::push);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(challenges::add);


        while (!substancesStack.isEmpty() && !toolsQueue.isEmpty()) {
            int firstTool = toolsQueue.poll();
            int lastSubstance = substancesStack.pop();
            int total = firstTool * lastSubstance;
            if (challenges.contains(total)) {
                challenges.remove(Integer.valueOf(total));
                if (challenges.isEmpty()) {
                    System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
                    break;
                }
            } else {
                toolsQueue.addLast(firstTool + 1);
                if (lastSubstance - 1 != 0) {
                    substancesStack.addFirst(lastSubstance - 1);
                }
                if (substancesStack.isEmpty()) {
                    System.out.println("Harry is lost in the temple. Oblivion awaits him.");
                    break;
                }
            }
        }
        if (!toolsQueue.isEmpty()) {
            System.out.println("Tools: " + toolsQueue.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
        if (!substancesStack.isEmpty()) {
            System.out.println("Substances: " + substancesStack.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
        if (!challenges.isEmpty()) {
            System.out.println("Challenges: " + challenges.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
    }
}

