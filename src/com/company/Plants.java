package com.company;

public class Plants {


    public final String name;
    public final int value_kg;
    private final double costOfPlanting;
    private final double costOfProtectingFromParasite;
    private final int efficiency_ha;
    private final double costOfHarvesting;
    public int amountInInventory = 0;
    private int timeToGrow;

    public Plants(
            String name,
            double costOfPlanting,
            double costOfProtectingFromParasite,
            int efficiency_Ha,
            int timeToGrow,
            double costOfHarvesting,
            int value_KG) {
        this.name = name;
        this.costOfPlanting = costOfPlanting;
        this.costOfProtectingFromParasite = costOfProtectingFromParasite;
        this.efficiency_ha = efficiency_Ha;
        this.timeToGrow = timeToGrow;
        this.costOfHarvesting = costOfHarvesting;
        this.value_kg = value_KG;
    }

    public Plants(String name,
                  double costOfPlanting,
                  double costOfProtectingFromParasite,
                  int efficiency_Ha,
                  int timeToGrow,
                  double costOfHarvesting,
                  int value_KG,
                  int amountInInventory) {
        this.name = name;
        this.costOfPlanting = costOfPlanting;
        this.costOfProtectingFromParasite = costOfProtectingFromParasite;
        this.efficiency_ha = efficiency_Ha;
        this.timeToGrow = timeToGrow;
        this.costOfHarvesting = costOfHarvesting;
        this.value_kg = value_KG;
        this.amountInInventory = amountInInventory;
    }


    public static void plant(Players player, Plants plant, int amount) {
        for (int i = 0; i < player.yourSeeds.size(); i++) {
            if ((player.yourSeeds.get(i).name.contains(plant.name))) {
                if (player.yourSeeds.get(i).amountInInventory >= amount)
                    if (Players.getFarm().fieldsSlots >= amount) {
                        player.yourSeeds.get(i).amountInInventory -= amount;
                        Players.getFarm().fieldsSlots -= amount;
                        player.yourPlantedPlants.add(new Plants(plant.name, plant.costOfPlanting, plant.costOfProtectingFromParasite, plant.efficiency_ha, plant.timeToGrow, plant.efficiency_ha, plant.value_kg, amount));
                        if (player.yourSeeds.get(i).amountInInventory == 0) {
                            player.yourSeeds.remove(i);
                            break;
                        } else {
                            System.out.println("You don't have any field");
                        }
                    }
            } //else if (player.yourSeeds.get(i).amountInInventory <= amount) {
            // System.out.println("You don't have enough " + plant.name + " to plant");
            //}
        }
    }

    public static void growingProcess(Players player) {

        for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
            if (player.yourPlantedPlants.get(i).timeToGrow != 0)
                player.yourPlantedPlants.get(i).timeToGrow -= 1;
            else {
                System.out.println("Plant: " + player.yourPlantedPlants.get(i).name + "is ready to harvest");
            }
        }
    }

    public static void harvest(Players player, Plants plant) {
        if (!player.isSilos) {
            for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
                int amount=player.yourPlantedPlants.get(i).amountInInventory*plant.efficiency_ha*player.yourPlantedPlants.get(i).value_kg;
                if (player.yourPlantedPlants.get(i).name.equals(plant.name) && player.yourPlantedPlants.get(i).timeToGrow <= 0) {
                    player.cash+=amount;
                    player.yourPlantedPlants.remove(i);
                }
            }
        }
        if (player.isSilos) {
            for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
                if (player.yourPlantedPlants.get(i).name.equals(plant.name) && player.yourPlantedPlants.get(i).timeToGrow <= 0) {
                    player.yourPlants.add(new Plants(plant.name, plant.costOfPlanting, plant.costOfProtectingFromParasite, plant.efficiency_ha, plant.timeToGrow, plant.efficiency_ha, plant.value_kg, player.yourPlantedPlants.get(i).amountInInventory*plant.efficiency_ha));
                }
            }
        }
    }

    public void setAmountInInventory(int amountInInventory) {
        this.amountInInventory += amountInInventory;
    }

    public String toString() {
        return "\nName: " + this.name +
                //"\nCost of Planting: "+this.costOfPlanting+
                //"\nCost of protecting frm parasite: "+this.costOfProtectingFromParasite+
                //"\nEfficiency for one hectare: "+this.efficiency_ha+
                //"\nTime to grow: "+this.timeToGrow+
                //"\nCost of harvesting: " +this.costOfHarvesting+
                // "\nValue for one Kilogram: "+this.value_kg+
                " Amount: " + this.amountInInventory;
    }

}

