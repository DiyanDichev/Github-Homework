package Day06_InheritanceExercise.P06Animals;

public class Cat extends Animal {
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return String.format("Meow meow");
    }
}
