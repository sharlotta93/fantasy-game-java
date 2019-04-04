package RoomTests;

import FantasyGame.Rooms.RoomItems.Ogre;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class OgreTests {

    Ogre ogre;

    @Before
    public void before() {
        ogre = new Ogre("Shrek", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Shrek", ogre.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(15, ogre.getHealthPoints());
    }

    @Test
    public void hasAttackPoint() {
        assertEquals(10, ogre.getAttackPoints());
    }

    @Test
    public void canRemoveHealthPoint() {
        ogre.removeHealthPoint(5);
        assertEquals(10, ogre.getHealthPoints());
    }
}

