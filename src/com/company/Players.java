package com.company;

import Buildings.Farms;
import Animals.Animals;
import Buildings.Buildings;
import Interfaces.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Players {

    public static Farms farm;
    private final String name;
    public double cash;
    public boolean isSilos = false;
    public List<Plants> yourSeeds = new ArrayList<>();
    public List<Plants> yourPlantedPlants = new ArrayList<>();
    public List<Plants> yourPlants = new ArrayList<>();
    public List<Animals> yourAnimals = new ArrayList<>();
    public List<Buildings> yourBuildings = new ArrayList<>();
    public int week=31;

    Players(String name) {
        this.name = name;
        this.cash = 1500.0;
    }

    public static Farms getFarm() {
        return farm;
    }


    public static void isCash(Players player) {
        if (player.cash <= 0) {
            for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
                if (RandomNumberGenerator.randomBetween(0, 10) == 5) {
                    player.yourPlantedPlants.get(i).amountInInventory -= RandomNumberGenerator.randomBetween(0, player.yourPlantedPlants.get(i).amountInInventory);
                    if (player.yourPlantedPlants.get(i).amountInInventory == 0) {
                        player.yourPlantedPlants.remove(i);
                    }
                }
            }

            for (int i = 0; i < player.yourAnimals.size(); i++) {
                player.yourAnimals.get(i).weight -= 1;
            }
        }
    }

    public String toString() {
        return "name: " + this.name + "\ncash: " + this.cash;
    }

    public void buyFarm(Farms farm) {

        if (this.cash >= farm.price) {
            if (this.farm == null) {
                this.cash -= farm.price;
                this.farm = farm;
                System.out.println("You bought: " + farm.name);
            } else if (this.farm == farm) {
                System.out.println("You already have: " + farm.name);
            } else {
                this.cash -= farm.price;
                this.farm = farm;
                System.out.println("You bought: " + farm.name);
            }

        } else {
            System.out.println("You don't have enough money to buy: " + farm.name);
        }
    }

    public void buyMoreField(Farms farm, double amount) {

        double valueOfTransaction = farm.priceForField * amount;

        if (this.cash >= valueOfTransaction) {
            if (this.farm == farm) {
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
        if (this.farm == farm) {
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
        if (Players.farm == null) {
            System.out.println("You don't have " + farm.name);
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

//    public void buyAnimals(Farms farm, Buildings building, Animals animal, double amount) {
//        double valueOfTransaction = amount * animal.costOfPurchase;
//        if (this.farm == farm) {
//            if (yourBuildings.contains(building)) {
//                if (this.cash >= valueOfTransaction) {
//                    if (amount < building.capacity) {
//                        animal.amountInBuilding += amount;
//                        yourAnimals.add(animal);
//                        System.out.println("You successful buy " + amount + " " + animal.name);
//                    } else {
//                        System.out.println("You don't have space for " + amount + " " + animal);
//                    }
//                } else {
//                    System.out.println("You don't have enough money for " + amount + " " + animal);
//                }
//            } else {
//                System.out.println("You don't have " + building.name + " for " + animal.name);
//            }
//        } else {
//            System.out.println("You don't have any farm");
//        }
//    }

//    public void sellAnimal(Farms farm, Buildings building, Animals animal, double amount) {
//        double valueOfTransaction = amount * animal.costOfPurchase;
//        if (yourAnimals.contains(animal)) {
//            if (animal.amountInBuilding >= amount) {
//                animal.amountInBuilding -= amount;
//                this.cash += valueOfTransaction;
//                if (animal.amountInBuilding == 0) {
//                    yourAnimals.remove(animal);
//                }
//            } else {
//                System.out.println("You don't have enough " + animal.name + " to sell");
//            }
//        }
//    }

}
