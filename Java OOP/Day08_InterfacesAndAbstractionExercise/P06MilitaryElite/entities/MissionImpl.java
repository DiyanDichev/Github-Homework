package Day08_InterfacesAndAbstractionExercise.P06MilitaryElite.entities;

import Day08_InterfacesAndAbstractionExercise.P06MilitaryElite.enums.Status;
import Day08_InterfacesAndAbstractionExercise.P06MilitaryElite.interfaces.Mission;

public class MissionImpl implements Mission {
    private String CodeName;
    private Status status;

    public MissionImpl(String CodeName, String status) {
        this.CodeName = CodeName;
        setStatus(status);
    }

    @Override
    public String getCodeName() {
        return CodeName;
    }

    @Override
    public Status getState() {
        return status;
    }


    private void setStatus(String status) {
        if (!status.equals("inProgress") && !status.equals("finished")) {
            throw new IllegalArgumentException("Invalid mission state!");
        }
        this.status = Status.valueOf(status);
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", this.CodeName, this.status.toString());
    }
}
