package FantasyGame;

import FantasyGame.Players.*;
import FantasyGame.Rooms.*;
import FantasyGame.Rooms.RoomItems.Enemy;
import FantasyGame.Tools.MagicStuff.ISpell;

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

    public void startQuest() {
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
                    }
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

    public String knightDuel(Player player, Player player2) {
        if (player.attack() == player2.attack()) {
            return "It's a draw";
        }

        if (player.attack() > player2.attack()) {
            player2.removeHealthPoint(player.attack());
            return player.getName();
        } else {
            player.removeHealthPoint(player2.attack());
            return player2.getName();
        }
    }

    public String mixDuel(Player player, Player player2, ISpell spell) {
        int player2attack = ((Wizard)player2).attackWithSpell(spell);

        if (player.attack() == player2attack) {
            return "It's a draw";
        }

        if (player.attack() > player2attack) {
            player2.removeHealthPoint(player.attack());
            return player.getName();

        } else {
            player.removeHealthPoint(player2attack);
            return player2.getName();
        }
    }

    public String wizardDuel(Player player1, ISpell spell1, Player player2, ISpell spell2) {
        int player1SpellAttack = ((Wizard)player1).attackWithSpell(spell1);
        int player2SpellAttack = ((Wizard)player2).attackWithSpell(spell2);


        if (player1SpellAttack > player2SpellAttack) {
            player2.removeHealthPoint(player1SpellAttack);
            return player1.getName();

        } else if (player1SpellAttack < player2SpellAttack) {
            player1.removeHealthPoint(player2SpellAttack);
            return player2.getName();

        } else {

            if (player1.attack() > player2.attack()) { //in case of a draw fight with creatures
                player2.removeHealthPoint(player1.attack());
                return player1.getName();

            } else if ((player1.attack() < player2.attack())) {
                player1.removeHealthPoint(player2.attack());
                return player2.getName();

            } else {
                return "It's a draw";
            }
        }

    }



}

