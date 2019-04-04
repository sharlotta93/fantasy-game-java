package FantasyGame.Rooms.RoomItems;

import FantasyGame.Players.Knight;
import FantasyGame.Rooms.RoomItems.Enemy;

public class Ogre extends Enemy {

    public Ogre(String name, int attackPoints) {
        super(name, attackPoints);
    }

    public void attack(Knight knight) {
        knight.removeHealthPoint(getAttackPoints()); //move to enemy class
    }
}
