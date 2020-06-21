package com.company;

import Buildings.Farm;
import Animals.Animal;
import Buildings.Building;
import Interfaces.RandomNumberGenerator;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;

    public double cash;
    public boolean isSilos = false;
    public List<Plant> yourSeeds = new ArrayList<>();
    public List<Plant> yourPlantedPlants = new ArrayList<>();
    public List<Plant> yourPlants = new ArrayList<>();
    public List<Animal> yourAnimals = new ArrayList<>();
    public List<Building> yourBuildings = new ArrayList<>();
    public int week = 31;
    private Farm farm;

    Player(String name, double cash) {
        this.name = name;
        this.cash = 10000.0;
        Farm farm = null;
    }

    public Farm getFarm() {
        return this.farm;
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public static void isCash(Player player) {
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


}
