package FantasyGame.Players;

import FantasyGame.GameCharacter;

public abstract class Player extends GameCharacter {

       private int totalTreasure;
       private int healthPoints;

        public Player(String name) {
            super(name, 30);
            this.totalTreasure = 0;
        }

        public void addHealthPoint(int newPoints) {
            this.healthPoints += newPoints;
        }

        public void collectTreasure(int value) {
            this.totalTreasure += value;
        }

        public int getTotalTreasure() {
            return totalTreasure;
        }

    }

