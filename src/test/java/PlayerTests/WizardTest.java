package PlayerTests;

import FantasyGame.Players.Wizard;
import FantasyGame.Tools.FightingStuff.Sword;
import FantasyGame.Tools.FightingStuff.Weapon;
import FantasyGame.Tools.MagicStuff.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WizardTest {

    Wizard wizard;
    ICreature dragon;
    ISpell spell;

    @Before
    public void before() {
        dragon = new Dragon("Bobby");
        wizard = new Wizard ("Gandalf", dragon);
        spell = new FireBall("FireBall");
    }

    @Test
    public void hasName() {
        assertEquals("Gandalf", wizard.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(30, wizard.getHealthPoints());
    }

    @Test
    public void spellsStartsEmpty() {
        assertEquals(0, wizard.totalSpells());
    }

    @Test
    public void canAddSpell() {
        wizard.addMagicSpell(spell);
        assertEquals(1, wizard.totalSpells());
    }

    @Test
    public void creatureHasName() {
        assertEquals("Bobby", wizard.getCreaturesName());
    }

    @Test
    public void canChangeCreature() {
        ICreature newCreature = new Dragon("Frodo");
        wizard.changeCreature(newCreature);
        assertEquals("Frodo", wizard.getCreaturesName());
    }

    @Test
    public void canAttackWithSpell() {
        wizard.addMagicSpell(spell);
        assertEquals(2, wizard.attackWithSpell(spell));
    }
}
