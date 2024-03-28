package Java_OOP_Exams.December2023Regular.harpoonDiver;

import Java_OOP_Exams.December2023Regular.harpoonDiver.core.Controller;
import Java_OOP_Exams.December2023Regular.harpoonDiver.core.ControllerImpl;
import Java_OOP_Exams.December2023Regular.harpoonDiver.core.Engine;
import Java_OOP_Exams.December2023Regular.harpoonDiver.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
