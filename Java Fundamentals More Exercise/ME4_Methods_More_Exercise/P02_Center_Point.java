package ME4_Methods_More_Exercise;

import java.util.Scanner;

public class P02_Center_Point {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        numbers(x1,y1,x2,y2);

    }
    public static void numbers(int x1,int y1,int x2,int y2){
        int firstPoint = 0;
        int secondPoint = 0;
        if(x1 < y1){
            firstPoint = x1;
        }else {
            firstPoint = y1;
        }
        if(x2 < y2){
            secondPoint = x2;
        }else {
            secondPoint = y2;
        }
        System.out.printf("(%d, %d)", firstPoint , secondPoint);
    }
}
