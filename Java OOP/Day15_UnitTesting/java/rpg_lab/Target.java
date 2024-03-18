package Day15_UnitTesting.java.rpg_lab;

public interface Target {
    int getHealth();
    void takeAttack(int attackPoints);
    int giveExperience();
    boolean isDead();
}
