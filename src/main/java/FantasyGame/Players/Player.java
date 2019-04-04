package FantasyGame.Players;

    public abstract class Player {

        String name;
        int healthPoints;

        public Player(String name) {
            this.name = name;
            this.healthPoints = 30;
        }

        public String getName() {
            return this.name;
        }

        public int getHealthPoints() {
            return this.healthPoints;
        }
    }

