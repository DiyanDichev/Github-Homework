package Day08_InterfacesAndAbstractionExercise.P06MilitaryElite.interfaces;

import java.util.Collection;

public interface Commando {
    void addMission(Mission mission);

    Collection<Mission> getMissions();

}
