package Retake_MidExam03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_Moving_Target {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")){
            String operator = command.split(" ")[0];
            int index = Integer.parseInt(command.split(" ")[1]);
            int value = Integer.parseInt(command.split(" ")[2]);

            if(operator.equals("Shoot") && index <= numbers.size() - 1 && index >= 0){
                int indexValue = numbers.get(index) - value;
                numbers.set(index, indexValue);
                if(numbers.get(index) <= 0){
                    numbers.remove(index);
                }
            } else if (operator.equals("Add")) {
                if(index < 0 || index > numbers.size() - 1){
                    System.out.println("Invalid placement!");
                }else {
                    numbers.add(index , value);
                }
            } else if (operator.equals("Strike")) {
                if(index - value < 0 || index + value > numbers.size() - 1){
                    System.out.println("Strike missed!");
                }else {
                    int indexValue = numbers.get(index);
                    for (int i = index + value; i > index; i--) {
                        numbers.remove(i);
                    }
                    for (int i = index - 1; i >= index - value; i--) {
                        numbers.remove(i);
                    }
                    numbers.remove(Integer.valueOf(indexValue));
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if(i < numbers.size() - 1){
                System.out.print("|");
            }
        }
    }
}
