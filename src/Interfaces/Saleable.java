package Interfaces;

import com.company.Plants;
import com.company.Players;

import java.util.Random;

public class Saleable {

    public static void sellPlantSeed(Players player, Plants plant, int amount) {

        for (int i = 0; i < player.yourSeeds.size(); i++) {

            if (player.yourSeeds.get(i).name.equals(plant.name)) {
                if (player.yourSeeds.get(i).amountInInventory >= amount) {
                    Random rn = new Random();
                    double valueOfTransaction = amount * plant.value_kg * rn.nextDouble();
                    player.cash += valueOfTransaction;
                    System.out.println("You successful sell " + amount + " of " + plant.name);
                    player.yourSeeds.get(i).amountInInventory -= amount;

                    if (player.yourSeeds.get(i).amountInInventory == 0) {
                        player.yourSeeds.remove(i);
                        break;
                    }

                } else if (player.yourSeeds.get(i).amountInInventory < amount) {
                    System.out.println("You don't have enough " + plant.name + " to sell");
                }


            }
        }
    }
}

