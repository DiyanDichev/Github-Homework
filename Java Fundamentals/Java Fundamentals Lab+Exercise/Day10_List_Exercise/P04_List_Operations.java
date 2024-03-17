package Day10_List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_List_Operations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String operator = command.split(" ")[0];
            if(operator.equals("Add")){
                int number = Integer.parseInt(command.split(" ")[1]);
                numbers.add(number);
            } else if (operator.equals("Insert")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if(index > numbers.size() || index < 0){
                    System.out.println("Invalid index");
                }else {
                    numbers.add(index,number);
                }
            } else if (operator.equals("Remove")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index > numbers.size() || index < 0){
                    System.out.println("Invalid index");
                }else {
                    numbers.remove(index);
                }
            } else if (command.contains("Shift left")) {
                int shiftsCounter = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < shiftsCounter; i++) {
                    int firstIndexNumber = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstIndexNumber);
                }
            } else if (command.contains("Shift right")) {
                int shiftsCounter = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < shiftsCounter; i++) {
                    int lastIndexNumber = numbers.get(numbers.size()-1);
                    numbers.remove(numbers.size() - 1);
                    numbers.add(0, lastIndexNumber);
                }
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
