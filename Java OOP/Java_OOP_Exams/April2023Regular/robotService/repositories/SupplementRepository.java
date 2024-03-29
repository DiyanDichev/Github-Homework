package Java_OOP_Exams.April2023Regular.robotService.repositories;

import Java_OOP_Exams.April2023Regular.robotService.entities.supplements.Supplement;

import java.util.ArrayList;
import java.util.Collection;

public class SupplementRepository implements Repository{

    private Collection<Supplement> supplements;

    public SupplementRepository() {
        this.supplements = new ArrayList<>();
    }

    public void addSupplement(Supplement supplement){
        this.supplements.add(supplement);
    }

    public boolean removeSupplement(Supplement supplement){
        return this.supplements.remove(supplement);
    }

    public Supplement findFirst(String type){
        return this.supplements.stream()
                .filter(s -> s.getClass().getSimpleName().equals(type))
                .findFirst()
                .orElse(null);
    }
}
