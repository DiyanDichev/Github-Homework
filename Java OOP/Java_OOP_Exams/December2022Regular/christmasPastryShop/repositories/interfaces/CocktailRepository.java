package Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces;

public interface CocktailRepository<T> extends Repository<T> {
    T getByName(String name);
}
