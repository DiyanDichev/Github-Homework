package Day18_Iterastos_and_Comparators_Exercise.P03;

import java.util.Iterator;
import java.util.function.Consumer;

public class StackIterator implements Iterable<Integer> {
    private Integer[] elements;
    private int currentIndex;


    public StackIterator() {
        this.elements = new Integer[20];
        this.currentIndex = 0;
    }

    public void push(int element) {
        this.elements[this.currentIndex] = element;
        this.currentIndex++;
    }

    public Integer pop() {
        try {
            Integer element = this.elements[this.currentIndex - 1];
            this.elements[this.currentIndex - 1] = null;
            this.currentIndex--;
            return element;
        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new IllegalStateException("No elements");
        }
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator();
    }

    private class CustomIterator implements Iterator<Integer> {
        private int index = currentIndex;
        @Override
        public boolean hasNext() {
            return index > 0;
        }

        @Override
        public Integer next() {
            return elements[--index];
        }
    }
}