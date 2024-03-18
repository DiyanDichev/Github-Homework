package Day15_UnitTesting.test.java.rgb_lab;


import Day15_UnitTesting.java.rpg_lab.Axe;
import Day15_UnitTesting.java.rpg_lab.Dummy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static Day15_UnitTesting.java.rpg_lab.Axe.DURABILITY_LOSS;


public class AxeTest {
    
    private static final int AXE_ATTACK_POINTS = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int BROKEN_AXE = 0;
    private static final int DUMMY_START_HEALTH = 10;
    private static final int DUMMY_EXPERIENCE = 10;
    private Axe axe;
    private Dummy dummy;

    @Before
    public void setup(){
        axe = new Axe(AXE_ATTACK_POINTS,AXE_DURABILITY);
        dummy = new Dummy(DUMMY_START_HEALTH,DUMMY_EXPERIENCE);
    }

    @Test
    public void testAxeLosesDurabilityAfterAttack(){
        axe.attack(dummy);
        Assert.assertEquals(AXE_ATTACK_POINTS - DURABILITY_LOSS,
                axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAttackWithBrokenAxeShouldThrowException(){
        Axe axe = new Axe(AXE_ATTACK_POINTS, BROKEN_AXE);
        axe.attack(dummy);
    }

}