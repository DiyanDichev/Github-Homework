package More_Exercise.ME8_Text_Processing_More_Exercise;

import java.util.Scanner;

public class P02_Ascii_Sumator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String startIdx = scanner.nextLine();
        String endIdx = scanner.nextLine();
        String randomString = scanner.nextLine();

        int asciiStartIdx = startIdx.charAt(0);
        int asciiEndIdx = endIdx.charAt(0);

        int sum = 0;
        for (int i = 0; i < randomString.length(); i++) {
            int asciiRandomString = randomString.charAt(i);
            if(asciiStartIdx < asciiRandomString && asciiEndIdx > asciiRandomString){
             sum+=asciiRandomString;
            }
        }
        System.out.println(sum);
    }
}
