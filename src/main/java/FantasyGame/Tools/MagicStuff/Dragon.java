package FantasyGame.Tools.MagicStuff;

public class Dragon extends Magic implements ICreature{

    private String name;

    public Dragon(String name) {
        super(name, 20);
    }

    public String makesNoise() {
        return "ROOOAARRR";
    }


}
