package Final_Exams.FinalExam_04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Fancy_Barcodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<barcode>[A-Z][A-Za-z\\d]{4,}[A-Z])@#+";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String barcode = matcher.group("barcode");
                String digits = "";
                for (int j = 0; j < barcode.length(); j++) {
                    boolean isDigit = Character.isDigit(barcode.charAt(j));
                    if (isDigit) {
                        digits += String.valueOf(barcode.charAt(j));
                    }
                }
                if (digits.equals("")) {
                    System.out.printf("Product group: 00\n");
                } else {
                    System.out.printf("Product group: %s\n", digits);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
