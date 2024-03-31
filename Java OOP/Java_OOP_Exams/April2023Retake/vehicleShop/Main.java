package Java_OOP_Exams.April2023Retake.vehicleShop;

import Java_OOP_Exams.April2023Retake.vehicleShop.core.Engine;
import Java_OOP_Exams.April2023Retake.vehicleShop.core.EngineImpl;

public class Main {
    public static void main(String[] args) {
        Engine engine = new EngineImpl();
        engine.run();
    }
}
