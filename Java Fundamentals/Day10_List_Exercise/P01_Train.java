package Day10_List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxWagonsCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")){
            int peopleIncome = 0;
            if(input.split(" ")[0].equals("Add")){
                peopleIncome = Integer.parseInt(input.split(" ")[1]);
                numbers.add(peopleIncome);
            }else {
                peopleIncome = Integer.parseInt(input);
                for (int i = 0; i < numbers.size(); i++) {
                    int currentWagonCapacity = numbers.get(i);
                    if(currentWagonCapacity + peopleIncome <= maxWagonsCapacity){
                        int currentIndex = i;
                        numbers.set(currentIndex, numbers.get(currentIndex) + peopleIncome);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
