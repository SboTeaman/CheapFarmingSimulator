package com.company;

import Buildings.Buildings;
import Interfaces.BuyingPlants;
import Interfaces.BuyingsBuildings;
import Interfaces.RandomNumberGenerator;
import Interfaces.Selling;

import java.util.ArrayList;
import java.util.List;

public class Players implements Selling, BuyingPlants , BuyingsBuildings {

    private final String name;
    public double cash;
    public List<Plants> inventory = new ArrayList<>(100);
    public List<Buildings> yourBuildings = new ArrayList<>(100);

    Players(String name) {
        this.name = name;
        this.cash = 1000.0;
    }




    @Override
    public void buyPlant(Plants plants, Double amount)  {

            if (this.cash >= plants.value_kg) {
                double valueOfTransaction = amount * plants.value_kg;
                this.cash -= valueOfTransaction;
                plants.amountInInventory+=amount;
                this.inventory.add(plants);
                System.out.println("You bought "+amount+" of "+plants.name);
            }
            else{
                System.out.println("You don't have enough money to buy: "+plants.name);
            }
    }
    @Override
    public void sellPlant(Plants plants, Double amount )  {
            if(inventory.contains(plants)){
                if (plants.amountInInventory > 0){
                double valueOfTransaction = amount * plants.value_kg;
                this.cash += valueOfTransaction;
                System.out.println("You successful sell "+amount+ " of " + plants.name);
                plants.amountInInventory -= amount;
                }

                else if (plants.amountInInventory <  amount ) {
                System.out.println("You don't have enough "+plants.name+ " to sell");
                }
                if(plants.amountInInventory == 0) {
                    inventory.remove(plants);
                }
            }
            else{
                System.out.println("You don't have "+plants.name+ " in your inventory");
                }
    }


        public String toString () {
            return "name: " + this.name + "\ncash: " + this.cash;
        }

    @Override
    public void buyBuilding(Buildings buildings) {
        if (this.cash >= buildings.price) {
            this.cash -=buildings.price;

            this.yourBuildings.add(buildings);
            System.out.println("You bought: "+buildings.name);
        }
        else{
            System.out.println("You don't have enough money to buy: "+ buildings.name);
        }
    }
    public void buyMoreField(Buildings farm, double amount){

        double valueOfTransaction=amount* RandomNumberGenerator.randomBetween(10,20);

        if(this.cash>= valueOfTransaction){
            if(this.yourBuildings.contains(farm))
            {
                if(farm.maxFieldsSlots>=amount && this.cash>=valueOfTransaction ) {
                    farm.fieldsSlots += amount;
                    this.cash-=valueOfTransaction;
                    System.out.println("You successful expand your farm by "+amount + " new Ha of field");
                }
                else{
                    System.out.println("You don't have enough space for new field");
                }
            }
            else{
                System.out.println("You don't have farm to expand");
                }
            }
        else{
            System.out.println("You don't have enough money for new field!");
        }
    }
}
