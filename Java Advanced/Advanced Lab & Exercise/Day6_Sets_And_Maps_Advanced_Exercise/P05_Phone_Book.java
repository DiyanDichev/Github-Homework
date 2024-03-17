package Day6_Sets_And_Maps_Advanced_Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_Phone_Book {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> phoneBook = new HashMap<>();

        while (!"search".equals(input)) {
            String[] array = input.split("-");
            String name = array[0];
            String number = array[1];
            phoneBook.put(name, number);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();
        while (!input.equals("stop")){
            if(phoneBook.containsKey(input)) {
                String phoneNumber = phoneBook.get(input);
                System.out.printf("%s -> %s\n",input,phoneNumber);
            }else{
                System.out.printf("Contact %s does not exist.\n",input);
            }
            input = scanner.nextLine();
        }
    }
}
