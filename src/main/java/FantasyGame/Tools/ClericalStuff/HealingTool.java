package FantasyGame.Tools.ClericalStuff;

public abstract class HealingTool {

    private int healingPoints;

    public HealingTool(int healingPoints) {
        this.healingPoints = healingPoints;
    }

    public int getHealingPoints() {
        return healingPoints;
    }
}
