package Java_OOP_Exams.April2023Retake.vehicleShop.models.worker;

import Java_OOP_Exams.April2023Retake.vehicleShop.models.tool.Tool;
import Java_OOP_Exams.April2023Retake.vehicleShop.common.ExceptionMessages;

import java.util.ArrayList;
import java.util.Collection;

public abstract class BaseWorker implements Worker{

    private String name;
    private int strength;
    private Collection<Tool> tools = new ArrayList<>();

    public BaseWorker(String name, int strength) {
        this.setName(name);
        this.setStrength(strength);
    }

    @Override
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        if (name == null || name.equals("")){
            throw new IllegalArgumentException(ExceptionMessages.WORKER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
    @Override
    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        if(strength < 0){
            throw new IllegalArgumentException(ExceptionMessages.WORKER_STRENGTH_LESS_THAN_ZERO);
        }
        this.strength = strength;
    }

    @Override
    public void working() {
        if(this.strength - 10 < 0){
            this.strength = 0;
        }else {
            this.strength -= 10;
        }

    }

    @Override
    public void addTool(Tool tool) {
        this.tools.add(tool);
    }

    @Override
    public boolean canWork() {
        return this.strength > 0;
    }
    @Override
    public Collection<Tool> getTools() {
        return this.tools;
    }
}
