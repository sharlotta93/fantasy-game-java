package FantasyGame.Tools.MagicStuff;

public class FreezeBlast extends Magic implements ISpell {

    public FreezeBlast(String name) {
        super(name, 4);
    }

    public String castSpell() {
        return "Here is the FreezeBlast!";
    }
}
