package Day06_InheritanceExercises.P06Animals;

public class Kitten extends Cat {
    private static final String GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return String.format("Meow");
    }
}
