package Day12_Exam_Preparation;

import java.util.Scanner;

public class P02_Shopping_List {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] groceries = scanner.nextLine().split("!");

        String command = scanner.nextLine();
        while (!command.equals("Go Shopping!")) {

            if (command.contains("Urgent")) {
                String[] newGroceries = new String[groceries.length + 1];
                String index1 = command.split(" ")[1];
                boolean flag = true;
                for (int i = 0; i < groceries.length; i++) {
                    if (groceries[i].equals(index1)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.arraycopy(groceries, 0, newGroceries, 1, groceries.length);
                    newGroceries[0] = index1;
                    groceries = new String[newGroceries.length];
                    System.arraycopy(newGroceries, 0, groceries, 0, newGroceries.length);
                }
            } else if (command.contains("Unnecessary")) {
                String index1 = command.split(" ")[1];
                int rearrangeIndexNumber = 0;
                boolean flag = false;
                for (int i = 0; i < groceries.length; i++) {
                    if (groceries[i].equals(index1)) {
                        flag = true;
                        rearrangeIndexNumber = i;
                        groceries[i] = groceries[groceries.length - 1];
                        break;
                    }
                }
                if (flag) {
                    String nextIndex;
                    for (int i = rearrangeIndexNumber + 1; i < groceries.length; i++) {
                        nextIndex = groceries[i];
                        groceries[i - 1] = nextIndex;
                    }
                    groceries[groceries.length - 1] = index1;
                    String[] newGroceries = new String[groceries.length - 1];
                    String secondIndex1 = command.split(" ")[1];
                    boolean secondFlag = true;
                    for (int i = 0; i < groceries.length - 1; i++) {
                        if (groceries[i].equals(secondIndex1)) {
                            secondFlag = false;
                            break;
                        }
                    }
                    if (secondFlag) {
                        System.arraycopy(groceries, 0, newGroceries, 0, groceries.length - 1);
                        groceries = new String[newGroceries.length];
                        System.arraycopy(newGroceries, 0, groceries, 0, newGroceries.length);
                    }
                }
            } else if (command.contains("Correct")) {

                for (int i = 0; i < groceries.length; i++) {
                    String index1 = command.split(" ")[1];
                    String index2 = command.split(" ")[2];
                    if (groceries[i].equals(index1)) {
                        groceries[i] = index2;
                        break;
                    }
                }
            } else if (command.contains("Rearrange")) {
                String index1 = command.split(" ")[1];
                int rearrangeIndexNumber = 0;
                boolean flag = false;
                for (int i = 0; i < groceries.length; i++) {
                    if (groceries[i].equals(index1)) {
                        flag = true;
                        rearrangeIndexNumber = i;
                        groceries[i] = groceries[groceries.length - 1];
                        break;
                    }
                }
                if (flag) {
                    String nextIndex;
                    for (int i = rearrangeIndexNumber + 1; i < groceries.length; i++) {
                        nextIndex = groceries[i];
                        groceries[i - 1] = nextIndex;
                    }
                    groceries[groceries.length - 1] = index1;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(", ", groceries));
    }
}