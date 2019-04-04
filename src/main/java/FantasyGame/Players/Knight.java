package FantasyGame.Players;

import FantasyGame.Rooms.RoomItems.Ogre;
import FantasyGame.Tools.FightingStuff.*;

import java.util.ArrayList;

public class Knight extends Player implements IFighter{


    private ArrayList<Weapon> weapons;
    private Weapon currentWeapon;


    public Knight(String name) {
        super(name);
        weapons = new ArrayList<>();
        currentWeapon = null;

    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public Weapon choseWeapon(Weapon chosenWeapon) {
        int weaponIndex = weapons.indexOf(chosenWeapon);
        if (weaponIndex != -1) {
            currentWeapon = chosenWeapon;
//            weapons.remove(chosenWeapon);
        }
        return currentWeapon;
    }

    public int totalWeapons() {
        return this.weapons.size();
    }

    public String getWeaponName() {
        return currentWeapon.getName();
    }

    public Weapon currentWeapon() {
        return currentWeapon;
    }

    public void attack(Ogre ogre) {
        ogre.removeHealthPoint(currentWeapon.getAttackPoints());
    } //move to abstract class
}
