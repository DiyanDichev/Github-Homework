package Java_OOP_Exams.April2023Retake.vehicleShop.core;

import Java_OOP_Exams.April2023Retake.vehicleShop.models.shop.Shop;
import Java_OOP_Exams.April2023Retake.vehicleShop.models.shop.ShopImpl;
import Java_OOP_Exams.April2023Retake.vehicleShop.models.tool.Tool;
import Java_OOP_Exams.April2023Retake.vehicleShop.models.tool.ToolImpl;
import Java_OOP_Exams.April2023Retake.vehicleShop.models.vehicle.Vehicle;
import Java_OOP_Exams.April2023Retake.vehicleShop.models.vehicle.VehicleImpl;
import Java_OOP_Exams.April2023Retake.vehicleShop.models.worker.FirstShift;
import Java_OOP_Exams.April2023Retake.vehicleShop.models.worker.SecondShift;
import Java_OOP_Exams.April2023Retake.vehicleShop.models.worker.Worker;
import Java_OOP_Exams.April2023Retake.vehicleShop.repositories.VehicleRepository;
import Java_OOP_Exams.April2023Retake.vehicleShop.repositories.WorkerRepository;
import Java_OOP_Exams.April2023Retake.vehicleShop.common.ConstantMessages;
import Java_OOP_Exams.April2023Retake.vehicleShop.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.List;

public class ControllerImpl implements Controller{
    private WorkerRepository<Worker> workerRepository;
    private VehicleRepository<Vehicle> vehicleRepository;

    public ControllerImpl() {
        this.workerRepository = new WorkerRepository();
        this.vehicleRepository = new VehicleRepository();
    }

    @Override
    public String addWorker(String type, String workerName) {
        Worker worker;
        switch (type){
            case "FirstShift":
                worker = new FirstShift(workerName);
                break;
            case "SecondShift":
                worker = new SecondShift(workerName);
                break;
            default:throw new IllegalArgumentException(ExceptionMessages.WORKER_TYPE_DOESNT_EXIST);
        }
        this.workerRepository.add(worker);
        return String.format(ConstantMessages.ADDED_WORKER,type, workerName);
    }

    @Override
    public String addVehicle(String vehicleName, int strengthRequired) {
        Vehicle vehicle = new VehicleImpl(vehicleName, strengthRequired);
        this.vehicleRepository.add(vehicle);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_VEHICLE,vehicleName);
    }

    @Override
    public String addToolToWorker(String workerName, int power) {
        if(workerRepository.findByName(workerName) == null){
            throw new IllegalArgumentException(ExceptionMessages.HELPER_DOESNT_EXIST);
        }
        Tool tool = new ToolImpl(power);
        workerRepository.findByName(workerName).addTool(tool);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_TOOL_TO_WORKER, power, workerName);
    }

    @Override
    public String makingVehicle(String vehicleName) {
        List<Worker> collect = new ArrayList<>();
        for (Worker worker : workerRepository.getWorkers()) {
            if(worker.getStrength() > 70){
                collect.add(worker);
            }
        }
        if(collect.isEmpty()){
            throw new IllegalArgumentException(ExceptionMessages.NO_WORKER_READY);
        }
        int brokenTools = 0;
        Vehicle vehicle = vehicleRepository.findByName(vehicleName);

        Shop shop = new ShopImpl();
        for (Worker worker : collect) {
            shop.make(vehicle,worker);
            for (Tool tool : worker.getTools()) {
                if(tool.isUnfit()){
                    brokenTools++;
                }
            }
            if (vehicle.reached()) {
                break;
            }
        }
        boolean isDone = vehicle.reached();
        String output = "";
        if (isDone) {
            output = "done";
        } else {
            output = "not done";
        }
        return String.format(ConstantMessages.VEHICLE_DONE, vehicleName, output) + String.format(ConstantMessages.COUNT_BROKEN_INSTRUMENTS, brokenTools);
    }


    @Override
    public String statistics() {
        StringBuilder statistics = new StringBuilder();
        int ready = 0;
        for (Vehicle vehicle : this.vehicleRepository.getWorkers()) {
            if (vehicle.reached()) {
                ready++;
            }
        }
        statistics.append(String.format("%d vehicles are ready!", ready)).append(System.lineSeparator());
        statistics.append(String.format("Info for workers:")).append(System.lineSeparator());
        for (Worker worker : this.workerRepository.getWorkers()) {
            int leftTools = 0;
            for (Tool tool : worker.getTools()) {
                if (!tool.isUnfit()) {
                    leftTools++;
                }
            }
            statistics.append(String.format("Name: %s, Strength: %d", worker.getName(), worker.getStrength())).append(System.lineSeparator());
            statistics.append(String.format("Tools: %d fit left", leftTools)).append(System.lineSeparator());
        }
        return statistics.toString().trim();
    }
}
