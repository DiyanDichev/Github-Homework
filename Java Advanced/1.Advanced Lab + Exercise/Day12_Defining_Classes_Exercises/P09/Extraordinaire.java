package Day12_Defining_Classes_Exercises.P09;

public class Extraordinaire extends Cat {

    private double decibelsOfMeows;

    public Extraordinaire(String name, String type, double decibelsOfMeows) {
        super(name, type);
        this.decibelsOfMeows = decibelsOfMeows;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f",
                super.toString(),
                this.decibelsOfMeows);
    }
}