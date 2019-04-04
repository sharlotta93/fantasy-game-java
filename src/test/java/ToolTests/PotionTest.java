package ToolTests;

import FantasyGame.Tools.ClericalStuff.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PotionTest {

    Potion potion;

    @Before
    public void before() {
        potion = new Potion();
    }

    @Test
    public void hasHealingPower() {
        assertEquals(5, potion.getHealingPoints());
    }
}
