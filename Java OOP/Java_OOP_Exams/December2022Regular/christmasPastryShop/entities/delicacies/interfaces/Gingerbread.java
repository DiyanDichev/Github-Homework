package Java_OOP_Exams.December2022Regular.christmasPastryShop.entities.delicacies.interfaces;

public class Gingerbread extends BaseDelicacy{

    private static int INITIAL_GINGERBREAD_PORTION = 200;
    public Gingerbread(String name, double price) {
        super(name, INITIAL_GINGERBREAD_PORTION, price);
    }
}
