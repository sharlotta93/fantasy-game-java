package FantasyGame.Rooms;

import FantasyGame.Rooms.RoomItems.IItem;
import FantasyGame.Rooms.RoomItems.IQuest;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<IItem> items;
    private IQuest questType;

    public Room (IQuest questType) {
        items = new ArrayList();
        this.questType = questType;
        addQuestToRoom();
    }

    public void addItem(IItem item) {
        items.add(item);
    }

    public int totalItems() {
        return items.size();
    }

    public void addQuestToRoom() {
        items.add((IItem) questType);
    }



}
