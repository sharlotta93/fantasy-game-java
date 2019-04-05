package FantasyGame.Players;

import FantasyGame.Rooms.RoomItems.Enemy;
import FantasyGame.Tools.MagicStuff.ICreature;
import FantasyGame.Tools.MagicStuff.ISpell;
import FantasyGame.Tools.MagicStuff.Magic;

import java.util.ArrayList;

public class Wizard extends Player implements IMagic{

    private ArrayList<ISpell> magicSpells;
    private ICreature creature;

    public Wizard(String name, ICreature creature) {
        super(name);
        this.creature = creature;
        this.magicSpells = new ArrayList<>();
    }

    public int totalSpells() {
        return magicSpells.size();
    }

    public void addMagicSpell(ISpell newSpell) {
        magicSpells.add(newSpell);
    }

    public int attackWithSpell(ISpell wantedSpell) {
        ISpell mySpell = null;
        int spellIndex = magicSpells.indexOf(wantedSpell);
        if (spellIndex != -1) {
            mySpell = wantedSpell;
            magicSpells.remove(wantedSpell);
        }
        return ((Magic)mySpell).getAttackPoints();
    }

    public void changeCreature(ICreature newCreature) {
        this.creature = newCreature;
    }

    public String getCreaturesName() {
        return ((Magic) creature).getName();
    }

    public int attack() {
       return ((Magic)creature).getAttackPoints();
    }

}
