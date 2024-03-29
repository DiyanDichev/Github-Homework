package Java_OOP_Exams.April2023Regular.robotService;

import Java_OOP_Exams.April2023Regular.robotService.core.Engine;
import Java_OOP_Exams.April2023Regular.robotService.core.EngineImpl;

public class Main {
    public static void main(String[] args) {

        Engine engine = new EngineImpl();
        engine.run();
    }
}
