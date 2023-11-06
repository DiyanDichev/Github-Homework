package Day04_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class P06_Triples_of_Latin_Letters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(char letter1 = 'a'; letter1 < 'a' + n; letter1++){
            for(char letter2 = 'a'; letter2 < 'a' + n; letter2++){
                for(char letter3 = 'a'; letter3 < 'a' + n; letter3++){
                    System.out.printf("%c%c%c\n",letter1,letter2,letter3);
                }
            }
        }
    }
}
