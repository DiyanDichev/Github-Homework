package Day10_PolymorphismExercises.P03Word;

public class CutTransform implements TextTransform {
    private StringBuilder lastCut = new StringBuilder();

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        lastCut = new StringBuilder();
        lastCut.append(text.substring(startIndex, endIndex));
        text.delete(startIndex, endIndex);
    }

    public StringBuilder getLastCut() {
        return this.lastCut;
    }
}
