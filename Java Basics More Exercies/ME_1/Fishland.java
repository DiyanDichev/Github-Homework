package ME_1;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double palamudVhod = Double.parseDouble(scanner.nextLine());
        double safridVhod = Double.parseDouble(scanner.nextLine());
        double palamudVhodKg = Double.parseDouble(scanner.nextLine());
        double safridVhodKg = Double.parseDouble(scanner.nextLine());
        double midiVhodKg = Double.parseDouble(scanner.nextLine());
        double palamudProcent = palamudVhod + (palamudVhod * (60/100.0));
        double palamudCena = palamudProcent * palamudVhodKg;
        double safridProcent = safridVhod + (safridVhod * (80/100.0));
        double safridCena = safridProcent * safridVhodKg;
        double midiCena = midiVhodKg * 7.50;
        double total = palamudCena + safridCena + midiCena;
        System.out.printf("%.2f" , total);

    }
}