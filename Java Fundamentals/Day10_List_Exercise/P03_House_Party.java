package Day10_List_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03_House_Party {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         List<String> names = new ArrayList<>();

         int input = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < input; i++) {
            String input1 = scanner.nextLine();
            String command = input1.split(" ")[2];
            String name = input1.split(" ")[0];
            if(command.equals("going!")){
                if(names.contains(name)){
                    System.out.printf("%s is already in the list!\n", name);
                }else {
                    names.add(name);
                }
            } else if (command.equals("not")) {
                if (names.contains(name)){
                    names.remove(name);
                }else {
                    System.out.printf("%s is not in the list!\n",name);
                }
            }
        }
        for (String number : names ) {
            System.out.println(number);
        }
    }
}
