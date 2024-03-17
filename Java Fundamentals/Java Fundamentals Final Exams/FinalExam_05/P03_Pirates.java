package Final_Exams.FinalExam_05;

import java.util.*;

public class P03_Pirates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> cityData = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split("\\|+");
        while (!input[0].equals("Sail")){
            String cityName = input[0];
            int citizens = Integer.parseInt(input[1]);
            int gold = Integer.parseInt(input[2]);
            if(cityData.containsKey(cityName)){
                cityData.get(cityName).set(0, cityData.get(cityName).get(0) + citizens);
                cityData.get(cityName).set(1, cityData.get(cityName).get(1) + gold);
            }else {
                cityData.put(cityName, new ArrayList<>());
                cityData.get(cityName).add(citizens);
                cityData.get(cityName).add(gold);
            }
            input = scanner.nextLine().split("\\|+");
        }
        String[] command = scanner.nextLine().split("=>");
        while (!command[0].equals("End")){
            String operator = command[0];
            String cityName = command[1];
            int citizens = cityData.get(cityName).get(0);
            int gold = cityData.get(cityName).get(1);

            switch (operator){
                case "Plunder":
                    int peopleToKill = Integer.parseInt(command[2]);
                    int goldToSteal = Integer.parseInt(command[3]);
                    cityData.get(cityName).set(0,citizens - peopleToKill);
                    cityData.get(cityName).set(1,gold - goldToSteal);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",cityName, goldToSteal, peopleToKill);
                    if(cityData.get(cityName).get(0) == 0 || cityData.get(cityName).get(1) == 0){
                        cityData.remove(cityName);
                        System.out.printf("%s has been wiped off the map!\n", cityName);
                    }
                    break;
                case "Prosper":
                    int goldToAdd = Integer.parseInt(command[2]);
                    if(goldToAdd < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        cityData.get(cityName).set(1,gold + goldToAdd);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n",goldToAdd,cityName,gold + goldToAdd);
                    }
                    break;
            }
            command = scanner.nextLine().split("=>");
        }
        if(cityData.size() == 0){
            System.out.printf("Ahoy, Captain! All targets have been plundered and destroyed!");
        }else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", cityData.size());
            cityData.entrySet().stream()
                    .forEach(kvp -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg\n",
                            kvp.getKey(), kvp.getValue().get(0), kvp.getValue().get(1)));
        }
    }
}
