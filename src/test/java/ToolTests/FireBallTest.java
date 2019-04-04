package ToolTests;

import FantasyGame.Tools.MagicStuff.FireBall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FireBallTest {

    FireBall fireBall;

    @Before
    public void before() {
        fireBall = new FireBall("FireBall");
    }

    @Test
    public void hasName() {
        assertEquals("FireBall", fireBall.getName());
    }

    @Test
    public void hasAttackPoints() {
        assertEquals(2, fireBall.getAttackPoints());
    }

    @Test
    public void hasProtectionPoints() {
        assertEquals(2, fireBall.getProtectionPoints());
    }
}
