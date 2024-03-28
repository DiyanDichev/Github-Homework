package Day10_PolymorphismExercises.P04Calculator;

public class MemoryRecallOperation implements Operation {
    private MemoryStorageOperation memoryStorage;

    public MemoryRecallOperation(MemoryStorageOperation memoryStorage) {
        this.memoryStorage = memoryStorage;
    }

    @Override
    public void addOperand(int operand) {

    }

    @Override
    public int getResult() {
        return this.memoryStorage.getResult();
    }

    @Override
    public boolean isCompleted() {
        return true;
    }
}
