import FantasyGame.FantasyGame;
import FantasyGame.Players.*;
import FantasyGame.Rooms.*;
import FantasyGame.Rooms.RoomItems.*;
import FantasyGame.Tools.FightingStuff.*;
import FantasyGame.Tools.MagicStuff.*;
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

    @Test
    public void canDuelTwoFighters() {
        Weapon axe = new Axe("Chooper");
        Player player2 = new Knight("Arthur");
        ((Knight) player2).addWeapon(axe);
        ((Knight) player2).choseWeapon(axe);

        String winnerIs = game.knightDuel(player, player2);
        assertEquals("Wally The Great", winnerIs);
        assertEquals(25, player2.getHealthPoints());
        assertEquals(30, player.getHealthPoints());
    }

    @Test
    public void canDuelTwoFightersItsADraw() {

        String winnerIs = game.knightDuel(player, player);
        assertEquals("It's a draw", winnerIs);
        assertEquals(30, player2.getHealthPoints());
        assertEquals(30, player.getHealthPoints());
    }

    @Test
    public void canDuelFighterAndWizard() {

        String winnerIs = game.mixDuel(player, player2, spell);
        assertEquals("Wally The Great", winnerIs);
        assertEquals(25, player2.getHealthPoints());
        assertEquals(30, player.getHealthPoints());
    }

    @Test
    public void canDuelWizardsDraw() {
        ISpell newSpell = new FireBall("FreeBall");

        Player player3 = new Wizard("Harry", dragon);
        ((Wizard)player3).addMagicSpell(newSpell);

        String winnerIs = game.wizardDuel(player2, spell, player3, newSpell);
        assertEquals("It's a draw", winnerIs);
        assertEquals(30, player2.getHealthPoints());
        assertEquals(30, player3.getHealthPoints());
    }

    @Test
    public void canDuelWizards() {
        ISpell newSpell = new FreezeBlast("Blast");

        Player player3 = new Wizard("Harry", dragon);
        ((Wizard)player3).addMagicSpell(newSpell);

        String winnerIs = game.wizardDuel(player2, spell, player3, newSpell);
        assertEquals("Harry", winnerIs);
        assertEquals(30, player3.getHealthPoints());
        assertEquals(26, player2.getHealthPoints());
    }

}
