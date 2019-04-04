package FantasyGame.Tools.MagicStuff;

public class FireBall extends Magic implements ISpell {

    public FireBall(String name) {
        super(name, 2, 2);
    }

    public String castSpell() {
        return "Here is the FireBall!";
    }
}
