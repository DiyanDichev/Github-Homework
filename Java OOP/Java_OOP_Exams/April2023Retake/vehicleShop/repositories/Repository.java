package Java_OOP_Exams.April2023Retake.vehicleShop.repositories;

import java.util.Collection;

public interface Repository<T> {
    Collection<T> getWorkers();

    void add(T model);

    boolean remove(T model);

    T findByName(String name);
}
