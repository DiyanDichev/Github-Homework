package Final_Exams.FinalExam02;

import java.util.Scanner;

public class P01_World_Tour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] actions = scanner.nextLine().split(":");


        while (!actions[0].equals("Travel")) {
            switch (actions[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(actions[1]);
                    String destination = actions[2];
                    input = input.substring(0, index) + destination + input.substring(index);
                    System.out.println(input);
                    break;
                case "Remove Stop":
                    int startIdx = Integer.parseInt(actions[1]);
                    int endIdx = Integer.parseInt(actions[2]) + 1;
                    if (endIdx > input.length()) {
                        System.out.println(input);
                    } else {
                        input = input.substring(0, startIdx) + input.substring(endIdx);
                        System.out.println(input);
                    }
                    break;
                case "Switch":
                    String townToBeReplaced = actions[1];
                    if (input.contains(townToBeReplaced)) {
                        String newTown = actions[2];
                        input = input.replace(townToBeReplaced, newTown);
                        System.out.println(input);
                    } else {
                        System.out.println(input);
                    }
                    break;
            }
            actions = scanner.nextLine().split(":");
        }
        System.out.printf("Ready for world tour! Planned stops: %s", input);
    }
}
