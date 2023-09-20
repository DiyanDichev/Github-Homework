package Day1_Basic_Syntax_Conditional_Statements_And_Loops_Lab;

import java.util.Scanner;

public class P04_Back_In_30_Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if (hours ==23 && minutes > 29){
            hours = 0;
            minutes -= 30;
        }
        if (hours < 23 && minutes > 29){
            hours +=1;
            minutes -=30;
        } else if (hours > 0 && hours < 23) {
            minutes +=30;
        }
        System.out.printf("%d:%02d", hours, minutes);
    }
}
