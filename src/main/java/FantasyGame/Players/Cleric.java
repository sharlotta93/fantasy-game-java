package FantasyGame.Players;

import FantasyGame.Tools.ClericalStuff.HealingTools;

import java.util.ArrayList;

public class Cleric extends Player implements ICleric {

        private ArrayList<HealingTools> healingTools;


        public Cleric(String name) {
            super(name);
            healingTools = new ArrayList<>();
        }

        public void addHealingTool(HealingTools healingTool) {
            healingTools.add(healingTool);
        }

        public HealingTools chooseHealingTool() {
            if (totalHealingTools() != 0) {
                return healingTools.remove(0); //make it more specific in the future
            }
            return null;
        }

    public int totalHealingTools() {
            return this.healingTools.size();
    }
}
