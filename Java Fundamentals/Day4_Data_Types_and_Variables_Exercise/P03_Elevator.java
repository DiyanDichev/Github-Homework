package Day4_Data_Types_and_Variables_Exercise;

import java.util.Scanner;

public class P03_Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int elevate = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int a = elevate / capacity;
        int b = elevate % capacity;

        if(b < capacity && b != 0){
            a++;
        }
        System.out.println(a);
    }
}
