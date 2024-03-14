package Day12_Defining_Classes_Exercises.P07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String, Person> personsInfo = new LinkedHashMap<>();

        while (!line.equals("End")) {

            String[] tokens = line.split("\\s+");

            String name = tokens[0];
            String token = tokens[1];

            Company company = null;
            Pokemon pokemon = null;
            Parents parents = null;
            Children children = null;
            Car car = null;

            personsInfo.putIfAbsent(name, new Person(name, company, new ArrayList<>(), new ArrayList<>(), new
                    ArrayList<>(), car));

            switch (token) {
                case "company":
                    company = new Company(tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    personsInfo.get(name).setCompany(company);
                    break;
                case "pokemon":
                    pokemon = new Pokemon(tokens[2], tokens[3]);
                    personsInfo.get(name).getPokemons().add(pokemon);
                    break;

                case "parents":
                    parents = new Parents(tokens[2], tokens[3]);
                    personsInfo.get(name).getParents().add(parents);
                    break;
                case "children":
                    children = new Children(tokens[2], tokens[3]);
                    personsInfo.get(name).getChildren().add(children);
                    break;
                case "car":
                    car = new Car(tokens[2], tokens[3]);
                    personsInfo.get(name).setCar(car);
                    break;
            }


            line = scanner.nextLine();
        }
        line = scanner.nextLine();
        System.out.println(line);
        for (Map.Entry<String, Person> personEntry : personsInfo.entrySet()) {
            if (personEntry.getKey().equals(line)) {
                System.out.println("Company:");
                if (personEntry.getValue().getCompany() != null) {
                    System.out.println(personEntry.getValue().getCompany());
                }
                System.out.println("Car:");
                if (personEntry.getValue().getCar() != null) {
                    System.out.println(personEntry.getValue().getCar());
                }
                System.out.println("Pokemon:");
                if (personEntry.getValue().getPokemons() != null) {
                    personEntry.getValue().getPokemons().forEach(System.out::println);
                }
                System.out.println("Parents:");
                if (personEntry.getValue().getPokemons() != null) {
                    personEntry.getValue().getParents().forEach(System.out::println);
                }
                System.out.println("Children:");
                if (personEntry.getValue().getPokemons() != null) {
                    personEntry.getValue().getChildren().forEach(System.out::println);
                }
            }
        }

    }
}