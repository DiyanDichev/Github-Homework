package Day7_For_Lab;

import java.util.Scanner;

public class P06VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        int sum = 0;
        for (int position = 0; position <= text.length() -1; position++){
            char currentLetter = text.charAt(position);
            switch (currentLetter){
                case 'a':
                    sum +=1;
                    break;
                case 'e':
                    sum +=2;
                    break;
                case 'i':
                    sum +=3;
                    break;
                case 'o':
                    sum +=4;
                    break;
                case 'u':
                    sum +=5;
                    break;
            }
        }
        System.out.println(sum);
    }
}
