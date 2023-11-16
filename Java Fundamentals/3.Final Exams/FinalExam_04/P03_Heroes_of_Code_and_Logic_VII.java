package Final_Exams.FinalExam_04;

import java.util.*;

public class P03_Heroes_of_Code_and_Logic_VII {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, List <Integer>> heroesData = new LinkedHashMap<>();

        for (int i = 0; i < countOfHeroes; i++) {
            String[] heroesList = scanner.nextLine().split(" ");
            String heroes = heroesList[0];
            int heroHP = Integer.parseInt(heroesList[1]);
            int heroMP = Integer.parseInt(heroesList[2]);

            heroesData.put(heroes, new ArrayList<>());
            heroesData.get(heroes).add(heroHP);
            heroesData.get(heroes).add(heroMP);
        }

        String[] command = scanner.nextLine().split(" - ");
        while (!command[0].equals("End")){
            String operator = command[0];
            String heroName = command[1];
            int currentHP = heroesData.get(heroName).get(0);
            int currentMP = heroesData.get(heroName).get(1);
            switch (operator){
                case "CastSpell":
                    int spellMP = Integer.parseInt(command[2]);
                    String spellName = command[3];
                    if(heroesData.get(heroName).get(1) >= spellMP){
                        heroesData.get(heroName).set(1, currentMP - spellMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!\n",
                                heroName, spellName, heroesData.get(heroName).get(1));
                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(command[2]);
                    String attacker = command[3];
                    int hpAfterAttack = currentHP - damage;
                    if(hpAfterAttack > 0){
                        heroesData.get(heroName).set(0, hpAfterAttack);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",
                                heroName, damage, attacker, hpAfterAttack);
                    }else {
                        heroesData.remove(heroName);
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int rechargeMP = Integer.parseInt(command[2]);
                    if (currentMP + rechargeMP <= 200){
                        heroesData.get(heroName).set(1, currentMP + rechargeMP);
                        System.out.printf("%s recharged for %d MP!\n", heroName,rechargeMP );
                    }else {
                        int mp = 200 - currentMP;
                        heroesData.get(heroName).set(1, currentMP + mp);
                        System.out.printf("%s recharged for %d MP!\n", heroName,mp );
                    }
                    break;
                case "Heal":
                    int rechargeHP = Integer.parseInt(command[2]);
                    if (currentHP + rechargeHP <= 100){
                        heroesData.get(heroName).set(0, currentHP + rechargeHP);
                        System.out.printf("%s healed for %d HP!\n", heroName,rechargeHP );
                    }else {
                        int hp = 100 - currentHP;
                        heroesData.get(heroName).set(0, currentHP + hp);
                        System.out.printf("%s healed for %d HP!\n", heroName,hp );
                    }
                    break;
            }
            command = scanner.nextLine().split(" - ");
        }
        heroesData.entrySet().stream()
                .forEach(kvp -> System.out.printf("%s\n  HP: %d\n  MP: %d\n",
                        kvp.getKey(), kvp.getValue().get(0), kvp.getValue().get(1)));
    }
}
