package More_Exercise.ME8_Text_Processing_More_Exercise;

import java.util.Scanner;

public class P05_HTML {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String article = scanner.nextLine();
        String comment = scanner.nextLine();
        System.out.printf("<h1>\n   %s\n</h1>\n", title);
        System.out.printf("<article>\n   %s\n</article>\n", article);

        while (!comment.equals("end of comments")) {
            System.out.printf("<div>\n   %s\n</div>\n", comment);
            comment = scanner.nextLine();
        }
    }
}
