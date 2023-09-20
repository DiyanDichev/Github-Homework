package Day11_Nested_Loops_Lab;

import java.util.Scanner;

public class P06Building {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int floor = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int i = floor; i >=1 ; i--){
            for(int k = 0; k < rooms ; k++){
                if(i == floor){
                    System.out.printf("L%d%d ", i , k);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i , k);
                }else {
                    System.out.printf("A%d%d ", i , k);
                }
            }
            System.out.println();
        }
    }
}
