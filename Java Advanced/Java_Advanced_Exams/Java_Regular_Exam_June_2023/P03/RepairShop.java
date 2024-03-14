package Java_Advanced_Exams.Java_Regular_Exam_June_2023.P03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RepairShop {
    private int capacity;
    private List<Vehicle> vehicles;
    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    void addVehicle(Vehicle vehicle) {
        if (vehicles.size() < capacity) {
            this.vehicles.add(vehicle);
        }
    }

    boolean removeVehicle(String vin) {
        String vehicleToRemove = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVIN().equals(vin)) {
                vehicleToRemove = String.valueOf(vehicle);
                break;
            }
        }
        return vehicles.remove(vehicleToRemove);
    }

    int getCount() {
        return vehicles.size();
    }
    Vehicle getLowestMileage() {
        Optional<Vehicle> lowestMileageVehicle = vehicles.stream()
                .min(Comparator.comparingInt(Vehicle::getMillage));
        return lowestMileageVehicle.orElse(null);
    }
    String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicles in the preparatory:");
        sb.append(System.lineSeparator());

        for (Vehicle v : vehicles) {
            sb.append(v.toString());
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

}
