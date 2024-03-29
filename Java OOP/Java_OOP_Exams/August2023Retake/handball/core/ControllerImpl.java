package Java_OOP_Exams.August2023Retake.handball.core;

import Java_OOP_Exams.August2023Retake.handball.entities.equipment.Kneepad;
import Java_OOP_Exams.August2023Retake.handball.entities.gameplay.Indoor;
import Java_OOP_Exams.August2023Retake.handball.entities.gameplay.Outdoor;
import Java_OOP_Exams.August2023Retake.handball.entities.team.Bulgaria;
import Java_OOP_Exams.August2023Retake.handball.entities.team.Germany;
import Java_OOP_Exams.August2023Retake.handball.repositories.EquipmentRepository;
import Java_OOP_Exams.August2023Retake.handball.entities.equipment.Equipment;
import Java_OOP_Exams.August2023Retake.handball.entities.gameplay.Gameplay;
import Java_OOP_Exams.August2023Retake.handball.entities.team.Team;

import java.util.HashMap;
import java.util.Map;

import static Java_OOP_Exams.August2023Retake.handball.common.ConstantMessages.*;
import static Java_OOP_Exams.August2023Retake.handball.common.ExceptionMessages.*;

public class ControllerImpl implements Controller{

    private EquipmentRepository equipment;
    private Map<String, Gameplay> gameplays;

    public ControllerImpl() {
        this.equipment = new EquipmentRepository();
        this.gameplays = new HashMap<>();
    }

    @Override
    public String addGameplay(String gameplayType, String gameplayName) {
        Gameplay currentGameplay = null;
        switch (gameplayType){
            case "Outdoor":
                currentGameplay = new Outdoor(gameplayName);
                break;
            case "Indoor":
                currentGameplay = new Indoor(gameplayName);
                break;
            default: throw new NullPointerException(INVALID_GAMEPLAY_TYPE);
        }
        this.gameplays.put(gameplayName,currentGameplay);
        return String.format(SUCCESSFULLY_ADDED_GAMEPLAY_TYPE,gameplayType);
    }

    @Override
    public String addEquipment(String equipmentType) {
        Equipment currentEquipment = null;
        switch (equipmentType){
            case "Kneepad":
                currentEquipment = new Kneepad();
                break;
            case "ElbowPad":
                currentEquipment = new Kneepad();
            default:throw new IllegalArgumentException(INVALID_EQUIPMENT_TYPE);
        }
        this.equipment.add(currentEquipment);
        return String.format(SUCCESSFULLY_ADDED_EQUIPMENT_TYPE,equipmentType);
    }

    @Override
    public String equipmentRequirement(String gameplayName, String equipmentType) {
        Equipment byType = this.equipment.findByType(equipmentType);
        if(byType == null){
            throw new IllegalArgumentException(String.format(NO_EQUIPMENT_FOUND, equipmentType));
        }
        this.equipment.remove(byType);
        this.gameplays.get(gameplayName).addEquipment(byType);
        return String.format(SUCCESSFULLY_ADDED_EQUIPMENT_IN_GAMEPLAY, equipmentType, gameplayName);

    }

    @Override
    public String addTeam(String gameplayName, String teamType, String teamName, String country, int advantage) {
        Team currentTeam = null;
        switch (teamType){
            case "Bulgaria":
                currentTeam = new Bulgaria(teamName,country,advantage);
                break;
            case "Germany":
                currentTeam = new Germany(teamName,country,advantage);
                break;
            default:throw new IllegalArgumentException(INVALID_TEAM_TYPE);
        }
        Gameplay gameplay = gameplays.get(gameplayName);
        boolean isSuitable = gameplay.getClass().getSimpleName().equals("Outdoor") && teamType.equals("Bulgaria") ||
                gameplay.getClass().getSimpleName().equals("Indoor") && teamType.equals("Germany");

        if(!isSuitable){
            return GAMEPLAY_NOT_SUITABLE;
        }
        this.gameplays.get(gameplayName).addTeam(currentTeam);
        return String.format(SUCCESSFULLY_ADDED_TEAM_IN_GAMEPLAY,teamType,gameplayName);
    }

    @Override
    public String playInGameplay(String gameplayName) {
        Gameplay gameplay = this.gameplays.get(gameplayName);
        gameplay.teamsInGameplay();

        return String.format(TEAMS_PLAYED, gameplay.getTeam().size());
    }

    @Override
    public String percentAdvantage(String gameplayName) {
        return String.format(ADVANTAGE_GAMEPLAY, gameplayName,
                this.gameplays.get(gameplayName).getTeam().stream().mapToInt(Team::getAdvantage).sum());
    }

    @Override
    public String getStatistics() {
        StringBuilder output = new StringBuilder();
        this.gameplays.values().forEach(output::append);
        return output.toString().trim();
    }
}
