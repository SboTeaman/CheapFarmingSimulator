package Interfaces;

import Buildings.Buildings;
import Buildings.Silos;
import com.company.Plants;
import com.company.Players;

import java.util.Random;

public class Buyable {

    public static void buyPlantSeed(Players player, int amount, Plants plant) {
        if (player.cash >= plant.value_kg) {

            Random randomModifier = new Random();
            double valueOfTransaction = amount * plant.value_kg * randomModifier.nextDouble();
            player.cash -= valueOfTransaction;

            if (player.yourSeeds.isEmpty()) {
                player.yourSeeds.add(new Plants(plant.name, 2.0, 0.5, 200.0, 5.0, 0.25, 5.0, amount));
                System.out.println(player.yourSeeds.size());
            } else {
                for (int i = 0; i < player.yourSeeds.size(); i++) {

                    if (player.yourSeeds.get(i).name.equals(plant.name)) {
                        player.yourSeeds.get(i).amountInInventory += amount;

                    } else {
                        player.yourSeeds.add(new Plants(plant.name, 2.0, 0.5, 200.0, 5.0, 0.25, 5.0, amount));
                       break;
                    }

                }
            }
        }
    }

public static void buySilos(Players player, Buildings silos){
        if(player.cash>silos.price){
            player.cash-=silos.price;
            player.isSilos=true;
            System.out.println("You bought "+silos.name);
        }
        else{
            System.out.println("You don't have money for "+silos.name);
        }
}


}



