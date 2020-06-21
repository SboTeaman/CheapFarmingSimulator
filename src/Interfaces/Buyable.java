package Interfaces;

import Animals.Animal;
import Buildings.Building;
import Buildings.Farm;
import com.company.Plant;
import com.company.Player;

public class Buyable {

    public static void buyPlantSeed(Player player, Plant plant, int amount) {
        if (player.cash >= plant.value_kg) {

            if (player.yourSeeds.isEmpty()) {
                player.yourSeeds.add(new Plant(plant.name, 2.0, 1, 200, 5, 0.25, 5, amount));
                player.yourSeeds.get(0).name.equals(plant.name);
            } else {
                if (player.yourSeeds.size() == 1 && player.yourSeeds.get(0).name.equals(plant.name)) {
                    player.yourSeeds.get(0).amountInInventory += amount;
                } else {
                    if (player.yourSeeds.size() == 1) {
                        player.yourSeeds.add(new Plant(plant.name, 2.0, 1, 200, 5, 0.25, 5, amount));
                    } else
                        one:{
                            for (int i = 0; i < player.yourSeeds.size(); i++) {
                                if (player.yourSeeds.get(i).name.contains(plant.name)) {
                                    player.yourSeeds.get(i).amountInInventory += amount;
                                    break one;
                                }
                            }
                            player.yourSeeds.add(new Plant(plant.name, 2.0, 1, 200, 5, 0.25, 5, amount));
                        }
                }
            }
        } else {
            System.out.println("You don't have enough money!");
        }
    }

    public static void buyAnimal(Player player, Animal animal, int amount) {
        if (player.cash >= animal.costOfPurchase) {

            if (player.yourAnimals.isEmpty()) {
                player.yourAnimals.add(new Animal(animal.name, 100.0, 10.0, 5.0, 2.0, 5, "corn", 0.1, amount));
                player.yourAnimals.get(0).name.equals(animal.name);
            } else {
                if (player.yourAnimals.size() == 1 && player.yourAnimals.get(0).name.equals(animal.name)) {
                    player.yourAnimals.get(0).amountInBuilding += amount;
                } else {
                    if (player.yourAnimals.size() == 1) {
                        player.yourAnimals.add(new Animal(animal.name, 100.0, 10.0, 5.0, 2.0, 5, "corn", 0.1, amount));
                    } else
                        one:{
                            for (int i = 0; i < player.yourAnimals.size(); i++) {
                                if (player.yourAnimals.get(i).name.contains(animal.name)) {
                                    player.yourAnimals.get(i).amountInBuilding += amount;
                                    break one;
                                }
                            }
                            player.yourAnimals.add(new Animal(animal.name, 100.0, 10.0, 5.0, 2.0, 5, "corn", 0.1, amount));
                        }
                }
            }
        } else {
            System.out.println("You don't have enough money!");
        }
    }

    public static void buySilos(Player player, Building silos) {
        if (player.cash > silos.price) {
            player.cash -= silos.price;
            player.isSilos = true;
            System.out.println("You bought " + silos.name);
        } else {
            System.out.println("You don't have money for " + silos.name);
        }
    }

    public static void buyFarm(Player player, Farm farm) {

        if (player.cash >= farm.price) {

            if (player.getFarm() == null) {
                player.cash -= farm.price;
                player.setFarm(farm);
                System.out.println("You bought: " + farm.name);
            } else if (player.getFarm() == farm) {
                System.out.println("You already have: " + farm.name);
            } else {
                player.cash -= farm.price;
                player.setFarm(farm);
                System.out.println("You bought: " + farm.name);
            }

        } else {
            System.out.println("You don't have enough money to buy: " + farm.name);
        }
    }

    public static void buyBuildings(Player player, Farm farm, Building building) {
        if (player.getFarm() == null) {
            System.out.println("You don't have " + farm.name);
        } else {
            if (player.cash > building.price) {
                if (farm.fieldsSlots > 0) {
                    player.cash -= building.price;
                    farm.fieldsSlots -= 1;
                    player.yourBuildings.add(building);
                    System.out.println("You bought: " + building.name);
                } else {
                    System.out.println("You don't have enough space for " + building.name);
                }
            } else {
                System.out.println("You don't have enough money to buy: " + building.name);
            }
        }
    }

    public void buyMoreField(Player player,Farm farm, double amount) {

        double valueOfTransaction = farm.priceForField * amount;

        if (player.cash >= valueOfTransaction) {
            if (player.getFarm() == farm) {
                if (farm.maxFieldsSlots >= amount && player.cash >= valueOfTransaction && farm.fieldsSlots < farm.maxFieldsSlots) {
                    farm.fieldsSlots += amount;
                    player.cash -= valueOfTransaction;
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
}



