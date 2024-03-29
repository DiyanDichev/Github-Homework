package Java_OOP_Exams.April2023Regular.robotService.repositories;

import Java_OOP_Exams.April2023Regular.robotService.entities.supplements.Supplement;

public interface Repository {

    void addSupplement(Supplement supplement);

    boolean removeSupplement(Supplement supplement);

    Supplement findFirst(String type);
}
