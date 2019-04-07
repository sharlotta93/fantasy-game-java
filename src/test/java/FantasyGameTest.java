import FantasyGame.FantasyGame;
import FantasyGame.Players.*;
import FantasyGame.Rooms.*;
import FantasyGame.Rooms.RoomItems.*;
import FantasyGame.Tools.FightingStuff.*;
import FantasyGame.Tools.MagicStuff.Dragon;
import FantasyGame.Tools.MagicStuff.FireBall;
import FantasyGame.Tools.MagicStuff.ICreature;
import FantasyGame.Tools.MagicStuff.ISpell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FantasyGameTest {

    FantasyGame game;
    Player player;
    Player player2;
    Room room;
    Sword weapon;
    Enemy enemy;
    Treasure treasure;
    ICreature dragon;
    ISpell spell;

    @Before
    public void before() {
        weapon = new Sword("Needle");

        enemy = new Ogre("Jason", 4);
        player = new Knight("Wally The Great");
        ((Knight) player).addWeapon(weapon);
        ((Knight) player).choseWeapon(weapon);

        dragon = new Dragon("Bagbie");
        player2 = new Wizard("Gandalf", dragon);
        spell = new FireBall("Baam");
        ((Wizard)player2).addMagicSpell(spell);

        treasure = new Treasure();
        treasure.add(TreasureType.COINS);
        treasure.add(TreasureType.DIAMONDS);

        room = new DarkForrest(treasure);

        Room room2 = new CaveOfWonders(enemy);

        game = new FantasyGame();
        game.addRoom(room);
        game.addRoom(room2);

    }

    @Test
    public void canPlayGameKnight() {
        game.addPlayer(player);
        game.startQuest();
        assertEquals(30, player.getTotalTreasure());
        assertEquals(30, player.getHealthPoints());
        assertEquals(10, enemy.getHealthPoints());
    }

    @Test
    public void canPlayGameWizard() {
        game.addPlayer(player2);
        game.startQuest();
        assertEquals(30, player2.getTotalTreasure());
        assertEquals(30, player2.getHealthPoints());
        assertEquals(0, enemy.getHealthPoints());
        assertEquals(false, enemy.checkAliveStatus());
    }

}
