package Day12_Defining_Classes_Exercises.P06;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        Pokemon pokemon = null;
        Trainer trainer = null;
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        while (!line.equals("Tournament")) {

            String[] tokens = line.split("\\s+");

            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String elementName = tokens[2];
            int health = Integer.parseInt(tokens[3]);

            pokemon = new Pokemon(pokemonName, elementName, health);


            trainers.putIfAbsent(trainerName, new Trainer(trainerName));
            trainers.get(trainerName).getPokemons().add(pokemon);

            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        while (!line.equals("End")) {

            for (Trainer valueTrainers : trainers.values()) {
                for (Pokemon pokemon1 : valueTrainers.getPokemons()) {
                    if (pokemon1.getElement().equals(line)) {
                        valueTrainers.setNumOfBadges();
                        break;
                    } else {
                        pokemon1.setHealth(pokemon1.getHealth() - 10);

                    }

                }
                valueTrainers.removeDeadPokemons();
            }


            line = scanner.nextLine();
        }
        trainers.entrySet().stream().sorted((p1, p2) ->
                        Integer.compare(p2.getValue().getNumberOfBadges(), p1.getValue().getNumberOfBadges()))
                .forEach(e -> {
                    System.out.println(String.format("%s %d %d", e.getKey(), e.getValue().getNumberOfBadges(),
                            e.getValue().getPokemons().size()));
                });
    }
}