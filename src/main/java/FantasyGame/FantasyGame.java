package FantasyGame;

import FantasyGame.Rooms.RoomItems.IItem;
import FantasyGame.Rooms.RoomItems.Ogre;
import FantasyGame.Tools.FightingStuff.*;
import FantasyGame.Players.*;
import FantasyGame.Rooms.*;
import FantasyGame.Rooms.RoomItems.Enemy;

import java.util.ArrayList;

public class FantasyGame {

    private ArrayList<Room> rooms;
    private ArrayList<Player> players;

    public FantasyGame() {
        this.rooms = new ArrayList<>();
        this.players = new ArrayList<>();
    }

    public void startTheGame() {
        Player player = players.remove(0);
        Room room = rooms.remove(0);

        for (int i=0 ; i < room.totalItems() ; i++) {
            IItem item = room.getItem(i);
            if (item == Treasure)
        }
    }

    public boolean battle(IFighter fighter, Enemy enemy) {
        Knight player = ((Knight)fighter);
       Ogre ogre = ((Ogre) enemy);

       player.attack(ogre);
       ogre.attack(player);
       if (player.getHealthPoints() > ogre.getHealthPoints()) {
           return true;
       }
       return false;
    }




}

