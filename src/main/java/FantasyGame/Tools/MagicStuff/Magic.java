package FantasyGame.Tools.MagicStuff;

public abstract class Magic {

    private String name;
    private int attackPoints;
    private int protectionPoints;

    public Magic(String name, int attackPoints, int protectionPoints) {
        this.name = name;
        this.attackPoints = attackPoints;
        this.protectionPoints = protectionPoints;
    }

    public String getName() {
        return name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getProtectionPoints() {
        return protectionPoints;
    }

}
