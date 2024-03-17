package Day17_Associative_Arrays_Exercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_SoftUni_Parking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingDate = new LinkedHashMap<>();

        int countCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countCommands; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            String username = commandParts[1];

            switch (commandName){
                case "register":
                    String carNumber = commandParts[2];
                    if(parkingDate.containsKey(username)){
                        System.out.printf("ERROR: already registered with plate number %s\n", parkingDate.get(username));
                    }else {
                        parkingDate.put(username,carNumber);
                        System.out.printf("%s registered %s successfully\n",username, carNumber);
                    }
                    break;
                case "unregister":
                    if(!parkingDate.containsKey(username)){
                        System.out.printf("ERROR: user %s not found\n", username);
                    }else {
                        parkingDate.remove(username);
                        System.out.printf("%s unregistered successfully\n",username);
                    }
                    break;
            }
        }
        parkingDate.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}
