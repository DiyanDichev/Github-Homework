package Java_OOP_Exams.August2023Retake.handball.entities.gameplay;

import Java_OOP_Exams.August2023Retake.handball.common.ExceptionMessages;
import Java_OOP_Exams.August2023Retake.handball.entities.equipment.Equipment;
import Java_OOP_Exams.August2023Retake.handball.entities.team.Team;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class BaseGameplay implements Gameplay {


    private String name;
    private int capacity;
    private Collection<Equipment> equipments = new ArrayList<>();
    private Collection<Team> teams = new ArrayList<>();

    public BaseGameplay(String name, int capacity) {
        this.setName(name);
        this.capacity = capacity;
    }

    @Override
    public int allProtection() {
        double equipmentSum = this.equipments.stream().mapToDouble(Equipment::getPrice).sum();
        return (int) equipmentSum;
    }

    @Override
    public void addTeam(Team team) {
        this.teams.add(team);
    }

    @Override
    public void removeTeam(Team team) {
        this.teams.remove(team);
    }

    @Override
    public void addEquipment(Equipment equipment) {
        this.equipments.add(equipment);
    }

    @Override
    public void teamsInGameplay() {
        this.teams.stream().forEach(Team::play);
    }

    @Override
    public Collection<Team> getTeam() {
        return Collections.unmodifiableCollection(this.teams);
    }

    @Override
    public Collection<Equipment> getEquipments() {
        return Collections.unmodifiableCollection(this.equipments);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.GAMEPLAY_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public String toString(){
        return String.format("%s %s\n",getName(),getClass().getSimpleName())+
                String.format("Team: %s\n",this.teams.stream().map(Team::getName).collect(Collectors.joining(" ")))+
                String.format("Equipment: %d, Protection: %d\n",this.equipments.size(),this.allProtection());
    }
}
