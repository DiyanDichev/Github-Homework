package Day06_InheritanceExercise.P06Animals;

public class Dog extends Animal {
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public String produceSound() {
        return String.format("Woof!");
    }
}
