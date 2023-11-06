package MidExam05;

import java.util.Scanner;

public class P02_MuOnline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] dungeon = scanner.nextLine().split("\\|");

        int startingHealth = 100;
        int startingBitcoins = 0;
        int bestRoom = 0;

        for (int i = 0; i < dungeon.length; i++) {
            if (dungeon[i].contains("potion")) {
                int health = Integer.parseInt(dungeon[i].split(" ")[1]);
                int addedHealth = 0;
                for (int j = 1; j <= health; j++) {
                    if (startingHealth != 100) {
                        addedHealth++;
                        startingHealth++;
                        if (startingHealth == 100) {
                            bestRoom++;
                            break;
                        } else if (j == health) {
                            bestRoom++;
                        }
                    } else {
                        System.out.printf("You healed for %d hp.\n", j);
                        System.out.printf("Current health: %d hp.\n", startingHealth);
                        bestRoom++;
                        break;
                    }
                }
                System.out.printf("You healed for %d hp.\n", addedHealth);
                System.out.printf("Current health: %d hp.\n", startingHealth);
            } else if (dungeon[i].contains("chest")) {
                int chest = Integer.parseInt(dungeon[i].split(" ")[1]);
                startingBitcoins += chest;
                bestRoom++;
                System.out.printf("You found %d bitcoins.\n", chest);
            } else {
                int damage = Integer.parseInt(dungeon[i].split(" ")[1]);
                String mobType = dungeon[i].split(" ")[0];
                if (damage < startingHealth) {
                    startingHealth -= damage;
                    bestRoom++;
                    System.out.printf("You slayed %s.\n", mobType);

                } else {
                    bestRoom++;
                    System.out.printf("You died! Killed by %s.\n", mobType);
                    System.out.printf("Best room: %d\n", bestRoom);
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d\n", startingBitcoins);
        System.out.printf("Health: %d\n", startingHealth);
    }
}
