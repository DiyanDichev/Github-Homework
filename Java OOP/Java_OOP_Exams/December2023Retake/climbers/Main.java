package Java_OOP_Exams.December2023Retake.climbers;


import Java_OOP_Exams.December2023Retake.climbers.core.Controller;
import Java_OOP_Exams.December2023Retake.climbers.core.ControllerImpl;
import Java_OOP_Exams.December2023Retake.climbers.core.Engine;
import Java_OOP_Exams.December2023Retake.climbers.core.EngineImpl;

public class Main {

    public static void main(String[] args) {
        Controller controller = new ControllerImpl();
        Engine engine = new EngineImpl(controller);
        engine.run();
    }
}
