package FantasyGame.Rooms;

import FantasyGame.Rooms.RoomItems.Enemy;
import FantasyGame.Rooms.RoomItems.IQuest;
import FantasyGame.Rooms.RoomItems.Treasure;

public abstract class Room {

    private IQuest questType;

    public Room (IQuest questType) {
        this.questType = questType;
    }

    public boolean questType() {
        return questType.isTreasure();
    }

    public int treasure() {
        return ((Treasure)questType).totalTreasureValue();
    }

    public Enemy getEnemy() {
        return ((Enemy) questType);
    }
}
