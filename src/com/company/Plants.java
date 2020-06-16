package com.company;

import Interfaces.Buyable;
import Interfaces.Saleable;

public class Plants {
    public final String name;
    public final double value_kg;
    private final double costOfPlanting;
    private final double costOfProtectingFromParasite;
    private final double efficiency_ha;
    private final double costOfHarvesting;
    public int amountInInventory = 0;
    private double timeToGrow;

    public Plants(String name,
                  double costOfPlanting,
                  double costOfProtectingFromParasite,
                  double efficiency_Ha,
                  double timeToGrow,
                  double costOfHarvesting,
                  double value_KG) {

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
                  double efficiency_Ha,
                  double timeToGrow,
                  double costOfHarvesting,
                  double value_KG,
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


    public void Plant() {
    }

    public void Harvest() {
    }


    public void GrowingProcess() {

        if (this.timeToGrow <= 0) {
            System.out.println("Ready to harvest");
        } else {
            this.timeToGrow -= 1;
            System.out.println("Time left to grown " + this.timeToGrow);
        }
    }
/*
    @Override
    public void buy(Players player, int amount) {

        if (player.cash >= this.value_kg) {
            double valueOfTransaction = amount * this.value_kg;
            player.cash -= valueOfTransaction;
            this.amountInInventory += amount;
            player.inventory.add(this);
            System.out.println("You bought " + amount + " of " + this.name);
        } else {
            System.out.println("You don't have enough money to buy: " + this.name);
        }
    }

    @Override
    public void sell(Players player, int amount) {
        if (player.inventory.contains(this)) {
            if (this.amountInInventory >= amount) {
                double valueOfTransaction = amount * this.value_kg;
                player.cash += valueOfTransaction;
                System.out.println("You successful sell " + amount + " of " + this.name);
                this.amountInInventory -= amount;
            } else if (this.amountInInventory < amount) {
                System.out.println("You don't have enough " + this.name + " to sell");
            }
            if (this.amountInInventory == 0) {
                player.inventory.remove(this);
            }
        } else {
            System.out.println("You don't have " + this.name + " in your inventory");
        }
    }


 */
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

