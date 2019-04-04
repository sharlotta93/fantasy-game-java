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

        public void removeHealthPoint(int attackPoints) {
            this.healthPoints -= attackPoints;
        }

        public void addHealthPoint(int newPoints) {
            this.healthPoints += newPoints;
        }
    }

