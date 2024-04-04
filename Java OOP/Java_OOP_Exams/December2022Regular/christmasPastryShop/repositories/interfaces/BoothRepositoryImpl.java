package Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces;

import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.booths.interfaces.Booth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BoothRepositoryImpl implements BoothRepository<Booth>{

    private Collection<Booth> booths = new ArrayList<>();
    @Override
    public Booth getByNumber(int number) {
        return booths.stream().filter(t -> t.getBoothNumber() == number).findFirst().orElse(null);
    }

    @Override
    public Collection<Booth> getAll() {
        return Collections.unmodifiableCollection(this.booths);
    }

    @Override
    public void add(Booth booth) {
        this.booths.add(booth);
    }
}
