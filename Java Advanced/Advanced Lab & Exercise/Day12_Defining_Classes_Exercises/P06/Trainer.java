package Day12_Defining_Classes_Exercises.P06;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int numberOfBadges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.numberOfBadges = numberOfBadges;
        this.pokemons = new ArrayList<>();
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void setNumOfBadges() {
        this.numberOfBadges++;
    }

    public void removeDeadPokemons() {
        pokemons.removeIf(pokemon -> pokemon.getHealth() <= 0);
    }
}