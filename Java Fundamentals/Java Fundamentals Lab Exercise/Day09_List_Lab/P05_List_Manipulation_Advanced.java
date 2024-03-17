package Day09_List_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P05_List_Manipulation_Advanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("end")) {
                if(input.contains("Contains")){
                    int inputNumber = Integer.parseInt(input.split(" ")[1]);
                    boolean flag = false;
                    for (int i = 0; i < numbers.size(); i++) {
                        if(numbers.get(i) == inputNumber){
                            System.out.println("Yes");
                            flag = true;
                        }
                    }
                    if(!flag) {
                        System.out.println("No such number");
                    }
                } else if (input.contains("Print even")) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if(numbers.get(i) % 2 == 0){
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (input.contains("Print odd")) {
                    for (int i = 0; i < numbers.size(); i++) {
                        if(numbers.get(i) % 2 != 0){
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (input.contains("Get sum")) {
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                } else if (input.contains("Filter")) {
                    String command = input.split(" ")[1];
                    int inputNumber = Integer.parseInt(input.split(" ")[2]);
                    if(command.equals("<")){
                        List<Integer> newList = new ArrayList<>();
                        for (int i = 0; i < numbers.size(); i++) {
                            if( numbers.get(i) < inputNumber){
                                newList.add(numbers.get(i));
                            }
                        }
                        for (int number : newList) {
                            System.out.print(number + " ");
                        }
                    } else if (command.equals("<=")){
                        List<Integer> newList = new ArrayList<>();
                        for (int i = 0; i < numbers.size(); i++) {
                            if( numbers.get(i) <= inputNumber){
                                newList.add(numbers.get(i));
                            }
                        }
                        for (int number : newList) {
                            System.out.print(number + " ");
                        }
                    } else if (command.equals(">")){
                        List<Integer> newList = new ArrayList<>();
                        for (int i = 0; i < numbers.size(); i++) {
                            if( numbers.get(i) > inputNumber){
                                newList.add(numbers.get(i));
                            }
                        }
                        for (int number : newList) {
                            System.out.print(number + " ");
                        }
                    } else if (command.equals(">=")){
                        List<Integer> newList = new ArrayList<>();
                        for (int i = 0; i < numbers.size(); i++) {
                            if( numbers.get(i) >= inputNumber){
                                newList.add(numbers.get(i));
                            }
                        }
                        for (int number : newList) {
                            System.out.print(number + " ");
                        }
                    }
                    System.out.println();
                }

            input = scanner.nextLine();
        }
    }
}
