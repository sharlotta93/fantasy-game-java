package FantasyGame.Rooms.RoomItems;

public abstract class Enemy implements IItem, IQuest {

    private String name;
    private int healthPoints;
    private int attackPoints;

    public Enemy (String name, int attackPoints) {
        this.name = name;
        this.healthPoints = 15;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public void removeHealthPoint(int attackPoints) {
        this.healthPoints -= attackPoints;
    }

}
