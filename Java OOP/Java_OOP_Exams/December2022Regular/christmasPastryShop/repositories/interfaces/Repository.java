package Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces;

import java.util.Collection;

public interface Repository<T> {

    Collection<T> getAll();

    void add(T t);

}
