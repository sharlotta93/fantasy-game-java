package FantasyGame.Tools.MagicStuff;

public abstract class Magic {

    private String name;
    private int attackPoints;

    public Magic(String name, int attackPoints) {
        this.name = name;
        this.attackPoints = attackPoints;
    }

    public String getName() {
        return name;
    }

    public int getAttackPoints() {
        return attackPoints;
    }


}
