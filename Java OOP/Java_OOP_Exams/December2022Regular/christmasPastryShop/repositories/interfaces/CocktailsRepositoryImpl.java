package Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces;

import Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.cocktails.interfaces.Cocktail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CocktailsRepositoryImpl implements CocktailRepository<Cocktail>{

    private Collection<Cocktail> cocktails = new ArrayList<>();
    @Override
    public Collection<Cocktail> getAll() {
        return Collections.unmodifiableCollection(this.cocktails);
    }

    @Override
    public void add(Cocktail cocktail) {
        this.cocktails.add(cocktail);
    }

    @Override
    public Cocktail getByName(String name) {
        return cocktails.stream().filter(e -> name.equals(e.getName())).findFirst().orElse(null);
    }
}
