package Java_OOP_Exams.August2023Retake.handball.entities.gameplay;

import Java_OOP_Exams.August2023Retake.handball.entities.team.Team;
import Java_OOP_Exams.August2023Retake.handball.entities.equipment.Equipment;

import java.util.Collection;

public interface Gameplay {
    int allProtection();

    void addTeam(Team team);

    void removeTeam(Team team);

    void addEquipment(Equipment equipment);

    void teamsInGameplay();

    Collection<Team> getTeam();

    Collection<Equipment> getEquipments();

    String getName();


}
