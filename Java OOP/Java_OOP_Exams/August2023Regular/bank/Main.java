package Java_OOP_Exams.August2023Regular.bank;

import Java_OOP_Exams.August2023Regular.bank.core.Engine;
import Java_OOP_Exams.August2023Regular.bank.core.EngineImpl;

public class Main {
    public static void main(String[] args) {

        Engine engine = new EngineImpl();
        engine.run();
    }
}
