package Java_OOP_Exams.April2023Retake.vehicleShop.models.vehicle;

import Java_OOP_Exams.April2023Retake.vehicleShop.common.ExceptionMessages;

public class VehicleImpl implements Vehicle{

    private String name;
    private int strengthRequirements;

    public VehicleImpl(String name, int strengthRequirements) {
        this.setName(name);
        this.setStrengthRequirements(strengthRequirements);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name == null || name.equals("")){
            throw new IllegalArgumentException(ExceptionMessages.VEHICLE_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public int getStrengthRequired() {
        return this.strengthRequirements;
    }

    public void setStrengthRequirements(int strengthRequirements) {
        if(strengthRequirements < 0){
            throw new IllegalArgumentException(ExceptionMessages.VEHICLE_STRENGTH_LESS_THAN_ZERO);
        }
        this.strengthRequirements = strengthRequirements;
    }

    @Override
    public boolean reached() {
        return this.strengthRequirements == 0;
    }

    @Override
    public void making() {
        if(strengthRequirements - 5 < 0){
            this.strengthRequirements = 0;
        }else {
            this.strengthRequirements -= 5;
        }
    }
}
