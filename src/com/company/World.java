package com.company;


import interfaces.RandomNumberGenerator;

public  class World {

    public static void disasters(Player player,int week) {


        if (!player.yourPlantedPlants.isEmpty()) {
            for (int i = 0; i < player.yourPlantedPlants.size(); i++) {
                int flood = RandomNumberGenerator.randomBetween(0, 100);
                int drought = RandomNumberGenerator.randomBetween(0, 100);
                int insects = RandomNumberGenerator.randomBetween(0, 100);

                if (week > 10 && week < 20) {
                    if (flood == 5) {
                        player.yourPlantedPlants.get(i).timeToGrow += RandomNumberGenerator.randomBetween(10, 15);
                    }
                }
                if (week > 20 && week < 30) {
                    if (drought == 6) {
                        player.yourPlantedPlants.get(i).efficiency_ha *= 0.7;
                    }
                }
                if (week > 30 && week < 40) {
                    if (insects == 3) {
                        player.yourPlantedPlants.get(i).amountInInventory *= 0.5;
                    }
                }
            }
        }
    }
}
