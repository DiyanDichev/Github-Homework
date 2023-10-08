package Day6_Arrays_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09_Array_Modifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")){

            if(command.contains("swap")){
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                numbers[index1] = secondIndexNumber;
                numbers[index2] = firstIndexNumber;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);

                int firstIndexNumber = numbers[index1];
                int secondIndexNumber = numbers[index2];

                int product =  firstIndexNumber * secondIndexNumber;
                numbers[index1] = product;

            } else if (command.equals("decrease")) {
                for (int index = 0; index <= numbers.length - 1; index++) {
                    numbers[index]--;
                }
            }
            command = scanner.nextLine();
        }
    //  System.out.println(Arrays.toString(numbers)
    //          .replace("[" , "")
    //          .replace("]" , ""));
            for (int index = 0; index <= numbers.length - 1; index++){
                int number = numbers[index];
                if (index!= numbers.length - 1){
                    System.out.print(number + ", ");
                }else {
                    System.out.print(number);
                }
            }
    }
}
