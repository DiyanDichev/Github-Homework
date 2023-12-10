package More_Exercise.ME7_Maps_Lambda_and_Stream_API_More_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_Snowwhite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String,Integer>> dwarfData = new LinkedHashMap<>();

        while (!input.equals("Once upon a time")){
            String[] array = input.split(" <:> ");
            String dwarfName = array[0];
            String hatColor = array[1];
            int strength = Integer.parseInt(array[2]);

            if(!dwarfData.containsKey(hatColor)){
                dwarfData.put(hatColor,new LinkedHashMap<>());
                dwarfData.get(hatColor).put(dwarfName,strength);
            } else {
                if (dwarfData.get(hatColor).containsKey(dwarfName)) {
                    if (dwarfData.get(hatColor).get(dwarfName) < strength) {
                        dwarfData.get(hatColor).put(dwarfName, strength);
                    }
                } else {
                    dwarfData.get(hatColor).put(dwarfName, strength);
                }
            }
            input = scanner.nextLine();
        }

        Map<String, Integer> print = new LinkedHashMap<>();

        for(Map.Entry<String, LinkedHashMap<String, Integer>> entry : dwarfData.entrySet()) {
            for(Map.Entry<String, Integer> subEntry : entry.getValue().entrySet()) {
                print.put(entry.getKey() + " " + subEntry.getKey() + " " + entry.getValue().size(), subEntry.getValue());
            }
        }
        print.entrySet().stream().sorted((p2, p1) -> {
            int sort = Integer.compare(p1.getValue(), p2.getValue());
            if (sort == 0) {
                String[] sort1 = p1.getKey().split(" ");
                String[] sort2 = p2.getKey().split(" ");
                sort = sort1[2].compareTo(sort2[2]);
            }
            return sort;
        }).forEach(pair -> {
            String[] printing = pair.getKey().split(" ");
            System.out.printf("(%s) %s <-> %d\n", printing[0], printing[1], pair.getValue());
        });
    }
}
