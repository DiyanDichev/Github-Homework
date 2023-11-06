package Day09_List_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_List_Manipulation_Basics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            int inputNumber = Integer.parseInt(input.split(" ")[1]);
            switch (command) {
                case "Add":
                    numbers.add(inputNumber);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(inputNumber));
                    break;
                case "RemoveAt":
                    numbers.remove(inputNumber);
                    break;
                case "Insert":
                    int indexNumber = Integer.parseInt(input.split(" ")[2]);
                    numbers.add(indexNumber, inputNumber);
                    break;
            }
            input = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}