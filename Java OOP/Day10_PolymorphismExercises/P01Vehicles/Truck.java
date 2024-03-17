package Day10_PolymorphismExercises.P01Vehicles;

public class Truck extends BaseVehicles {
    private final static double ADDITIONAL_AC_CONSUMPTION = 1.6;
    private final static double REFUEL_PERCENTAGE = 0.95;
    public Truck(Double fuelQuantity, Double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        super.setFuelConsumption(super.getFuelConsumption() + ADDITIONAL_AC_CONSUMPTION);
    }

    @Override
    public void refuel(Double litters) {
        litters *= REFUEL_PERCENTAGE;
        super.refuel(litters);
    }
}
