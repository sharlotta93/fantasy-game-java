package FantasyGame.Rooms.RoomItems;

public enum TreasureType {
    GOLD(30),
    DIAMONDS(20),
    COINS(10);

    private final int value;

    TreasureType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }


}
