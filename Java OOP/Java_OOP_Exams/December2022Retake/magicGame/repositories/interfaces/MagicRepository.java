package Java_OOP_Exams.December2022Retake.magicGame.repositories.interfaces;

import Java_OOP_Exams.December2022Retake.magicGame.models.magics.Magic;

import java.util.Collection;

public interface MagicRepository<T> {
    Collection<T> getData();

    void addMagic(Magic model);

    boolean removeMagic(Magic model);

    T findByName(String name);
}
