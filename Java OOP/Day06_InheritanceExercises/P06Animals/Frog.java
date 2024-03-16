package Day06_InheritanceExercises.P06Animals;

public class Frog extends Animal {
    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public String produceSound() {
        return String.format("Ribbit");
    }
}
