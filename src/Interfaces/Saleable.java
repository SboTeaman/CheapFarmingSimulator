package Interfaces;

import com.company.Plants;
import com.company.Players;

import java.util.Random;

public class Saleable {

    public static void sellPlantSeed(Plants plant, Players player, int amount) {
        for (int i = 0; i < player.yourPlants.size(); i++) {

            if (player.yourPlants.get(i).name.equals(plant.name)) {
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
                    break;
                } else if (player.yourPlants.get(i).amountInInventory < amount) {
                    System.out.println("You don't have enough " + plant.name + " to sell");
                    break;
                }


            } else {
                System.out.println("You don't have " + plant.name);
                break;
            }
        }
    }

}

