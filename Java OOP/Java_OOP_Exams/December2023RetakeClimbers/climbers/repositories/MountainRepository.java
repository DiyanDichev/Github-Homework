package Java_OOP_Exams.December2023RetakeClimbers.climbers.repositories;

import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.mountain.Mountain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MountainRepository implements Repository<Mountain>{

private Collection<Mountain> mountains = new ArrayList<>();


    @Override
    public Collection<Mountain> getCollection() {
        return Collections.unmodifiableCollection(this.mountains);
    }

    @Override
    public void add(Mountain mountain) {
        this.mountains.add(mountain);
    }

    @Override
    public boolean remove(Mountain mountain) {
        if(this.mountains.contains(mountain)){
            this.mountains.remove(mountain);
            return true;
        }
        return false;
    }

    @Override
    public Mountain byName(String name) {
        for (Mountain mountain : this.mountains) {
            if(mountain.getName().equals(name)){
                return mountain;
            }
        }
        return null;
    }
}
