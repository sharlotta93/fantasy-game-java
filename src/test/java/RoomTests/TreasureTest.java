package RoomTests;

import FantasyGame.Rooms.RoomItems.Treasure;
import FantasyGame.Rooms.RoomItems.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureTest {

    Treasure treasure;

    @Before
    public void before() {
        treasure = new Treasure();
    }

    @Test
    public void canAddValue() {
        treasure.add(TreasureType.COINS);
        treasure.add(TreasureType.GOLD);
        treasure.add(TreasureType.DIAMONDS);
        assertEquals(60, treasure.totalTreasureValue());
    }
}
