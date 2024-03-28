package Java_OOP_Exams.December2023Retake.climbers.models.climber;

public class WallClimber extends BaseClimber{

    private static final double INITIAL_STRENGTH = 90;
    public WallClimber(String name){
        super(name,INITIAL_STRENGTH);
    }

    @Override
    public void climb() {
        this.setStrength(this.getStrength() - 30);
    }
}
