package Day5_Sets_And_Maps_Advanced_Lab;

import java.util.*;

public class P07_Cities_by_Continent_and_Country {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputRows = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<String>>> data = new LinkedHashMap<>();

        for (int i = 0; i < inputRows; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];
            data.putIfAbsent(continent, new LinkedHashMap<>());
            data.get(continent).putIfAbsent(country,new ArrayList<>());
            data.get(continent).get(country).add(city);
        }

        data.forEach((continent,nestedMap) -> {
            System.out.println(continent + ":");
            nestedMap.forEach((country,cities) -> {
                System.out.println(String.format("  %s -> %s",country,
                        String.join(", ",cities)));
            });
        });
    }
}
