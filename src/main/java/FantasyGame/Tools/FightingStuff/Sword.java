package FantasyGame.Tools.FightingStuff;

public class Sword extends Weapon{

    private String name;

    public Sword(String name) {
        super(5, 3);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
