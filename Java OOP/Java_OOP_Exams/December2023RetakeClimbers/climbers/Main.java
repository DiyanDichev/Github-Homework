package Java_OOP_Exams.December2023RetakeClimbers.climbers;

import Java_OOP_Exams.December2023RetakeClimbers.climbers.core.ControllerImpl;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.core.Controller;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.core.Engine;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
