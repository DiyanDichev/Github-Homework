package Day15_UnitTesting.java.rpg_lab;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Before;
import org.mockito.Mockito;

public class HeroTest {
    private final static int TARGET_EXPERIENCE = 10;

    private Dummy dummy;
    private Axe axe;
    private Hero hero;
    Weapon weaponMock;
    Target targetMock;

    @Before
    public void setup() {
        weaponMock = Mockito.mock(Weapon.class);
        targetMock = Mockito.mock(Target.class);
        Mockito.when(targetMock.isDead()).thenReturn(true);
        Mockito.when(targetMock.giveExperience()).thenReturn(TARGET_EXPERIENCE);
        hero = new Hero("Cross Marian", weaponMock);
    }

    @Test
    public void testHeroGainXPWhenTargetDies() {
        hero.attack(targetMock);
        Assert.assertEquals(TARGET_EXPERIENCE, hero.getExperience());
    }

}