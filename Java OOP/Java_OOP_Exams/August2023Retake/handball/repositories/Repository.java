package Java_OOP_Exams.August2023Retake.handball.repositories;

import Java_OOP_Exams.August2023Retake.handball.entities.equipment.Equipment;

public interface Repository {
    void add(Equipment equipment);
    boolean remove(Equipment equipment);
    Equipment findByType(String type);
}
