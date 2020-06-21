package com.company;


import Interfaces.RandomNumberGenerator;

public class World {

    public static void disasters(Player player) {
        int flood = RandomNumberGenerator.randomBetween(0, 10);
        int drought = RandomNumberGenerator.randomBetween(0, 10);
        int groaning = RandomNumberGenerator.randomBetween(0, 10);

        if (!player.yourPlantedPlants.isEmpty()) {
            for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
                if (player.week > 10 && player.week < 20) {
                    if (flood == 5) {
                        player.yourPlantedPlants.get(i).timeToGrow += RandomNumberGenerator.randomBetween(10, 15);
                    }
                }
                if (player.week > 20 && player.week < 30) {
                    if (drought == 6) {
                        player.yourPlantedPlants.get(i).efficiency_ha *= 0.7;
                    }
                }
                if (player.week > 30 && player.week < 40) {
                    if (groaning == 3) {
                        player.yourPlantedPlants.get(i).amountInInventory *= 0.5;
                    }
                }
            }
        }

    }

}
