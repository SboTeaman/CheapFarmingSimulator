package Interfaces;

import Animals.Animals;
import Buildings.Buildings;
import com.company.Plants;
import com.company.Players;

import java.util.Random;

public class Buyable {

    public static void buyPlantSeed(Players player, Plants plant, int amount) {
        if (player.cash >= plant.value_kg) {

            if (player.yourSeeds.isEmpty()) {
                player.yourSeeds.add(new Plants(plant.name, 2.0, 1, 200, 5, 0.25, 5, amount));
                player.yourSeeds.get(0).name.equals(plant.name);
            } else {
                if (player.yourSeeds.size() == 1 && player.yourSeeds.get(0).name.equals(plant.name)) {
                    player.yourSeeds.get(0).amountInInventory += amount;
                } else {
                    if (player.yourSeeds.size() == 1) {
                        player.yourSeeds.add(new Plants(plant.name, 2.0, 1, 200, 5, 0.25, 5, amount));
                    } else
                        one:{
                            for (int i = 0; i < player.yourSeeds.size(); i++) {
                                if (player.yourSeeds.get(i).name.contains(plant.name)) {
                                    player.yourSeeds.get(i).amountInInventory += amount;
                                    break one;
                                }
                            }
                            player.yourSeeds.add(new Plants(plant.name, 2.0, 1, 200, 5, 0.25, 5, amount));
                        }
                }
            }
        } else {
            System.out.println("You don't have enough money!");
        }
    }

    public static void buyAnimal(Players player, Animals animal, int amount) {
        if (player.cash >= animal.costOfPurchase) {

            if (player.yourAnimals.isEmpty()) {
                player.yourAnimals.add(new Animals(animal.name, 100.0,10.0, 5.0, 2.0, 5, "corn", 0.1, amount));
                player.yourAnimals.get(0).name.equals(animal.name);
            } else {
                if (player.yourAnimals.size() == 1 && player.yourAnimals.get(0).name.equals(animal.name)) {
                    player.yourAnimals.get(0).amountInBuilding += amount;
                } else {
                    if (player.yourAnimals.size() == 1) {
                        player.yourAnimals.add(new Animals(animal.name, 100.0,10.0, 5.0, 2.0, 5, "corn", 0.1, amount));
                    } else
                        one:{
                            for (int i = 0; i < player.yourAnimals.size(); i++) {
                                if (player.yourAnimals.get(i).name.contains(animal.name)) {
                                    player.yourAnimals.get(i).amountInBuilding += amount;
                                    break one;
                                }
                            }
                            player.yourAnimals.add(new Animals(animal.name, 100.0, 10.0,5.0, 2.0, 5, "corn", 0.1, amount));
                        }
                }
            }
        } else {
            System.out.println("You don't have enough money!");
        }
    }

    public static void buySilos(Players player, Buildings silos) {
        if (player.cash > silos.price) {
            player.cash -= silos.price;
            player.isSilos = true;
            System.out.println("You bought " + silos.name);
        } else {
            System.out.println("You don't have money for " + silos.name);
        }
    }


}



