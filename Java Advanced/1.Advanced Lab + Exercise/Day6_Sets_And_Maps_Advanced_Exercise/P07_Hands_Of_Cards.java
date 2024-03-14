package Day6_Sets_And_Maps_Advanced_Exercise;

import java.util.*;

public class P07_Hands_Of_Cards {

    private static Map<String, Integer> multipliers = new HashMap<>();
    private static Map<String,Integer> cardPowers = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        multipliers.put("S", 4);
        multipliers.put("H", 3);
        multipliers.put("D", 2);
        multipliers.put("C", 1);

        cardPowers.put("2", 2);
        cardPowers.put("3", 3);
        cardPowers.put("4", 4);
        cardPowers.put("5", 5);
        cardPowers.put("6", 6);
        cardPowers.put("7", 7);
        cardPowers.put("8", 8);
        cardPowers.put("9", 9);
        cardPowers.put("10",10);
        cardPowers.put("J", 11);
        cardPowers.put("Q", 12);
        cardPowers.put("K", 13);
        cardPowers.put("A", 14);



        String input = scanner.nextLine();
        Map<String, HashSet<String>> players = new LinkedHashMap<>();
        while (!input.equals("JOKER")) {
            String[] tokens = input.split(":");
            String name = tokens[0];
            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>());
            }
            String[] cards = tokens[1].trim().split(", ");

            for (String card : cards) {
                players.get(name).add(card);
            }
            input = scanner.nextLine();
        }
        players.forEach((name, cards) -> {
            int points = calculatePoints(cards);
            System.out.printf("%s: %d\n",name,points);
        });
    }

    public static int calculatePoints(HashSet<String> cards) {
        int point = 0;
        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String multiplier = card.substring(card.length() - 1);
            point += cardPowers.get(power) * multipliers.get(multiplier);
        }
        return point;
    }
}
