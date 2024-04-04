package Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.delicacies.interfaces;

public class Stolen extends BaseDelicacy{

    private static int INITIAL_GINGERBREAD_PORTION = 250;
    public Stolen(String name, double price) {
        super(name, INITIAL_GINGERBREAD_PORTION, price);
    }
}
