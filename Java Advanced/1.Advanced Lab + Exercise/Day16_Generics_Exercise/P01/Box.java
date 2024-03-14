package Day16_Generics_Exercise.P01;

public class Box<T> {
    private T data;

    public Box(T data) {
        this.data = data;
    }

    @Override
    public String toString() {

        return String.format("%s: %s",this.data.getClass().getName(), this.data);
    }
}