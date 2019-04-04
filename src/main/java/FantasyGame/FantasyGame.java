package FantasyGame;

import FantasyGame.Players.Player;
import FantasyGame.Rooms.Room;
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

    }

    public void attack(Player player, Enemy enemy) {
        if (player)
    }
}
