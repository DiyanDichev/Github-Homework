package Day10_While_Exercise;

import java.util.Scanner;

public class P01OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String theBookOfAnnie = scanner.nextLine();
        String book = scanner.nextLine();

        int checkedBooks = 0;

        while (!book.equals("No More Books")){

            if (book.equals(theBookOfAnnie)) {
                System.out.printf("You checked %d books and found it." , checkedBooks);
                return;
            }
            checkedBooks ++;
            book = scanner.nextLine();
        }
        System.out.println("The book you search is not here!");
        System.out.printf("You checked %d books." , checkedBooks);
    }
}
