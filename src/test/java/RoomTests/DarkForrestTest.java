package RoomTests;

import FantasyGame.Rooms.DarkForrest;
import FantasyGame.Rooms.RoomItems.IQuest;
import FantasyGame.Rooms.RoomItems.Treasure;
import FantasyGame.Rooms.RoomItems.TreasureType;
import FantasyGame.Rooms.RoomItems.Tree;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DarkForrestTest {

    DarkForrest room;
    IQuest treasure;
    Tree tree;

    @Before
    public void before() {
        treasure = new Treasure();
        tree = new Tree();
        ((Treasure) treasure).add(TreasureType.DIAMONDS);
        room = new DarkForrest(treasure);
    }

    @Test
    public void hasQuest() {
        assertEquals(1, room.totalItems());
    }

    @Test
    public void canAddItem() {
        room.addItem(tree);
        assertEquals(2, room.totalItems());
    }
}
