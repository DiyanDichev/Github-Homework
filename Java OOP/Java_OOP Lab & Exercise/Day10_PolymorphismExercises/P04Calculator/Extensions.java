package Day10_PolymorphismExercises.P04Calculator;

public class Extensions {
    private Extensions() {

    }
    public static InputInterpreter buildInterpreter(CalculationEngine engine) {
        return new ExtendedInterpreter(engine);
    }
}
