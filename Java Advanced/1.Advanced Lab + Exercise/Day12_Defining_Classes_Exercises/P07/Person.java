package Day12_Defining_Classes_Exercises.P07;

import java.util.List;

public class Person {

    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parents> parents;
    private List<Children> children;
    private Car car;

    public Person(String name, Company company, List<Pokemon> pokemons,
                  List<Parents> parents, List<Children> children, Car car) {
        this.name = name;
        this.company = company;
        this.pokemons = pokemons;
        this.parents = parents;
        this.children = children;
        this.car = car;
    }


    public String getName() {
        return this.name;
    }

    public Company getCompany() {
        return this.company;
    }

    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }

    public List<Parents> getParents() {
        return this.parents;
    }

    public List<Children> getChildren() {
        return this.children;
    }

    public Car getCar() {
        return this.car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public void setParents(List<Parents> parents) {
        this.parents = parents;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}