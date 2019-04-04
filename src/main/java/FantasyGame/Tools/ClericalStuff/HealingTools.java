package FantasyGame.Tools.ClericalStuff;

public abstract class HealingTools {

    private int healingPoints;

    public HealingTools(int healingPoints) {
        this.healingPoints = healingPoints;
    }

    public int getHealingPoints() {
        return healingPoints;
    }
}
