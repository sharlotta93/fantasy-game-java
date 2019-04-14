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

    public String duel(Player player, Player player2) {
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

    public String duel(IFighter player, IMagic player2, ISpell spell) {
        int player2attack = player2.attackWithSpell(spell);
        Player knight = ((Player)player);

        if (knight.attack() == player2attack) {
            return "It's a draw";
        }

        if (knight.attack() > player2attack) {
            ((Player)player2).removeHealthPoint(player.attack());
            return knight.getName();

        } else {
            knight.removeHealthPoint(player2attack);
            return ((Player)player2).getName();
        }
    }

    public String duel(IMagic player1, ISpell spell1, IMagic player2, ISpell spell2) {
        int wizard1Attack = player1.attackWithSpell(spell1);
        int wizard2Attack = player2.attackWithSpell(spell2);

        Player wizard1 = (Player)player1;
        Player wizard2 = (Player)player2;

        if (wizard1Attack > wizard2Attack) {
            wizard2.removeHealthPoint(wizard1Attack);
            return wizard1.getName();

        } else if (wizard1Attack < wizard2Attack) {
            wizard1.removeHealthPoint(wizard2Attack);
            return wizard2.getName();

        } else {

            if (wizard1.attack() > wizard2.attack()) { //in case of a draw fight with creatures
                wizard2.removeHealthPoint(wizard1.attack());
                return wizard1.getName();

            } else if ((wizard1.attack() < wizard2.attack())) {
                wizard1.removeHealthPoint(wizard2.attack());
                return wizard2.getName();

            } else {
                return "It's a draw";
            }
        }

    }



}

