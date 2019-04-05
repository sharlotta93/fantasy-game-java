package ToolTests;

import FantasyGame.Tools.FightingStuff.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before() {
        sword = new Sword("Needle");
    }

    @Test
    public void hasName() {
        assertEquals("Needle", sword.getName());
    }

    @Test
    public void hasAttackPoints() {
        assertEquals(5, sword.getAttackPoints());
    }

}
