package Day17_Associative_Arrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07_Legendary_Farming {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> itemData = new LinkedHashMap<>();
        itemData.put("shards", 0);
        itemData.put("fragments", 0);
        itemData.put("motes", 0);

        boolean flag = true;

        while (flag) {
            String[] input = scanner.nextLine().split(" ");

            for (int i = 0; i < input.length; i++) {
                    int quantity = Integer.parseInt(input[i]);
                    i++;
                    String material = input[i].toLowerCase();

                if (!itemData.containsKey(material)) {
                    itemData.put(material, quantity);
                } else {
                    int currentQuantity = itemData.get(material);
                    itemData.put(material, currentQuantity + quantity);
                }
                if(material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    if (itemData.get(material) >= 250) {
                        String legendaryItemName = "";

                        switch (material) {
                            case "shards":
                                legendaryItemName = "Shadowmourne";
                                break;
                            case "fragments":
                                legendaryItemName = "Valanyr";
                                break;
                            case "motes":
                                legendaryItemName = "Dragonwrath";
                                break;
                        }
                        int currentQuantity = itemData.get(material);
                        itemData.put(material, currentQuantity - 250);
                        flag = false;
                        System.out.printf("%s obtained!\n", legendaryItemName);
                        break;
                    }
                }
            }
        }
        itemData.forEach((key, value) ->System.out.println(key + ": " + value));
    }
}
