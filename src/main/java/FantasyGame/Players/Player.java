package FantasyGame.Players;

import FantasyGame.Rooms.RoomItems.IItem;
import FantasyGame.Rooms.RoomItems.Treasure;

public abstract class Player {

        String name;
        int healthPoints;
        int totalTreasure;

        public Player(String name) {
            this.name = name;
            this.healthPoints = 30;
            this.totalTreasure = 0;
        }

        public String getName() {
            return this.name;
        }

        public int getHealthPoints() {
            return this.healthPoints;
        }

        public void removeHealthPoint(int attackPoints) {
            this.healthPoints -= attackPoints;
        }

        public void addHealthPoint(int newPoints) {
            this.healthPoints += newPoints;
        }

        public void collectTreasure(IItem treasure) {
            this.totalTreasure += ((Treasure) treasure).totalTreasureValue();
        }

        public int getTotalTreasure() {
            return totalTreasure;
        }

    }

