package FantasyGame.Players;

import FantasyGame.Tools.FightingStuff.Weapon;

public interface IFighter {

    Weapon choseWeapon(Weapon weapon);

    int attack();
}
