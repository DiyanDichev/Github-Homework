package Day18_Iterastos_and_Comparators_Exercise.P01;

import java.util.List;

public class ListyIterator<T> {
    private List<T> elements;
    private int currentIndex;

    public ListyIterator(T... elements) {
        this.elements = List.of(elements);
        this.currentIndex = 0;
    }
    public boolean move() {
        if (hasNext()) {
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public boolean hasNext() {
        if (this.currentIndex < this.elements.size() - 1) {
            return true;
        }
        return false;
    }

    public void print() {
        if (this.elements.size() == 0) {
            throw new IllegalStateException("Invalid Operation!");
        } else {
            System.out.printf("%s%n", this.elements.get(currentIndex));
        }
    }
}