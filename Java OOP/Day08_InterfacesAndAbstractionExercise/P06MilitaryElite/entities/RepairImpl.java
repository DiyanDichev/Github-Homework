package Day08_InterfacesAndAbstractionExercise.P06MilitaryElite.entities;

import Day08_InterfacesAndAbstractionExercise.P06MilitaryElite.interfaces.Repair;

public class RepairImpl implements Repair {
    private String partName;
    private int workedHours;

    public RepairImpl(String partName, int workedHours) {
        this.partName = partName;
        this.workedHours = workedHours;
    }

    @Override
    public String getPartName() {
        return partName;
    }

    @Override
    public int getWorkedHours() {
        return workedHours;
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d", this.partName, this.workedHours);
    }
}
