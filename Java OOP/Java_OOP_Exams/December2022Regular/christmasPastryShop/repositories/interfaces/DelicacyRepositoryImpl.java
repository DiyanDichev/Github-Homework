package Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces;

import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.delicacies.interfaces.Delicacy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DelicacyRepositoryImpl implements DelicacyRepository<Delicacy> {
    private Collection<Delicacy> delicacies;

    public DelicacyRepositoryImpl() {
        this.delicacies = new ArrayList<>();
    }

    @Override
    public Delicacy getByName(String name) {
        return delicacies.stream().filter(f->name.equals(f.getName())).findFirst().orElse(null);
    }

    @Override
    public Collection<Delicacy> getAll() {
        return Collections.unmodifiableCollection(this.delicacies);
    }

    @Override
    public void add(Delicacy food) {
        this.delicacies.add(food);
    }
}
