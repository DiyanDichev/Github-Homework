package Java_OOP_Exams.December2022Regular.christmasPastryShop.io;

import Java_OOP_Exams.December2022Regular.christmasPastryShop.io.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {
    public void writeLine(String text) {
        System.out.println(text);
    }
}
