package Day6_Sets_And_Maps_Advanced_Exercise;

import java.util.*;

public class P13_Dragon_Army {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String type = tokens[0];
            String name = tokens[1];
            int damage = tokens[2].equals("null") ? 45 : Integer.parseInt(tokens[2]);
            int health = tokens[3].equals("null") ? 250 : Integer.parseInt(tokens[3]);
            int armor = tokens[4].equals("null") ? 10 : Integer.parseInt(tokens[4]);

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>());
            }
            if (!dragons.get(type).containsKey(name)) {
                dragons.get(type).put(name, new int[3]);
            }

            dragons.get(type).get(name)[0] = damage;
            dragons.get(type).get(name)[1] = health;
            dragons.get(type).get(name)[2] = armor;
        }
        dragons.forEach((key, value) -> {
            double[] avgStats = calculateAverage(value);
            System.out.printf("%s::(%.2f/%.2f/%.2f)\n", key, avgStats[0], avgStats[1], avgStats[2]);
            value.forEach((k, v) -> {
                System.out.printf("-%s -> damage: %d, health: %d, armor: %d\n",k,v[0],v[1],v[2]);
            });
        });
    }

    private static double[] calculateAverage(TreeMap<String, int[]> dragons) {
        double dragonsCount = dragons.size();
        int totalDamage = 0;
        int totalHealth = 0;
        int totalArmor = 0;
        for (Map.Entry<String, int[]> entry : dragons.entrySet()) {
            int[] v = entry.getValue();
            totalDamage += v[0];
            totalHealth += v[1];
            totalArmor += v[2];
        }
        return new double[]{totalDamage / dragonsCount,
                totalHealth / dragonsCount,
                totalArmor / dragonsCount};
    }
}
