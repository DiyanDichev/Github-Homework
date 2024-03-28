package Java_OOP_Exams.December2023Retake.climbers.repositories;

import Java_OOP_Exams.December2023Retake.climbers.models.mountain.Mountain;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MountainRepository implements Repository<Mountain>{

    private final Map<String, Mountain> mountains;

    public MountainRepository(){
        this.mountains = new LinkedHashMap<>();
    }

    @Override
    public void add(Mountain entity) {
        mountains.put(entity.getName(), entity);
    }

    @Override
    public boolean remove(Mountain entity) {
        return mountains.remove(entity.getName()) != null;
    }

    @Override
    public Mountain byName(String name) {
        return mountains.get(name);
    }
    @Override
    public Collection<Mountain> getCollection() {
        return Collections.unmodifiableCollection(this.mountains.values());
    }
}
