package PlayerTests;

import FantasyGame.Players.Knight;
import FantasyGame.Tools.FightingStuff.Sword;
import FantasyGame.Tools.FightingStuff.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class KnightTest {


    Knight knight;
    Weapon weapon;

    @Before
    public void before() {
        knight = new Knight ("John Smith");
        weapon = new Sword("Needle");
    }

    @Test
    public void hasName() {
        assertEquals("John Smith", knight.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(30, knight.getHealthPoints());
    }

    @Test
    public void weaponsStartsEmpty() {
        assertEquals(0, knight.totalWeapons());
    }

    @Test
    public void canAddWeapon() {
        knight.addWeapon(weapon);
        assertEquals(1, knight.totalWeapons());
    }

    @Test
    public void canChooseWeapon() {
        Weapon newWeapon = new Sword("Sting");
        knight.addWeapon(weapon);
        knight.addWeapon(newWeapon);
        knight.choseWeapon(newWeapon);
        assertEquals("Sting", knight.getWeaponName());
    }

    @Test
    public void cannotChooseHealingTool() {
        assertNull(knight.currentWeapon());
    }
}
