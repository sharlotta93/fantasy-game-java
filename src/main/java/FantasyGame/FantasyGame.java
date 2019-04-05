package FantasyGame;

import FantasyGame.Rooms.RoomItems.IItem;
import FantasyGame.Rooms.RoomItems.IQuest;
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

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void startTheGame() {
        Player player = players.remove(0);

        for (int i=0 ; i < rooms.size() ; i++) {
            Room room = rooms.get(i);

            for (int j = 0; j < room.totalItems(); j++) {
                IItem item = room.getItem(j);
                if (((IQuest) item).isTreasure()) {
                    player.collectTreasure(item);
                } else if (!((IQuest) item).isTreasure()) {
                    if (battle(player, (Enemy) item)) {
                        System.out.println("Player Won");
                    } else {
                        System.out.println("Enemy Won");
                    }
                }
            }
        }
    }

    public boolean battle(Player knight, Enemy enemy) {
        Knight player = ((Knight)knight);

        int playerAttackPoints = player.currentWeapon().getAttackPoints();
        int enemyAttackPoints = enemy.getAttackPoints();
        System.out.println(enemyAttackPoints);
        System.out.println(playerAttackPoints);

        if (player.currentWeapon().getAttackPoints() > enemyAttackPoints) {
            enemy.removeHealthPoint(playerAttackPoints);
            return true;
        } else {
            player.removeHealthPoint(enemyAttackPoints);
            return false;
        }
    }




}

