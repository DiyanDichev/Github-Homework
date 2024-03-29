package Java_OOP_Exams.August2023Retake.handball.entities.gameplay;

import Java_OOP_Exams.August2023Retake.handball.common.ExceptionMessages;
import Java_OOP_Exams.August2023Retake.handball.entities.equipment.Equipment;
import Java_OOP_Exams.August2023Retake.handball.entities.team.Team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseGameplay implements Gameplay {

    private String name;
    private int capacity;
    private Collection<Equipment> equipments;
    private Collection<Team> teams;

    public BaseGameplay(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.equipments = new ArrayList<>();
        this.teams = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.GAMEPLAY_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public int allProtection() {
        return this.equipments.stream().mapToInt(Equipment::getProtection).sum();
    }

    public void addTeam(Team team) {
        this.teams.add(team);
    }

    public void removeTeam(Team team) {
        this.teams.remove(team);
    }

    public void addEquipment(Equipment equipment) {
        this.equipments.add(equipment);
    }

    public void teamsInGameplay(){
        this.teams.forEach(Team::play);
    }

    @Override
    public Collection<Team> getTeam() {
        return this.teams;
    }

    @Override
    public Collection<Equipment> getEquipments() {
        return this.equipments;
    }

    public String toString(){
        return String.format("%s %s\nTeam: %s\nEquipment: %d, Protection: %d\n",
                this.name, this.getClass().getSimpleName(),
                this.teams.stream().map(Team::getName).collect(Collectors.joining(" ")),
                this.equipments.size(), allProtection());
    }


}
