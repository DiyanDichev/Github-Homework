package Day03_Data_Types_and_Variables_Lab;

import java.util.Scanner;

public class P08_Lower_or_Upper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Scanner input = new Scanner (System.in);

        char letter = input.next().charAt(0);

        if (Character.isUpperCase(letter)){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
