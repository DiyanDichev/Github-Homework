package Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.repositories;

import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.diver.Diver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DiverRepository implements Repository<Diver>{

    private Collection<Diver>divers;

    public DiverRepository() {
        this.divers = new ArrayList<>();
    }

    @Override
    public Collection<Diver> getCollection() {
        return Collections.unmodifiableCollection(this.divers);
    }

    @Override
    public void add(Diver diver) {
        this.divers.add(diver);
    }

    @Override
    public boolean remove(Diver diver) {
        if(this.divers.contains(diver)){
            this.divers.remove(diver);
            return true;
        }
        return false;
    }

    @Override
    public Diver byName(String name) {
        for (Diver diver : this.divers) {
            if(diver.getName().equals(name)){
                return diver;
            }
        }
        return null;
    }
}
