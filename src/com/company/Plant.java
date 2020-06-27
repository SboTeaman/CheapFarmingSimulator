package com.company;

import Interfaces.RandomNumberGenerator;

import java.util.Random;

public class Plant {


    public final int value_kg;
    public final double costOfPlanting;
    public final int costOfProtectingFromParasite;
    public final double costOfHarvesting;
    public String name;
    public int amountInInventory = 0;
    public int efficiency_ha;
    public int timeToGrow;
    public String product;

    public Plant(String name, double costOfPlanting, int costOfProtectingFromParasite, int efficiency_Ha, int timeToGrow, double costOfHarvesting, int value_KG, String product) {
        this.name = name;
        this.costOfPlanting = costOfPlanting;
        this.costOfProtectingFromParasite = costOfProtectingFromParasite;
        this.efficiency_ha = efficiency_Ha;
        this.timeToGrow = timeToGrow;
        this.costOfHarvesting = costOfHarvesting;
        this.value_kg = value_KG;
        this.product = product;
    }

    public Plant(String name, double costOfPlanting, int costOfProtectingFromParasite, int efficiency_Ha, int timeToGrow, double costOfHarvesting, int value_KG, int amountInInventory, String product) {
        this.name = name;
        this.costOfPlanting = costOfPlanting;
        this.costOfProtectingFromParasite = costOfProtectingFromParasite;
        this.efficiency_ha = efficiency_Ha;
        this.timeToGrow = timeToGrow;
        this.costOfHarvesting = costOfHarvesting;
        this.value_kg = value_KG;
        this.amountInInventory = amountInInventory;
        this.product = product;
    }


    public static void plant(Player player, Plant plant, int amount) {

        for (int i = 0; i < player.yourSeeds.size(); i++) {
            if ((player.yourSeeds.get(i).name.contains(plant.name))) {
                if (player.yourSeeds.get(i).amountInInventory >= amount) {
                    if (player.farm.get(0).fieldsSlots >= amount) {
                        if (player.yourSeeds.get(i).amountInInventory == 0) {
                            player.yourSeeds.remove(i);
                            break;
                        }
                        if (!player.yourPlantedPlants.isEmpty()) {
                            one:
                            {
                                for (int n = 0; n < player.yourPlantedPlants.size(); n++) {
                                    if (player.yourPlantedPlants.get(n).name.contains(plant.name)) {
                                        player.yourPlantedPlants.get(n).amountInInventory += amount;
                                        break one;
                                    }
                                }
                                player.yourPlantedPlants.add(new Plant(plant.name, plant.costOfPlanting, plant.costOfProtectingFromParasite, plant.efficiency_ha, plant.timeToGrow, plant.costOfHarvesting, plant.value_kg, amount, plant.product));
                            }
                        } else {
                            player.yourPlantedPlants.add(new Plant(plant.name, plant.costOfPlanting, plant.costOfProtectingFromParasite, plant.efficiency_ha, plant.timeToGrow, plant.costOfHarvesting, plant.value_kg, amount, plant.product));
                        }
                        System.out.println("You planted " + amount + " Ha of " + plant.name);
                        player.yourSeeds.get(i).amountInInventory -= amount;
                        double value = player.yourSeeds.get(i).costOfPlanting * amount;
                        System.out.println(value);
                        player.cash -= value;
                        player.farm.get(0).fieldsSlots -= amount;

                        if (player.yourSeeds.get(i).amountInInventory == 0)
                            player.yourSeeds.remove(i);
                    } else {
                        System.out.println("You don't have enough field");
                    }
                }


            }
        }
    }

    public static void growingProcess(Player player) {
        if (!player.yourPlantedPlants.isEmpty()) {
            for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
                if (player.yourPlantedPlants.get(i).timeToGrow != 0)
                    player.yourPlantedPlants.get(i).timeToGrow -= 1;
                else {
                    System.out.println("Plant: " + player.yourPlantedPlants.get(i).name + "is ready to harvest");
                }
            }
        }
    }

    public static void harvest(Player player) {
        if (!player.isSilos) {

            for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
                double amount = player.yourPlantedPlants.get(i).amountInInventory * player.yourPlantedPlants.get(i).efficiency_ha;
                double value = player.yourSeeds.get(i).costOfHarvesting * amount;
                player.cash -= value;
                if (player.yourPlantedPlants.get(i).timeToGrow <= 0) {

                    player.cash += amount * player.yourPlantedPlants.get(i).value_kg;
                    player.farm.get(0).fieldsSlots += player.yourPlantedPlants.get(i).amountInInventory;
                    player.yourPlantedPlants.remove(i);
                    System.out.println("You successful harvest your plants");
                }
            }
        }

        if (player.isSilos) {
            for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
                if (player.yourPlantedPlants.get(i).timeToGrow <= 0) {

                    player.yourPlants.add(new Plant(player.yourPlantedPlants.get(i).product,
                            player.yourPlantedPlants.get(i).costOfPlanting,
                            player.yourPlantedPlants.get(i).costOfProtectingFromParasite,
                            player.yourPlantedPlants.get(i).efficiency_ha,
                            player.yourPlantedPlants.get(i).timeToGrow,
                            player.yourPlantedPlants.get(i).efficiency_ha,
                            player.yourPlantedPlants.get(i).value_kg,
                            player.yourPlantedPlants.get(i).amountInInventory * player.yourPlantedPlants.get(i).efficiency_ha,
                            null));

                    player.farm.get(0).fieldsSlots += player.yourPlantedPlants.get(i).amountInInventory;
                    player.yourPlantedPlants.remove(i);
                }
            }
        }
    }

    public static void protectFromParasite(Player player) {
        int insects = RandomNumberGenerator.randomBetween(0, 100);

        for (int i = 0; i < player.yourPlantedPlants.size(); i++) {

            if (!player.yourPlantedPlants.isEmpty()) {
                int value = 0;
                if (player.cash > value) {
                    value += player.yourPlantedPlants.get(i).costOfProtectingFromParasite * player.yourPlantedPlants.get(i).amountInInventory;
                    player.cash -= value;
                    System.out.println(value);
                }

            } else if (insects == 5) {
                player.yourPlantedPlants.get(i).amountInInventory -= 1;
                player.farm.get(0).fieldsSlots += 1;
            }
        }
    }


    public String toString() {
        return "Name: " + this.name +
                //"\nCost of Planting: "+this.costOfPlanting+
                //"\nCost of protecting frm parasite: "+this.costOfProtectingFromParasite+
                //"\nEfficiency for one hectare: " + this.efficiency_ha +
                "\nTime to grow: " + this.timeToGrow +
                //"\nCost of harvesting: " +this.costOfHarvesting+
                // "\nValue for one Kilogram: "+this.value_kg+
                " Amount: " + this.amountInInventory;

    }

}

