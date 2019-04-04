package FantasyGame.Players;

import FantasyGame.Tools.MagicStuff.ICreature;
import FantasyGame.Tools.MagicStuff.ISpell;

public interface IMagic {

    ISpell choseSpell(ISpell wantedSpell);
    void changeCreature(ICreature newCreature);
}
