package Day09_Polymorphism.P01MathOperation;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MathOperation mathOperation = new MathOperation();
        System.out.println(mathOperation.add(2, 2));
        System.out.println(mathOperation.add(3, 3, 3));
        System.out.println(mathOperation.add(4, 4, 4, 4));
    }
}
