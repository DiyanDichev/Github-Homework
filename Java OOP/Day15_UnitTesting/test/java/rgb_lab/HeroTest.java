package Day15_UnitTesting.test.java.rgb_lab;

import Day15_UnitTesting.java.rpg_lab.Axe;
import Day15_UnitTesting.java.rpg_lab.Dummy;
import Day15_UnitTesting.java.rpg_lab.Hero;
import Day15_UnitTesting.java.rpg_lab.Target;
import org.junit.Assert;
import org.junit.Test;

public class HeroTest {

    @Test
    public void testHeroGainsXPWhenTargetDies(){

        Target target = new Target() {
            @Override
            public int getHealth() {
                return 0;
            }

            @Override
            public void takeAttack(int attackPoints) {

            }

            @Override
            public int giveExperience() {
                return 0;
            }

            @Override
            public boolean isDead() {
                return true;
            }
        };
        Axe axe = new Axe(10,10);
        Hero hero = new Hero("Pesho",axe);

        hero.attack(target);

        Assert.assertEquals(10,hero.getExperience());
    }

}