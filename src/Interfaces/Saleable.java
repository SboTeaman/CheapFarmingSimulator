package Interfaces;

import Animals.Animal;
import Buildings.Farm;
import com.company.Plant;
import com.company.Player;

import java.util.Random;

public class Saleable {

    public static void sellPlant(Player player, Plant plant, int amount) {

        for (int i = 0; i < player.yourPlants.size(); i++) {

            if (player.yourPlants.get(i).name.equals(plant.product)) {
                if (player.yourPlants.get(i).amountInInventory >= amount) {
                    Random rn = new Random();
                    double valueOfTransaction = amount * plant.value_kg * rn.nextDouble();
                    player.cash += valueOfTransaction;
                    System.out.println("You successful sell " + amount + " of " + plant.name);
                    player.yourPlants.get(i).amountInInventory -= amount;

                    if (player.yourPlants.get(i).amountInInventory == 0) {
                        player.yourPlants.remove(i);
                        break;
                    }

                } else if (player.yourPlants.get(i).amountInInventory < amount) {
                    System.out.println("You don't have enough " + plant.name + " to sell");
                }
            }
        }
    }

    public static void sellAnimal(Player player, Animal animal, int amount) {

        for (int i = 0; i < player.yourAnimals.size(); i++) {

            if (player.yourAnimals.get(i).name.equals(animal.name)) {
                if (player.yourAnimals.get(i).amountInBuilding >= amount) {
                    Random rn = new Random();
                    double valueOfTransaction = amount * animal.costOfPurchase * rn.nextDouble();
                    player.cash += valueOfTransaction;
                    System.out.println("You successful sell " + amount + " of " + animal.name);
                    player.yourAnimals.get(i).amountInBuilding -= amount;

                    if (player.yourAnimals.get(i).amountInBuilding == 0) {
                        player.yourAnimals.remove(i);
                        break;
                    }

                } else if (player.yourAnimals.get(i).amountInBuilding < amount) {
                    System.out.println("You don't have enough " + animal.name + " to sell");
                }
            }
        }
    }

    public void sellField(Player player, Farm farm, double amount) {
        double valueOfTransaction = amount * RandomNumberGenerator.randomBetween(10, 20);
        if (player.getFarm() == farm) {
            if (farm.fieldsSlots > amount) {
                player.cash += valueOfTransaction;
                farm.fieldsSlots -= amount;
            } else {
                System.out.println("You don't have enough field to sell");
            }
        } else {
            System.out.println("You don't any have farm");
        }
    }
}


