package PlayerTests;

import FantasyGame.Players.Cleric;
import FantasyGame.Tools.ClericalStuff.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ClericTest {

    Cleric cleric;
    Potion potion;

    @Before
    public void before() {
        cleric = new Cleric ("John Smith");
        potion = new Potion ();
    }

    @Test
    public void hasName() {
        assertEquals("John Smith", cleric.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(30, cleric.getHealthPoints());
    }

    @Test
    public void healingToolsStartsEmpty() {
        assertEquals(0, cleric.totalHealingTools());
    }

    @Test
    public void canAddHealingTool() {
        cleric.addHealingTool(potion);
        assertEquals(1, cleric.totalHealingTools());
    }

    @Test
    public void canChooseHealingTool() {
        cleric.addHealingTool(potion);
        cleric.addHealingTool(potion);
        cleric.chooseHealingTool();
        assertEquals(1, cleric.totalHealingTools());
    }

    @Test
    public void cannotChooseHealingTool() {
        assertNull(cleric.chooseHealingTool());
    }

}
