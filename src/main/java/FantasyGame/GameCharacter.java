package FantasyGame;

public abstract class GameCharacter {

    private String name;
    private int healthPoints;
    private boolean isAlive;

    public GameCharacter(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.isAlive = true;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void removeHealthPoint(int attackPoints) {
        this.healthPoints -= attackPoints;
        if (attackPoints > healthPoints) {
            healthPoints = 0;
            changeIsAliveStatus();
        }
    }

    public boolean checkAliveStatus() {
        return isAlive;
    }

    public boolean changeIsAliveStatus() {
        return isAlive = false;
    }

    public abstract int attack();
}
