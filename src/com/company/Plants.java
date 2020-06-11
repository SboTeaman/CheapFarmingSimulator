package com.company;

public class Plants{
        public final String name;
        private final double costOfPlanting;
        private final double costOfProtectingFromParasite;
        private final double efficiency_ha;
        private double timeToGrow;
        private final double costOfHarvesting;
        public final double value_kg;
        public  double amountInInventory=0.0;

   public Plants(String name,
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
        Plants(String name,
               double costOfPlanting,
               double costOfProtectingFromParasite,
               double efficiency_Ha,
               double timeToGrow,
               double costOfHarvesting,
               double value_KG,
               double amountInInventory){

            this.name = name;
            this.costOfPlanting = costOfPlanting;
            this.costOfProtectingFromParasite = costOfProtectingFromParasite;
            this.efficiency_ha = efficiency_Ha;
            this.timeToGrow = timeToGrow;
            this.costOfHarvesting = costOfHarvesting;
            this.value_kg = value_KG;
            this.amountInInventory=amountInInventory;
        }




    public void Plant(){}

        public void Harvest(){}

        public void Store(){}

        public void GrowingProcess(){


            if(this.timeToGrow<=0){
                System.out.println("Ready to harvest");
            }
            else {
                this.timeToGrow -= 1;
                System.out.println("Time left to grown " + this.timeToGrow);
            }
        }

        public String toString()
        {
            return "\nName: "+this.name+
                    //"\nCost of Planting: "+this.costOfPlanting+
                    //"\nCost of protecting frm parasite: "+this.costOfProtectingFromParasite+
                    //"\nEfficiency for one hectare: "+this.efficiency_ha+
                    //"\nTime to grow: "+this.timeToGrow+
                    //"\nCost of harvesting: " +this.costOfHarvesting+
                   // "\nValue for one Kilogram: "+this.value_kg+
                    "\nAmount: "+this.amountInInventory;
        }
}

