package Day2_Stack_and_Queues_Exercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07_Simple_Text_Editor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int operations = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> removedElements = new ArrayDeque<>();
        StringBuilder string = new StringBuilder();

        for (int i = 1; i <= operations; i++) {
            String rawCommand = scanner.nextLine();
            String[] commands = rawCommand.split(" ");
            switch (commands[0]){
                case "1":
                    stack.push(rawCommand);
                    add(string,commands[1]);
                    break;
                case "2":
                    stack.push(rawCommand);
                    int eraseCount = Integer.parseInt(commands[1]);
                    saveDeletedElements(string,eraseCount,removedElements);
                    delete(string,eraseCount);
                    break;
                case "3":
                    int indexOf = Integer.parseInt(commands[1]) - 1;
                    System.out.println(string.charAt(indexOf));
                    break;
                case "4":
                    String lastCommand = stack.pop();
                    String[] lastCommandArgs = lastCommand.split("\\s+");
                    String lastCommandType = lastCommandArgs[0];
                    if (lastCommandType.equals("1")) {
                        int numberOfElementsToDelete = lastCommandArgs[1].length();
                        delete(string, numberOfElementsToDelete);
                    } else {
                        add(string, removedElements.pop());
                    }
                    break;
            }
        }
    }
    private static void saveDeletedElements(StringBuilder text, int count, ArrayDeque<String> removedElements) {

        String removedText = text.substring(text.length() - count, text.length());
        removedElements.push(removedText);
    }

    private static void delete(StringBuilder text, int count) {

        text.replace(text.length() - count, text.length(), "");
    }

    private static void add(StringBuilder text, String commands) {
        text.append(commands);
    }
}
