package Day12_Defining_Classes_Exercises.P05;

public class Engine {
    private static final String DISPLACEMENT_DEF_VALUE = "n/a";
    private static final String EFFICIENCY_DEF_VALUE = "n/a";
    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    public Engine(String model, String power) {
        this.model = model;
        this.power = power;
        this.displacement = Engine.DISPLACEMENT_DEF_VALUE;
        this.efficiency = Engine.EFFICIENCY_DEF_VALUE;

    }


    public Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return this.model;
    }

    public String getPower() {
        return this.power;
    }

    public String getDisplacement() {
        return this.displacement;
    }

    public String getEfficiency() {
        return this.efficiency;
    }
}