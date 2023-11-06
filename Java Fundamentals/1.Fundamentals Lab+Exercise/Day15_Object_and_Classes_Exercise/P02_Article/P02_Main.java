package Day15_Object_and_Classes_Exercise.P02_Articles;

import java.util.Scanner;

public class P02_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] articleData = scanner.nextLine().split(", ");
        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];

        P02_Article article = new P02_Article(title,content,author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();

            String[] commandParts = command.split(": ");
            String commandName = commandParts[0];
            String commandParameter = commandParts[1];

            switch (commandName){
                case "Edit":
                    article.edit(commandParameter);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(commandParameter);
                    break;
                case "Rename":
                    article.rename(commandParameter);
                    break;
            }
        }

        System.out.printf("%s - %s: %s",article.getTitle(),article.getContent(),article.getAuthor());
    }
}
