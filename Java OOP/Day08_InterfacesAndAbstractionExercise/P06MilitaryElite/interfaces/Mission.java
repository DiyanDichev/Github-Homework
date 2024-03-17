package Day08_InterfacesAndAbstractionExercise.P06MilitaryElite.interfaces;

import Day08_InterfacesAndAbstractionExercise.P06MilitaryElite.enums.Status;

public interface Mission {
    String getCodeName();

    Status getState();
}
