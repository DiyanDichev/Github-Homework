package Day19_Text_Processing_Exercise;

import java.util.Scanner;

public class P03_Extract_Files {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] path = scanner.nextLine().split("[\\\\ \\.]");

        System.out.printf("File name: %s\n",path[path.length - 2]);
        System.out.printf("File extension: %s",path[path.length - 1]);
    }
}
