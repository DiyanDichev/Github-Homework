package More_Exercise.ME7_Maps_Lambda_and_Stream_API_More_Exercise;

import com.sun.jdi.Value;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_MOBA_Challenger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, LinkedHashMap<String, Integer>> data = new LinkedHashMap<>();

        while (!input.equals("Season end")) {
            if (input.contains("->")) {
                String[] array = input.split(" -> ");
                String playerName = array[0];
                String positionName = array[1];
                int skillPoints = Integer.parseInt(array[2]);
                if (!data.containsKey(playerName) && !data.containsKey(positionName)) {
                    data.put(playerName, new LinkedHashMap<>());
                    data.get(playerName).put(positionName, skillPoints);
                } else {
                    if (data.get(playerName).containsKey(positionName)) {
                        if (data.get(playerName).get(positionName) < skillPoints) {
                            data.get(playerName).put(positionName, skillPoints);
                        }
                    } else {
                        data.get(playerName).put(positionName, skillPoints);
                    }
                }
            } else {
                String[] arrayVs = input.split(" ");
                String firstPlayerName = arrayVs[0];
                String secondPlayerName = arrayVs[2];
                if (data.containsKey(firstPlayerName) && data.containsKey(secondPlayerName)) {
                    boolean hasCommon = false;
                    for (String s : data.get(firstPlayerName).keySet()) {
                        for (String s1 : data.get(secondPlayerName).keySet()) {
                            if (s.equals(s1)) {
                                hasCommon = true;
                            }
                        }
                    }
                    if (hasCommon) {
                        if (data.get(firstPlayerName).values().stream().mapToInt(i -> i).sum() >
                                data.get(secondPlayerName).values().stream().mapToInt(i -> i).sum()) {
                            data.remove(secondPlayerName);
                        } else if (data.get(firstPlayerName).values().stream().mapToInt(i -> i).sum() <
                                data.get(secondPlayerName).values().stream().mapToInt(i -> i).sum()) {
                            data.remove(firstPlayerName);
                        }
                    }

                }
            }

            input = scanner.nextLine();
        }
        data.entrySet()
                .stream()
                .sorted((p1, p2) -> {
                    int result = Integer.compare(p2.getValue().values().stream().mapToInt(i -> i).sum(),
                            p1.getValue().values().stream().mapToInt(i -> i).sum());
                    if (result == 0) {
                        result = p1.getKey().compareTo(p2.getKey());
                    }
                    return result;
                })
                .forEach(entry -> {
                    System.out.printf("%s: %d skill%n", entry.getKey(), entry.getValue().values().stream().mapToInt(i -> i).sum());
                    entry.getValue()
                            .entrySet()
                            .stream()
                            .sorted((e1, e2) -> {
                                int res = Integer.compare(e2.getValue(), e1.getValue());
                                if (res == 0) {
                                    res = e1.getKey().compareTo(e2.getKey());
                                }
                                return res;
                            }).forEach(e -> {
                                System.out.printf("- %s <::> %d%n", e.getKey(), e.getValue());
                            });
                });
    }
}