package Java_OOP_Exams.April2023Retake.vehicleShop.models.shop;

import Java_OOP_Exams.April2023Retake.vehicleShop.models.tool.Tool;
import Java_OOP_Exams.April2023Retake.vehicleShop.models.vehicle.Vehicle;
import Java_OOP_Exams.April2023Retake.vehicleShop.models.worker.Worker;

public class ShopImpl implements Shop{
    @Override
    public void make(Vehicle vehicle, Worker worker) {
        if(worker.canWork()){
            for (Tool tool : worker.getTools()) {
                while (!tool.isUnfit()){
                    if (!tool.isUnfit() && worker.canWork()) {
                        vehicle.making();
                        worker.working();
                        tool.decreasesPower();
                    }
                    if(vehicle.reached() || !worker.canWork()){
                        return;
                    }
                }
            }
        }
    }
}
