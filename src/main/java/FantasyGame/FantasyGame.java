package FantasyGame;

import FantasyGame.Rooms.RoomItems.IQuest;
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

                if (room.questType()) {
                    player.collectTreasure(room.treasure());
                } else if (!room.questType()) {
                    if (battle(player, room.getEnemy() )) {
                        System.out.println("Player Won");
                    } else {
                        System.out.println("Enemy Won");
                    } //add attack function to all the players
                }
        }
    }

    public boolean battle(Player player, Enemy enemy) {

        if (player.attack() > enemy.attack()) {
            enemy.removeHealthPoint(player.attack());
            return true;
        } else {
            player.removeHealthPoint(enemy.attack());
            return false;
        }
    }




}

