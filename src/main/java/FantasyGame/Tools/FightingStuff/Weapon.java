package FantasyGame.Tools.FightingStuff;

public abstract class Weapon {

    private String name;
    private int attackPoints;
    private int protectionPoints;

    public Weapon(String name, int attackPoints, int protectionPoints) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.protectionPoints = protectionPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getProtectionPoints() {
        return protectionPoints;
    }

    public String getName() {
        return name;
    }
}
