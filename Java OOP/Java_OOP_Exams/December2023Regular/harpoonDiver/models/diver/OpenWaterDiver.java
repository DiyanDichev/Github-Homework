package Java_OOP_Exams.December2023Regular.harpoonDiver.models.diver;

public class OpenWaterDiver extends BaseDiver{
    private static final double INITIAL_OXYGEN = 30;

    public OpenWaterDiver(String name) {
        super(name, INITIAL_OXYGEN);
    }
}
