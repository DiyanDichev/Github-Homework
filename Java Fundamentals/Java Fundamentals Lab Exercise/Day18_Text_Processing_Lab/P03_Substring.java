package Day18_Text_Processing_Lab;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String text = scanner.next();

        while (true){
            int idx = text.indexOf(word);
            if (idx == -1){
                break;
            }

            String leftSubstring = text.substring(0, idx);
            String righhtSubstring = text.substring(idx + word.length());
            text = leftSubstring + righhtSubstring;
        }
        System.out.println(text);
    }
}
