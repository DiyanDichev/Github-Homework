package Day12_Defining_Classes_Exercises.P09;

public class Cymric extends Cat {

    private double furLength;

    public Cymric(String name, String type, double furLength) {
        super(name, type);
        this.furLength = furLength;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f",
                super.toString(),
                this.furLength);
    }
}