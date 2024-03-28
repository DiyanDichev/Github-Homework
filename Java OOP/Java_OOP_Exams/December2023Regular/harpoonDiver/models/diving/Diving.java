package Java_OOP_Exams.December2023Regular.harpoonDiver.models.diving;

import Java_OOP_Exams.December2023Regular.harpoonDiver.models.diver.Diver;
import Java_OOP_Exams.December2023Regular.harpoonDiver.models.divingSite.DivingSite;

import java.util.Collection;

public interface Diving {

    void searching(DivingSite divingSite, Collection<Diver> divers);
}
