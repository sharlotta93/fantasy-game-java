package FantasyGame.Tools.FightingStuff;

public abstract class Weapon {

    private String name;
    private int attackPoints;

    public Weapon(String name, int attackPoints) {
        this.name = name;
        this.attackPoints = attackPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public String getName() {
        return name;
    }
}
