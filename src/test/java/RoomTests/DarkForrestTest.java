package RoomTests;

import FantasyGame.Rooms.DarkForrest;
import FantasyGame.Rooms.RoomItems.IQuest;
import FantasyGame.Rooms.RoomItems.Treasure;
import FantasyGame.Rooms.RoomItems.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DarkForrestTest {

    DarkForrest room;
    IQuest treasure;

    @Before
    public void before() {
        treasure = new Treasure();
        ((Treasure) treasure).add(TreasureType.DIAMONDS);
        room = new DarkForrest(treasure);
    }

    @Test
    public void hasQuestType() {
        assertEquals(true, room.questType());
    }

}
