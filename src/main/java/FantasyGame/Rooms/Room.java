package FantasyGame.Rooms;

import java.util.ArrayList;

public abstract class Room {

    ArrayList<IItem> items;

    public Room () {
        items = new ArrayList();
    }

}
