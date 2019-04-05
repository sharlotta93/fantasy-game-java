package ToolTests;


import FantasyGame.Tools.MagicStuff.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before() {
        dragon = new Dragon("Freddie");
    }

    @Test
    public void hasName() {
        assertEquals("Freddie", dragon.getName());
    }

    @Test
    public void hasAttackPoints() {
        assertEquals(20, dragon.getAttackPoints());
    }

}
