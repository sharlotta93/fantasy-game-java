package FantasyGame.Players;

import FantasyGame.Tools.MagicStuff.ICreature;
import FantasyGame.Tools.MagicStuff.ISpell;

public interface IMagic {

    int attackWithSpell(ISpell wantedSpell);
    void changeCreature(ICreature newCreature);
}
