package Day12_Defining_Classes_Exercises.P03;

public class Car {

    private String model;
    private double fuel;
    private double consumption;
    private int distance;

    public Car(String model, double fuel, double consumption) {
        this.model = model;
        this.fuel = fuel;
        this.consumption = consumption;
        this.distance = 0;
    }

    public boolean drive(int distance) {
        double fuelNeeded = distance * this.consumption;
        if (this.fuel >= fuelNeeded) {
            this.fuel -= fuelNeeded;
            this.distance += distance;
            return true;
        }
        return false;
    }

    public String getInfo() {
        return String.format("%s %.2f %d", this.model, this.fuel, this.distance);
    }
}