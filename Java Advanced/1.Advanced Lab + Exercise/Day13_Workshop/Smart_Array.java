package Day13_Workshop;


public class Smart_Array{

    private static final int INITIAL_CAPACITY = 4;
    private int[] data;
    private int size;
    private int capacity;

    public Smart_Array() {
        this.data = new int[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;

    }
    public int size() {
        return  this.size;
    }

    public void add(int element) {
        if(this.size == this.capacity){
            this.resize();
        }
        this.data[this.size++] = element;
    }
    private void resize() {
        int newCapacity = this.capacity * 2;
        int[] temp = new int[newCapacity];
        if (this.size >= 0) System.arraycopy(data, 0, temp, 0, this.size);
        this.data = temp;
        this.capacity = newCapacity;
    }
}
