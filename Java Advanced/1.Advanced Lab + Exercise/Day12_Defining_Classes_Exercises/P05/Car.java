package Day12_Defining_Classes_Exercises.P05;

public class Car {
    private static final String COLOR_DEF_VALUE = "n/a";
    private static final String WEIGHT_DEF_VALUE = "n/a";
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = Car.WEIGHT_DEF_VALUE;
        this.color = Car.COLOR_DEF_VALUE;

    }


    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s:\nPower: %s\nDisplacement: %s\nEfficiency: %s\n" +
                        "Weight: %s\nColor: %s", this.model, this.engine.getModel(), this.engine.getPower()
                , this.engine.getDisplacement(), this.engine.getEfficiency(), this.weight, this.color);
    }
}