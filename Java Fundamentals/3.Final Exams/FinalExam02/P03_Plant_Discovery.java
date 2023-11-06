package Final_Exams.FinalExam02;

import java.util.*;

public class P03_Plant_Discovery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPlants = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> plantsRarity = new LinkedHashMap<>();

        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();

        for (int i = 0; i < countPlants; i++) {
            String input = scanner.nextLine();
            String plantName = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);

            plantsRarity.put(plantName, rarity);
            plantsRating.putIfAbsent(plantName, new ArrayList<>());
        }

        String command = scanner.nextLine();

        while (!command.equals("Exhibition")){
            String commandName = command.split(" ")[0];
            String plantName = command.split(" ")[1];


            if(!plantsRarity.containsKey(plantName)){
                System.out.println("error");
                command = scanner.nextLine();
                continue;
            }

            switch (commandName){
                case "Rate:":
                    double rating = Double.parseDouble(command.split(" ")[3]);
                    plantsRating.get(plantName).add(rating);
                    break;
                case "Update:":
                    int newRarity = Integer.parseInt(command.split(" ")[3]);
                    plantsRarity.put(plantName, newRarity);
                    break;
                case "Reset:":
                    plantsRating.get(plantName).clear();
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantsRarity.entrySet().forEach(entry ->{
            String plantName = entry.getKey();
            int rarity = entry.getValue();
            double averageRating = plantsRating.get(plantName)
                    .stream()
                    .mapToDouble(a -> a)
                    .average()
                    .orElse(0.0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n",plantName,rarity,averageRating);
        });
    }
}
