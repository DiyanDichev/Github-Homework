package Java_OOP_Exams.December2023Regular.harpoonDiver.models.diving;

import Java_OOP_Exams.December2023Regular.harpoonDiver.models.diver.Diver;
import Java_OOP_Exams.December2023Regular.harpoonDiver.models.divingSite.DivingSite;

import java.util.Collection;

public class DivingImpl implements Diving {
    @Override
    public void searching(DivingSite divingSite, Collection<Diver> divers) {

        Collection<String> divingSiteSeaCreatures = divingSite.getSeaCreatures();

        for (Diver diver : divers) {
            while (diver.canDive() && divingSiteSeaCreatures.iterator().hasNext()) {
                diver.shoot();

                String currentSeaCreature =divingSiteSeaCreatures.iterator().next();
                diver.getSeaCatch().getSeaCreatures().add(currentSeaCreature);
                divingSiteSeaCreatures.remove(currentSeaCreature);
            }
        }
    }
}
