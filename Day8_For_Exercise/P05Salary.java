package Day8_For_Exercise;

import java.util.Scanner;

public class P05Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n =  Integer.parseInt(scanner.nextLine());
        int salary =  Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String tabName = scanner.nextLine();

            switch (tabName) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }

            if (salary <= 0){
                System.out.println("You have lost your salary.");
                return;
            }
        }
        System.out.println(salary);
    }
}
