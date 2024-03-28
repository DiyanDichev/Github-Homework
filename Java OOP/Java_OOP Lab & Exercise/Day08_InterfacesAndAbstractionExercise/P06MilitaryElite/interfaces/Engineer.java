package Day08_InterfacesAndAbstractionExercise.P06MilitaryElite.interfaces;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);

    Collection<Repair> getRepairs();
}
