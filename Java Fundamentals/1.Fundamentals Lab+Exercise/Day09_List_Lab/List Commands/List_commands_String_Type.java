import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_commands_String_Type {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int iterations = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();

        for (int i = 0; i <iterations;i++){
            String persons = scanner.nextLine();
            names.add(persons);
        }

        names.add("Mimi");
        names.add("Georgi");
        names.remove("Mimi");
        String removedIndex = names.remove(0);
        names.remove(0);
        System.out.printf("Removed Name %s\n",removedIndex);

        boolean removed = names.remove("Mimi");
        System.out.println(removed);

        for (String name : names) {
            System.out.println(name);
        }
    }
}
//        List<String> names = Arrays.stream(scanner.nextLine().split(" ")).toList();
//        String[] namesArray = names.toArray(String[]::new);