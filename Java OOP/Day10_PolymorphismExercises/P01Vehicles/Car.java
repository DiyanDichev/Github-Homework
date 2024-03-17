package Day10_PolymorphismExercises.P01Vehicles;

public class Car extends BaseVehicles {
    private final static double ADDITIONAL_AC_CONSUMPTION = 0.9;
    public Car(Double fuelQuantity, Double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        super.setFuelConsumption(super.getFuelConsumption() + ADDITIONAL_AC_CONSUMPTION);
    }
}
