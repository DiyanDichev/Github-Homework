package Day10_List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_Pokemon_Dont_Go {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;
        while (numbers.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index <= numbers.size() - 1) {
                int removedElement = numbers.get(index);
                sum += removedElement;
                numbers.remove(index);
                modifyList(numbers, removedElement);
            } else if (index < 0) {
                int removedElement = numbers.get(0);
                sum += removedElement;
                numbers.remove(0);
                int lastElement = numbers.get(numbers.size() - 1);
                numbers.add(0, lastElement);
                modifyList(numbers, removedElement);
            } else if (index > numbers.size() - 1){
                int removedElement = numbers.get(numbers.size() - 1);
                sum += removedElement;
                numbers.remove(numbers.size() - 1);
                int firstElement = numbers.get(0);
                numbers.add(firstElement);
                modifyList(numbers, removedElement);
            }
        }

        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedElement) {
        for (int index = 0; index <= numbers.size() - 1; index++) {
            int currentNumber = numbers.get(index);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }

            numbers.set(index, currentNumber);
        }
    }
}