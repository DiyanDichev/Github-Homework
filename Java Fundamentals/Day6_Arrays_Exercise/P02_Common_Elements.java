package Day6_Arrays_Exercise;

import java.util.Scanner;

public class P02_Common_Elements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

         String firstRow = scanner.nextLine();
         String secondRow = scanner.nextLine();

         String[] firstArray = firstRow.split(" ");
         String[] secondArray = secondRow.split(" ");

         for(String el2 : secondArray){
             for(String el1 : firstArray){
                 if(el2.equals(el1)){
                     System.out.print(el2 + " ");
                 }
             }
         }
    }
}
