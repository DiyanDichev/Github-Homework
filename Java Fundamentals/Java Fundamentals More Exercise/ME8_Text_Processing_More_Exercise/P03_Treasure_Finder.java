package More_Exercise.ME8_Text_Processing_More_Exercise;

import java.util.Scanner;

public class P03_Treasure_Finder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String key = scanner.nextLine().replace(" ","");

        while (true){
            String input = scanner.nextLine();
            String decryptedMessage = "";
            if(input.equals("find")){
                break;
            }
            int secondLoopStartIdx = 0;
            boolean flag = true;
            while (flag) {
                for (int i = 0; i < key.length(); i++) {
                    int number = Integer.parseInt(String.valueOf(key.charAt(i)));
                    for (int j = secondLoopStartIdx; j < input.length();) {
                        int ascii = input.charAt(j) - number;
                        char c = (char) ascii;
                        decryptedMessage += c;
                        secondLoopStartIdx++;
                        if(j == input.length() - 1){
                            flag = false;
                        }
                        break;
                    }
                }
            }
            String[] array = decryptedMessage.split("&");
            String treasureName = array[1];
            int inxBeforeAge = decryptedMessage.indexOf('<');
            int inxAfterAge = decryptedMessage.indexOf('>');
            String coordinates = decryptedMessage.substring(inxBeforeAge +1, inxAfterAge);
            System.out.printf("Found %s at %s\n",treasureName, coordinates);
        }
    }
}