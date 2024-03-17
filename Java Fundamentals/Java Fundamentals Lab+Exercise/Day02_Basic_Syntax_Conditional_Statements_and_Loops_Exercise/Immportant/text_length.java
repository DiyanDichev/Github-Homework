package Day02_Basic_Syntax_Conditional_Statements_and_Loops_Exercise.Immportant;

public class text_length {
    public static void main(String[] args) {

        String text = "Hello Java";

        // текстовете винаги започват от 0 тоест Дидо има стойност 0 1 2 3 (4 символа)
        System.out.println(text.length()); //ДЪЛЖИНА на самия текст
        System.out.println(text.charAt(0)); //ПОЗИЦИЯ на първия символ в текста

        //от текста дай ми символа който се намира на позиция,която е дължината на текста -1
        //ако искам да исползвам този метод за да чете текста на обратно трябва да направя for цикъл и стъпка i--
        //задача Day2_PO5_Login
        System.out.println(text.charAt(text.length() - 1 )); //последен символ
    }
}
