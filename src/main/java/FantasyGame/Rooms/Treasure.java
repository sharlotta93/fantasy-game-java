package FantasyGame.Rooms;

import java.util.ArrayList;

public class Treasure implements IItem {

    private ArrayList<TreasureType> treasures;

    public Treasure() {
        this.treasures = new ArrayList<>();
    }

    public void add(TreasureType type) {
        this.treasures.add(type);
    }

    public int totalTreasureValue() {
        int totalValue = 0;
        for(int i = 0; i < this.treasures.size(); i++) {
            TreasureType type = this.treasures.get(i);
            totalValue += type.getValue();
        }
        return totalValue;
    }

}
