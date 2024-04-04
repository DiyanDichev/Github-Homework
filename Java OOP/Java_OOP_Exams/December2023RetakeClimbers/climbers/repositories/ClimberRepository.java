package Java_OOP_Exams.December2023RetakeClimbers.climbers.repositories;

import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.climber.Climber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ClimberRepository implements Repository<Climber> {

    private Collection<Climber> climbers = new ArrayList<>();


    @Override
    public Collection<Climber> getCollection() {
        return Collections.unmodifiableCollection(climbers);
    }

    @Override
    public void add(Climber climber) {
        this.climbers.add(climber);
    }

    @Override
    public boolean remove(Climber climber) {
        if (this.climbers.contains(climber)) {
            this.climbers.remove(climber);
            return true;
        }
        return false;
    }

    //    @Override
//    public Climber byName(String name) {
//        for (Climber climber : this.climbers) {
//            if(climber.getName().equals(name)){
//                return climber;
//            }
//        }
//        return null;
//    }
    @Override
    public Climber byName(String name) {
        return this.climbers.stream()
                .filter(climber -> climber.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
