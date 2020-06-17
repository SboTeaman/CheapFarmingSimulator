package Interfaces;

import Buildings.Buildings;
import com.company.Plants;
import com.company.Players;

import java.util.Random;

public class Buyable {

    public static void buyPlantSeed(Players player, Plants plant, int amount) {
        if (player.cash >= plant.value_kg) {

            if (player.yourSeeds.isEmpty()) {
                player.yourSeeds.add(new Plants(plant.name, 2.0, 0.5, 200.0, 5.0, 0.25, 5.0, amount));
                player.yourSeeds.get(0).name.equals(plant.name);
            } else {
                if (player.yourSeeds.size() == 1 && player.yourSeeds.get(0).name.equals(plant.name)) {
                    player.yourSeeds.get(0).amountInInventory += amount;
                } else {
                    if (player.yourSeeds.size() == 1) {
                        player.yourSeeds.add(new Plants(plant.name, 2.0, 0.5, 200.0, 5.0, 0.25, 5.0, amount));
                    } else
                        one:{
                            for (int i = 0; i < player.yourSeeds.size(); i++) {
                                if (player.yourSeeds.get(i).name.contains(plant.name)) {
                                    player.yourSeeds.get(i).amountInInventory += amount;
                                    break one;
                                }
                            }
                            player.yourSeeds.add(new Plants(plant.name, 2.0, 0.5, 200.0, 5.0, 0.25, 5.0, amount));
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



