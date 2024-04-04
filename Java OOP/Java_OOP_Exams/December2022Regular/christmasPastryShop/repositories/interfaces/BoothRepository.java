package Java_OOP_Exams.December2022Regular.christmasPastryShop.repositories.interfaces;

public interface BoothRepository<T> extends Repository<T> {
    T getByNumber(int number);
}
