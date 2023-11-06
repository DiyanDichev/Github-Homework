package Day15_Object_and_Classes_Exercise.P06_Order_by_Age;

public class P06_Order_by_Age {

    private String name;
    private String ID;
    private double age;

    public P06_Order_by_Age(String name, String ID, double age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public double getAge() {
        return age;
    }
}
