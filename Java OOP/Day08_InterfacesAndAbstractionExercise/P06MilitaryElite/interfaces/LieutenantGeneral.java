package Day08_InterfacesAndAbstractionExercise.P06MilitaryElite.interfaces;

import java.util.Collection;

public interface LieutenantGeneral extends Soldier {
    void addPrivate(Soldier soldier);

    Collection<Soldier> getPrivates();
}
