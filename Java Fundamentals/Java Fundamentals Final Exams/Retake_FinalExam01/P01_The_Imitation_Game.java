package Final_Exams.Retake_FinalExam01;

import java.util.Scanner;

public class P01_The_Imitation_Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String encryptedCode = scanner.nextLine();
        StringBuilder code = new StringBuilder(encryptedCode);

        String input = scanner.nextLine();
        while (!input.equals("Decode")){

            String[] array = input.split("\\|");
            String command = array[0];
            switch (command){
                case "ChangeAll":
                    String firstIndex = array[1];
                    String secondIndex = array[2];
                    for (int i = 0; i < encryptedCode.length(); i++) {
                        String character = String.valueOf(code.charAt(i));
                        if(firstIndex.equals(character)){
                            code.deleteCharAt(i);
                            code.replace(i,i,secondIndex);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(array[1]);
                    String letter = array[2];
                    code.replace(index,index,letter);
                    break;
                case "Move":
                    int index1 = Integer.parseInt(array[1]);
                    for (int i = 0; i < index1; i++) {
                        String character = String.valueOf(code.charAt(i));
                        code.append(character);
                        code.deleteCharAt(i);
                        i--;
                        index1--;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", code);
    }
}
