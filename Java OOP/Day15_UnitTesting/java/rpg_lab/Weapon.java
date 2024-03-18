package Day15_UnitTesting.java.rpg_lab;

public interface Weapon {
    int getAttackPoints();
    int getDurabilityPoints();
    void attack(Target target);
}
