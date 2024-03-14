package Java_Advanced_Exams.Java_Regular_Exam_June_2023.P03;

public class Vehicle {

    private String VIN;
    private int millage;
    private String damage;
    public Vehicle(String VIN, int millage, String damage) {
        this.VIN = VIN;
        this.millage = millage;
        this.damage = damage;
    }
    public String getVIN() {
        return VIN;
    }

    public int getMillage() {
        return millage;
    }

    @Override
    public String toString() {
        return String.format("Damage: %s, Vehicle: %s (%d km)",damage,VIN,millage);
    }
}
