package FantasyGame.Rooms.RoomItems;

import FantasyGame.GameCharacter;

public abstract class Enemy extends GameCharacter implements IQuest {

    private int attackPoints;

    public Enemy (String name, int attackPoints) {
        super(name, 15);
        this.attackPoints = attackPoints;
    }

    public boolean isTreasure() {return false;}

    public int attack() {
        return attackPoints;
    }

}
