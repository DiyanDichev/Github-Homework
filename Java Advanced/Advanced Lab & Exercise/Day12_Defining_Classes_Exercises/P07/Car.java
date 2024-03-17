package Day12_Defining_Classes_Exercises.P07;

public class Car {
    private String carModel;
    private String carSpeed;

    public Car(String carModel, String carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarSpeed() {
        return carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getCarModel(), getCarSpeed());
    }
}