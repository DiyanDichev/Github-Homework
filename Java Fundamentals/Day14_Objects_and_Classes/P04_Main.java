package Day14_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<P04_Songs_Class> songs = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] songArgs = scanner.nextLine().split("_");
            String songType = songArgs[0];
            String name = songArgs[1];
            String time = songArgs[2];

            P04_Songs_Class song = new P04_Songs_Class(songType, name, time);

            songs.add(song);
        }
        String filter = scanner.nextLine();
        boolean shouldFilter = !filter.equals("all");

        for (P04_Songs_Class song : songs) {
            if(!shouldFilter){
                System.out.println(song.getName());
            }else if(song.getTypeList().equals(filter)){
                System.out.println(song.getName());
            }
        }
    }
}
