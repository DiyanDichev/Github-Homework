package Final_Exams.FinalExam_05;

import java.util.Scanner;

public class P01_Activation_Keys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] command = scanner.nextLine().split(">>>");
        while (!command[0].equals("Generate")){
            String operator = command[0];
            switch (operator){
                case "Contains":
                    String substring = command[1];
                    if(input.contains(substring)){
                        System.out.printf("%s contains %s\n", input, substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String flipType = command[1];
                    int flipStartIdx = Integer.parseInt(command[2]);
                    int flipEndIdx = Integer.parseInt(command[3]);
                    String flippedString = "";
                    if(flipType.equals("Upper")){
                        flippedString = input.substring(flipStartIdx,flipEndIdx).toUpperCase();
                    }else {
                        flippedString = input.substring(flipStartIdx,flipEndIdx).toLowerCase();
                    }
                    input = input.substring(0,flipStartIdx) + flippedString + input.substring(flipEndIdx);
                    System.out.println(input);
                    break;
                case "Slice":
                    int sliceStartIdx = Integer.parseInt(command[1]);
                    int sliceEndIdx = Integer.parseInt(command[2]);
                    input = input.substring(0,sliceStartIdx) + input.substring(sliceEndIdx);
                    System.out.println(input);
                    break;
            }
            command = scanner.nextLine().split(">>>");
        }
        System.out.printf("Your activation key is: %s",input);
    }
}
