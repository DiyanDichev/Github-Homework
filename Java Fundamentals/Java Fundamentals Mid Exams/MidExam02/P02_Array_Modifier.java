package MidExam02;

import java.util.Arrays;
import java.util.Scanner;

public class P02_Array_Modifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arrayLength = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String operator = scanner.nextLine();
        while (!operator.equals("end")){

            if(operator.contains("swap")){
                int index1 = Integer.parseInt(operator.split(" ")[1]);
                int index2 = Integer.parseInt(operator.split(" ")[2]);

                int firstIndexNumber = arrayLength[index1];
                int secondIndexNumber = arrayLength[index2];

                arrayLength[index1] = secondIndexNumber;
                arrayLength[index2] = firstIndexNumber;

            } else if (operator.contains("multiply")) {
                int index1 = Integer.parseInt(operator.split(" ")[1]);
                int index2 = Integer.parseInt(operator.split(" ")[2]);

                int firstIndexNumber = arrayLength[index1];
                int secondIndexNumber = arrayLength[index2];

                int product =  firstIndexNumber * secondIndexNumber;
                arrayLength[index1] = product;

            } else if (operator.equals("decrease")) {
                for (int index = 0; index <= arrayLength.length - 1; index++) {
                    arrayLength[index]--;
                }
            }
            operator = scanner.nextLine();
        }
        for (int index = 0; index <= arrayLength.length - 1; index++){
            int number = arrayLength[index];
            if (index!= arrayLength.length - 1){
                System.out.print(number + ", ");
            }else {
                System.out.print(number);
            }
        }
    }
}
