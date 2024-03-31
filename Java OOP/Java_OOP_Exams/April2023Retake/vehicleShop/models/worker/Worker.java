package Java_OOP_Exams.April2023Retake.vehicleShop.models.worker;

import Java_OOP_Exams.April2023Retake.vehicleShop.models.tool.Tool;

import java.util.Collection;

public interface Worker {
    void working();

    void addTool(Tool tool);

    boolean canWork();

    String getName();

    int getStrength();

    Collection<Tool> getTools();
}
