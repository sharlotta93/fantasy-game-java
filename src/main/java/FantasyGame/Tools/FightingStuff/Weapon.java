package FantasyGame.Tools.FightingStuff;

public abstract class Weapon {

    private int attackPoints;
    private int protectionPoints;

    public Weapon(int attackPoints, int protectionPoints) {
        this.attackPoints = attackPoints;
        this.protectionPoints = protectionPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getProtectionPoints() {
        return protectionPoints;
    }

}
