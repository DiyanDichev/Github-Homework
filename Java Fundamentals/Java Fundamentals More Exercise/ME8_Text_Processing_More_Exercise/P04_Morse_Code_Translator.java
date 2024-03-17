package More_Exercise.ME8_Text_Processing_More_Exercise;

import java.util.Scanner;

public class P04_Morse_Code_Translator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] morseCode = input.split(" ");
        String message = "";

        for (int i = 0; i < morseCode.length; i++) {
            String command = morseCode[i];
            switch (command) {
                case ".-":
                    message += 'A';
                    break;
                case "-...":
                    message += 'B';
                    break;
                case "-.-.":
                    message += 'C';
                    break;
                case "-..":
                    message += 'D';
                    break;
                case ".":
                    message += 'E';
                    break;
                case "..-.":
                    message += 'F';
                    break;
                case "--.":
                    message += 'G';
                    break;
                case "....":
                    message += 'H';
                    break;
                case "..":
                    message += 'I';
                    break;
                case ".---":
                    message += 'J';
                    break;
                case "-.-":
                    message += 'K';
                    break;
                case ".-..":
                    message += 'L';
                    break;
                case "--":
                    message += 'M';
                    break;
                case "-.":
                    message += 'N';
                    break;
                case "---":
                    message += 'O';
                    break;
                case ".--.":
                    message += 'P';
                    break;
                case "--.-":
                    message += 'Q';
                    break;
                case ".-.":
                    message += 'R';
                    break;
                case "...":
                    message += 'S';
                    break;
                case "-":
                    message += 'T';
                    break;
                case "..-":
                    message += 'U';
                    break;
                case "...-":
                    message += 'V';
                    break;
                case ".--":
                    message += 'W';
                    break;
                case "-..-":
                    message += 'X';
                    break;
                case "-.--":
                    message += 'Y';
                    break;
                case "--..":
                    message += 'Z';
                    break;
                case "|":
                    message += ' ';
                    break;
                default:
                    break;
            }
        }
        System.out.println(message);
    }
}
