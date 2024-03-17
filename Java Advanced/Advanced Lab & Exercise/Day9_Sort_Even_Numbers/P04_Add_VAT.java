package Day9_Sort_Even_Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class P04_Add_VAT {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] data = reader.readLine().split(",\\s+");
        Function<String[],Double[]> doubleParser = x -> {
            Double[] result = new Double[x.length];
            for (int i = 0; i < x.length; i++) {
                String s = x[i];
                result[i]= Double.parseDouble(s);
            }
            return result;
        };

        Double[] doubles = doubleParser.apply(data);

        UnaryOperator<Double[]> addVAT = x -> {
            for (int i = 0; i < x.length; i++) {
                x[i] = x[i] * 1.2;
            }
            return x;
        };

        addVAT.apply(doubles);

        Consumer<Double[]> printDoubleArray = x -> {
            System.out.println("Prices with VAT:");
            for (Double aDouble : x) {
                System.out.printf("%.2f\n",aDouble);
            }
        };


        printDoubleArray.accept(doubles);

    }
}
