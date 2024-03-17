package Day10_PolymorphismExercises.P02VehiclesExtension;

public class Bus extends BaseVehicles {
    private final static double ADDITIONAL_AC_CONSUMPTION = 1.4;
    public Bus(Double fuelQuantity, Double fuelConsumption, Double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    @Override
    public String drive (Double distance) {
        super.setFuelConsumption(super.getFuelConsumption() + ADDITIONAL_AC_CONSUMPTION);
        return super.drive(distance);
    }

    public String driveEmpty (Double distance) {
        return super.drive(distance);
    }
}
