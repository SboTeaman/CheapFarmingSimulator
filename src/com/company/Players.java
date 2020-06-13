package com.company;

import Buildings.Farms;
import Animals.Animals;
import Buildings.Buildings;
import Interfaces.BuyingPlants;
import Interfaces.BuyingsBuildings;
import Interfaces.RandomNumberGenerator;
import Interfaces.Selling;

import java.sql.BatchUpdateException;
import java.util.ArrayList;
import java.util.List;

public class Players implements Selling, BuyingPlants {

    private final String name;
    public double cash;
    public List<Plants> inventory = new ArrayList<>(100);
    public List<Farms> yourFarms = new ArrayList<>(100);
    public List<Animals> yourAnimals = new ArrayList<>(100);
    public List<Buildings> yourBuildings = new ArrayList<>(100);

    Players(String name) {
        this.name = name;
        this.cash = 1500.0;
    }


    @Override
    public void buyPlant(Plants plants, Double amount) {

        if (this.cash >= plants.value_kg) {
            double valueOfTransaction = amount * plants.value_kg;
            this.cash -= valueOfTransaction;
            plants.amountInInventory += amount;
            this.inventory.add(plants);
            System.out.println("You bought " + amount + " of " + plants.name);
        } else {
            System.out.println("You don't have enough money to buy: " + plants.name);
        }
    }

    @Override
    public void sellPlant(Plants plants, Double amount) {
        if (inventory.contains(plants)) {
            if (plants.amountInInventory > 0) {
                double valueOfTransaction = amount * plants.value_kg;
                this.cash += valueOfTransaction;
                System.out.println("You successful sell " + amount + " of " + plants.name);
                plants.amountInInventory -= amount;
            } else if (plants.amountInInventory < amount) {
                System.out.println("You don't have enough " + plants.name + " to sell");
            }
            if (plants.amountInInventory == 0) {
                inventory.remove(plants);
            }
        } else {
            System.out.println("You don't have " + plants.name + " in your inventory");
        }
    }

    public String toString() {
        return "name: " + this.name + "\ncash: " + this.cash;
    }


    public void buyFarm(Farms farm) {
        if (this.cash >= farm.price) {
            this.cash -= farm.price;

            this.yourFarms.add(farm);
            System.out.println("You bought: " + farm.name);
        } else {
            System.out.println("You don't have enough money to buy: " + farm.name);
        }
    }

    public void buyMoreField(Farms farm, double amount) {

        double valueOfTransaction = amount * RandomNumberGenerator.randomBetween(10, 20);

        if (this.cash >= valueOfTransaction) {
            if (this.yourFarms.contains(farm)) {
                if (farm.maxFieldsSlots >= amount && this.cash >= valueOfTransaction && farm.fieldsSlots < farm.maxFieldsSlots) {
                    farm.fieldsSlots += amount;
                    this.cash -= valueOfTransaction;
                    System.out.println("You successful expand your farm by " + amount + " new Ha of field");
                } else {
                    System.out.println("You don't have enough space for new field");
                }
            } else {
                System.out.println("You don't have farm to expand");
            }
        } else {
            System.out.println("You don't have enough money for new field!");
        }
    }

    public void sellField(Farms farm, double amount) {
        double valueOfTransaction = amount * RandomNumberGenerator.randomBetween(10, 20);
        if (yourFarms.contains(farm)) {
            if (farm.fieldsSlots > amount) {
                this.cash += valueOfTransaction;
                farm.fieldsSlots -= amount;
            } else {
                System.out.println("You don't have enough field to sell");
            }
        } else {
            System.out.println("You don't any have farm");
        }
    }


    public void buyBuildings(Farms farm, Buildings buildings) {
        if (yourFarms.isEmpty()) {
            System.out.println("You don't have Farm, buy farm first");
        } else {
            if (this.cash > buildings.price) {
                if (farm.fieldsSlots > 0) {
                    this.cash -= buildings.price;
                    farm.fieldsSlots -= 1;
                    this.yourBuildings.add(buildings);
                    System.out.println("You bought: " + buildings.name);
                } else {
                    System.out.println("You don't have enough space for " + buildings.name);
                }
            } else {
                System.out.println("You don't have enough money to buy: " + buildings.name);
            }
        }
    }

    public void buyAnimals(Farms farm, Buildings building, Animals animal, double amount) {
        double valueOfTransaction = amount * animal.costOfPurchase;
        if (yourFarms.contains(farm)) {
            if (yourBuildings.contains(building)) {
                if (this.cash >= valueOfTransaction) {
                    if (amount < building.capacity) {
                        animal.amountInBuilding += amount;
                        yourAnimals.add(animal);
                        System.out.println("You successful buy " + amount + " " + animal.name);
                    } else {
                        System.out.println("You don't have space for " + amount + " " + animal);
                    }
                } else {
                    System.out.println("You don't have enough money for " + amount + " " + animal);
                }
            } else {
                System.out.println("You don't have " + building.name + " for " + animal.name);
            }
        } else {
            System.out.println("You don't have any farm");
        }
    }

    public void sellAnimal(Farms farm, Buildings building, Animals animal, double amount) {
        double valueOfTransaction = amount * animal.costOfPurchase;
        if (yourAnimals.contains(animal)) {
            if (animal.amountInBuilding >= amount) {
                animal.amountInBuilding -= amount;
                this.cash += valueOfTransaction;
                if (animal.amountInBuilding == 0) {
                    yourAnimals.remove(animal);
                }
            } else {
                System.out.println("You don't have enough " + animal.name + " to sell");
            }
        }
    }

}
