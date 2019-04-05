import FantasyGame.FantasyGame;
import FantasyGame.Players.*;
import FantasyGame.Rooms.*;
import FantasyGame.Rooms.RoomItems.*;
import FantasyGame.Tools.FightingStuff.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FantasyGameTest {

    FantasyGame game;
    Player player;
    Room room;
    Sword weapon;
    Enemy enemy;
    Treasure treasure;

    @Before
    public void before() {
        weapon = new Sword("Needle");

        enemy = new Ogre("Jason", 4);
        player = new Knight("Wally The Great");
        ((Knight) player).addWeapon(weapon);
        ((Knight) player).choseWeapon(weapon);

        treasure = new Treasure();
        treasure.add(TreasureType.COINS);
        treasure.add(TreasureType.DIAMONDS);

        room = new DarkForrest(treasure);

        Room room2 = new CaveOfWonders(enemy);

        game = new FantasyGame();
        game.addRoom(room);
        game.addRoom(room2);
        game.addPlayer(player);
    }

    @Test
    public void canPlayGame() {
        game.startTheGame();
        assertEquals(30, player.getTotalTreasure());
        assertEquals(30, player.getHealthPoints());
        assertEquals(10, enemy.getHealthPoints());
    }

}
