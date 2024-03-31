package Java_OOP_Exams.April2023Retake.vehicleShop.repositories;

import Java_OOP_Exams.April2023Retake.vehicleShop.models.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class VehicleRepository<T> implements Repository<Vehicle> {

    public Collection<Vehicle> vehicles = new ArrayList<>();
    @Override
    public Collection<Vehicle> getWorkers() {
        return Collections.unmodifiableCollection(this.vehicles);
    }

    @Override
    public void add(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

    @Override
    public boolean remove(Vehicle vehicle) {
        return this.vehicles.remove(vehicle);
    }

    @Override
    public Vehicle findByName(String name) {
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getName().equals(name)){
                return vehicle;
            }
        }
        return null;
    }
}
