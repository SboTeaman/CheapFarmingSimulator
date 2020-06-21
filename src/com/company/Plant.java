package com.company;

import Interfaces.RandomNumberGenerator;

public class Plant {


    public final String name;
    public final int value_kg;
    public final double costOfPlanting;
    public final int costOfProtectingFromParasite;
    public final double costOfHarvesting;
    public int amountInInventory = 0;
    public int efficiency_ha;
    public int timeToGrow;

    public Plant(
            String name,
            double costOfPlanting,
            int costOfProtectingFromParasite,
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

    public Plant(String name,
                 double costOfPlanting,
                 int costOfProtectingFromParasite,
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


    public static void plant(Player player, Plant plant, int amount) {
        for (int i = 0; i < player.yourSeeds.size(); i++) {
            if ((player.yourSeeds.get(i).name.contains(plant.name))) {
                if (player.yourSeeds.get(i).amountInInventory >= amount)
                    if (player.getFarm().fieldsSlots >= amount) {
                        if (player.yourSeeds.get(i).amountInInventory == 0) {
                            player.yourSeeds.remove(i);
                            break;
                        }
                        if (!player.yourPlantedPlants.isEmpty())
                            one:{
                                for (int n = 0; n < player.yourPlantedPlants.size(); n++) {
                                    if (player.yourPlantedPlants.get(n).name.contains(plant.name)) {
                                        player.yourPlantedPlants.get(n).amountInInventory += amount;
                                        System.out.println("test0");
                                        break one;
                                    }
                                }
                                player.yourPlantedPlants.add(new Plant(plant.name, 2.0, 1, 200, 5, 0.25, 5, amount));
                                System.out.println("test");
                            }
                        else {
                            player.yourPlantedPlants.add(new Plant(plant.name, 2.0, 1, 200, 5, 0.25, 5, amount));
                            System.out.println("test1");
                        }


                    } else {
                        System.out.println("You don't have any field");
                    }
            }
        }
    }

    public static void growingProcess(Player player) {

        for (int i = 0; i <= player.yourPlantedPlants.size(); i++) {
            if (player.yourPlantedPlants.get(i).timeToGrow != 0)
                player.yourPlantedPlants.get(i).timeToGrow -= 1;
            else {
                System.out.println("Plant: " + player.yourPlantedPlants.get(i).name + "is ready to harvest");
            }
        }
    }

    public static void harvest(Player player, Plant plant) {
        if (!player.isSilos) {
            for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
                int amount = player.yourPlantedPlants.get(i).amountInInventory * plant.efficiency_ha * player.yourPlantedPlants.get(i).value_kg;
                if (player.yourPlantedPlants.get(i).name.equals(plant.name) && player.yourPlantedPlants.get(i).timeToGrow <= 0) {
                    player.cash += amount;
                    player.yourPlantedPlants.remove(i);
                }
            }
        }
        if (player.isSilos) {
            for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
                if (player.yourPlantedPlants.get(i).name.equals(plant.name) && player.yourPlantedPlants.get(i).timeToGrow <= 0) {
                    player.yourPlants.add(new Plant(plant.name, plant.costOfPlanting, plant.costOfProtectingFromParasite, plant.efficiency_ha, plant.timeToGrow, plant.efficiency_ha, plant.value_kg, player.yourPlantedPlants.get(i).amountInInventory * plant.efficiency_ha));
                }
            }
        }
    }

    public static void protectFromParasite(Player player) {

        for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
            if (!player.yourPlantedPlants.isEmpty()) {
                int value = 0;
                value += player.yourPlantedPlants.get(i).costOfProtectingFromParasite * player.yourPlantedPlants.get(i).amountInInventory;
                player.cash -= value;
                System.out.println(value);
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
                "\nEfficiency for one hectare: " + this.efficiency_ha +
                "\nTime to grow: " + this.timeToGrow +
                //"\nCost of harvesting: " +this.costOfHarvesting+
                // "\nValue for one Kilogram: "+this.value_kg+
                " Amount: " + this.amountInInventory;
    }

}

