package Java_OOP_Exams.April2023Regular.robotService.core;

import Java_OOP_Exams.April2023Regular.robotService.common.ConstantMessages;
import Java_OOP_Exams.April2023Regular.robotService.common.ExceptionMessages;
import Java_OOP_Exams.April2023Regular.robotService.entities.robot.Robot;
import Java_OOP_Exams.April2023Regular.robotService.entities.services.Service;
import Java_OOP_Exams.April2023Regular.robotService.entities.supplements.Supplement;
import Java_OOP_Exams.April2023Regular.robotService.entities.robot.FemaleRobot;
import Java_OOP_Exams.April2023Regular.robotService.entities.robot.MaleRobot;
import Java_OOP_Exams.April2023Regular.robotService.entities.services.MainService;
import Java_OOP_Exams.April2023Regular.robotService.entities.services.SecondaryService;
import Java_OOP_Exams.April2023Regular.robotService.entities.supplements.MetalArmor;
import Java_OOP_Exams.April2023Regular.robotService.entities.supplements.PlasticArmor;
import Java_OOP_Exams.April2023Regular.robotService.repositories.SupplementRepository;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ControllerImpl implements Controller{

    private SupplementRepository supplementRepository;
    private Map<String, Service> services;

    public ControllerImpl() {
        this.supplementRepository = new SupplementRepository();
        this.services = new LinkedHashMap<>();
    }

    public String addService(String type, String name) {
        Service service;
        switch (type){
            case "MainService":
                service = new MainService(name);
                break;
            case "SecondaryService":
                service = new SecondaryService(name);
                break;
            default:throw new NullPointerException(ExceptionMessages.INVALID_SERVICE_TYPE);
        }
        services.put(name, service);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_SERVICE_TYPE, type);
    }

    public String addSupplement(String type){
        Supplement supplement;
        switch (type){
            case "PlasticArmor":
                supplement = new PlasticArmor();
                break;
            case "MetalArmor":
                supplement = new MetalArmor();
                break;
            default:throw new IllegalArgumentException(ExceptionMessages.INVALID_SUPPLEMENT_TYPE);
        }
        this.supplementRepository.addSupplement(supplement);
        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_SUPPLEMENT_TYPE,type);
    }

    public String supplementForService(String serviceName, String supplementType){
        Supplement supplementForService = this.supplementRepository.findFirst(supplementType);
        if (supplementForService == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.NO_SUPPLEMENT_FOUND, supplementType));
        }
        Service service = this.services.get(serviceName);
        service.addSupplement(supplementForService);
        this.supplementRepository.removeSupplement(supplementForService);

        return String.format(ConstantMessages.SUCCESSFULLY_ADDED_SUPPLEMENT_IN_SERVICE, supplementType, serviceName);
    }

    public String addRobot(String serviceName, String robotType, String robotName, String robotKind, double price){
        Robot robot;
        switch (robotType){
            case "FemaleRobot":
                robot = new FemaleRobot(robotName,robotKind,price);
                break;
            case "MaleRobot":
                robot = new MaleRobot(robotName,robotKind,price);
                break;
            default:throw new IllegalArgumentException(ExceptionMessages.INVALID_ROBOT_TYPE);
        }
        Service service = this.services.get(serviceName);
        String output;

        if (!isSuitableService(robotType, service)) {
            output = ConstantMessages.UNSUITABLE_SERVICE;
        } else {
            service.addRobot(robot);
            output = String.format(ConstantMessages.SUCCESSFULLY_ADDED_ROBOT_IN_SERVICE, robotType, serviceName);
        }

        return output;
    }

    private boolean isSuitableService(String robotType, Service service) {
        String bankType = service.getClass().getSimpleName();

        if (robotType.equals("FemaleRobot") && bankType.equals("SecondaryService")) {
            return true;
        } else if (robotType.equals("MaleRobot") && bankType.equals("MainService")) {
            return true;
        }

        return false;
    }

    public String feedingRobot(String serviceName){
        Service service = this.services.get(serviceName);
        service.feeding();

        return String.format(ConstantMessages.FEEDING_ROBOT, service.getRobots().size());
    }

    public String sumOfAll(String serviceName) {
        Service service = this.services.get(serviceName);
        double robotPrices = service.getRobots().stream()
                .mapToDouble(Robot::getPrice).sum();
        double supplementPrices = service.getSupplements().stream()
                .mapToDouble(Supplement::getPrice).sum();

        return String.format(ConstantMessages.VALUE_SERVICE, serviceName, robotPrices + supplementPrices);
    }

    public String getStatistics() {
        return services.values()
                .stream()
                .map(Service::getStatistics)
                .collect(Collectors.joining(System.lineSeparator())).trim();
    }
}
