package Java_OOP_Exams.December2022Retake.magicGame.repositories.interfaces;

import Java_OOP_Exams.December2022Retake.magicGame.models.magicians.Magician;

import java.util.Collection;

public interface MagicianRepository<T> {
    Collection<T> getData();

    void addMagician(Magician model);

    boolean removeMagician(Magician model);

    T findByUsername(String name);
}
