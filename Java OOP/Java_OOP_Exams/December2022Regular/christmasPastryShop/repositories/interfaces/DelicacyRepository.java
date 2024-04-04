package Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces;

public interface DelicacyRepository<T> extends Repository<T> {
    T getByName(String name);
}
