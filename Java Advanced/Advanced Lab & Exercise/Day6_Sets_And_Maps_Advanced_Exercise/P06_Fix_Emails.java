package Day6_Sets_And_Maps_Advanced_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_Fix_Emails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String,String> personData = new LinkedHashMap<>();
        while (!input.equals("stop")){
            String email = scanner.nextLine();
            String[] emailArray = email.split("\\.");
            String emailExtension = emailArray[emailArray.length -1];
            if(!emailExtension.equals("us") && !emailExtension.equals("uk") && !emailExtension.equals("com")){
                personData.put(input,email);
            }

            input = scanner.nextLine();
        }

        personData.forEach((k,v)-> System.out.printf("%s -> %s\n",k,v));
    }
}
