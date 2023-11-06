package Retake_MidExam06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_Treasure_Hunt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> treasure = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        List<String> stolenItems = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")){

            switch (command.split(" ")[0]){
                case "Loot":
                    List<String> loot = List.of(command.split(" "));
                    for (int i = 1; i < loot.size() ; i++) {
                        if(!treasure.contains(loot.get(i))){
                            treasure.add(0,loot.get(i));
                        }
                    }
                    break;
                case "Drop":
                    int drop = Integer.parseInt(command.split(" ")[1]);
                    if(drop <= treasure.size() - 1 && drop >= 0){
                        treasure.add(treasure.get(Integer.parseInt(String.valueOf(drop))));
                        treasure.remove(drop);
                    }
                    break;
                case "Steal":
                    int steal = Integer.parseInt(command.split(" ")[1]);
                    int loopEndIndex = treasure.size();
                    if (loopEndIndex - steal < 0){
                        loopEndIndex = 0;
                    }else {
                        loopEndIndex = treasure.size() - steal;
                    }
                    for (int i = treasure.size(); i > loopEndIndex; i--) {
                        stolenItems.add(0, treasure.get(i - 1));
                        treasure.remove(i - 1);
                    }
                    for (int i = 0; i < stolenItems.size(); i++) {
                        System.out.print(stolenItems.get(i));
                        if (i < stolenItems.size() - 1){
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                    for (int i = stolenItems.size() -1; i >= 0; i--) {
                        stolenItems.remove(i);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        if(treasure.size() > 0){
            int wordsLengthSum = 0;
            int treasureCount = 0;
            for (int i = 0; i < treasure.size(); i++) {
                int currentWordLength = treasure.get(i).length();
                wordsLengthSum += currentWordLength;
                treasureCount++;
            }
            System.out.printf("Average treasure gain: %.2f pirate credits.", wordsLengthSum * 1.0 / treasureCount);
        }else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
