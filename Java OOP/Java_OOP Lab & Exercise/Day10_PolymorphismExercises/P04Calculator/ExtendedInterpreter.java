package Day10_PolymorphismExercises.P04Calculator;

public class ExtendedInterpreter extends InputInterpreter{
    private MemoryStorageOperation memoryStorage;

    public ExtendedInterpreter(CalculationEngine engine) {
        super(engine);
        this.memoryStorage = new MemoryStorageOperation();
    }

    @Override
    public Operation getOperation(String operation) {
        if (operation.equals("/")) {
            return new DivideOperation();
        } else if (operation.equals("ms")) {
            return this.memoryStorage;
        } else if (operation.equals("mr")) {
            return new MemoryRecallOperation(memoryStorage);
        } else {
            return super.getOperation(operation);
        }
    }
}
