package Java_OOP_Exams.December2022Retake.magicGame.models.magicians;

import Java_OOP_Exams.December2022Retake.magicGame.models.magics.Magic;

public interface Magician {
    String getUsername();

    int getHealth();

    int getProtection();

    Magic getMagic();

    boolean isAlive();

    void takeDamage(int points);
}
