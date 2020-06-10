package com.company;

    public class Plants {
        private String name;
        private double costOfPlanting;
        private double costOfProtectingFromParasite;
        private double efficiency_ha;
        private double timeToGrow;
        private double costOfHarvesting;
        private double value_kg;

        Plants(String name,
               double costOfPlanting,
               double costOfProtectingFromParasite,
               double efficiency_Ha,
               double timeToGrow,
               double costOfHarvesting,
               double value_KG){

            this.name = name;
            this.costOfPlanting = costOfPlanting;
            this.costOfProtectingFromParasite = costOfProtectingFromParasite;
            this.efficiency_ha = efficiency_Ha;
            this.timeToGrow = timeToGrow;
            this.costOfHarvesting = costOfHarvesting;
            this.value_kg = value_KG;
        }


        public void Sell(){}

        public void Store(){}

        public void Plant(){}

        public void Harvest(){}

        public void Buy(){}

        public String toString()
        {
            return "Name: "+this.name+
                    "\nCost of Planting: "+this.costOfPlanting+
                    "\nCost of protecting frm parasite: "+this.costOfProtectingFromParasite+
                    "\nEfficiency for one hectare: "+this.efficiency_ha+
                    "\nTime to grow: "+this.timeToGrow+
                    "\nCost of harvesting: " +this.costOfHarvesting+
                    "\nValue for one Kilogram"+this.value_kg;
        }
    }

