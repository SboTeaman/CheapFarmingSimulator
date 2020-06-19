package Animals;

import Buildings.Farms;
import Interfaces.RandomNumberGenerator;
import com.company.Plants;
import com.company.Players;

public class Animals {
    public String name;
    public double costOfPurchase;
    public double weight;
    public double timeToGrowUp;
    public double gainWeightForWeek;
    public double amountOfFoodPerWeek;
    public String typeOfFoodThatCanEat;
    public double chanceForReproduction;
    public String productForSelling;
    public int amountInBuilding = 0;

    public Animals(String name, double costOfPurchase, double weight, double timeToGrowUp, double gainWeightForWeek, double amountOfFoodPerWeek, String typeOfFoodThatCanEat, double chanceForReproduction, String productForSelling) {
        this.name = name;
        this.costOfPurchase = costOfPurchase;
        this.weight = weight;
        this.timeToGrowUp = timeToGrowUp;
        this.gainWeightForWeek = gainWeightForWeek;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.typeOfFoodThatCanEat = typeOfFoodThatCanEat;
        this.chanceForReproduction = chanceForReproduction;
        this.productForSelling = productForSelling;

    }

    public Animals(String name, double costOfPurchase, double weight, double timeToGrowUp, double gainWeightForWeek, double amountOfFoodPerWeek, String typeOfFoodThatCanEat, double chanceForReproduction) {
        this.name = name;
        this.costOfPurchase = costOfPurchase;
        this.weight = weight;
        this.timeToGrowUp = timeToGrowUp;
        this.gainWeightForWeek = gainWeightForWeek;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.typeOfFoodThatCanEat = typeOfFoodThatCanEat;
        this.chanceForReproduction = chanceForReproduction;

    }


    public Animals(String name, double costOfPurchase, double weight, double timeToGrowUp, double gainWeightForWeek, double amountOfFoodPerWeek, String typeOfFoodThatCanEat, double chanceForReproduction, int amountInBuilding) {
        this.name = name;
        this.costOfPurchase = costOfPurchase;
        this.weight = weight;
        this.timeToGrowUp = timeToGrowUp;
        this.gainWeightForWeek = gainWeightForWeek;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.typeOfFoodThatCanEat = typeOfFoodThatCanEat;
        this.chanceForReproduction = chanceForReproduction;
        this.amountInBuilding = amountInBuilding;

    }

    public static void growingProcess(Players player) {
        if (!player.yourAnimals.isEmpty()) {
            for (int i = 0; i < player.yourAnimals.size(); i++) {
                if (player.yourAnimals.get(i).timeToGrowUp > 0) {
                    player.yourAnimals.get(i).timeToGrowUp -= 1;
                    player.yourAnimals.get(i).weight += player.yourAnimals.get(i).gainWeightForWeek;


                }
            }
        }
    }

    public static void reproduction(Players player) {
        if (!player.yourAnimals.isEmpty()) {
            for (int i = 0; i < player.yourAnimals.size(); i++) {
                if (player.yourAnimals.get(i).amountInBuilding >= 2 && player.yourAnimals.get(i).timeToGrowUp <= 0) {
                    if (RandomNumberGenerator.randomBetween(0, 10) == 5) {
                        player.yourAnimals.get(i).amountInBuilding += 1;
                    }
                }
            }
        }
    }

    public static void feed(Players player) {
        if (!player.yourAnimals.isEmpty()) {
            double value;
            for (int i = 0; i < player.yourAnimals.size(); i++) {
                value = player.yourAnimals.get(i).amountInBuilding * player.yourAnimals.get(i).amountOfFoodPerWeek;
                if (!player.yourPlants.isEmpty() && player.yourPlants.get(i).name.equals(player.yourAnimals.get(i).typeOfFoodThatCanEat)) {
                    player.yourPlants.get(i).amountInInventory -= value;

                } else if (player.yourPlants.isEmpty()) {
                    player.cash -= value * RandomNumberGenerator.randomBetween(1, 3);
                }
            }
        }
    }

    public static void productionItem(Players player) {
        if (!player.yourAnimals.isEmpty()) {
            for (int i = 0; i < player.yourAnimals.size(); i++) {
                if (player.yourAnimals.get(i).name.equals("cow") || player.yourAnimals.get(i).name.equals("chicken") || player.yourAnimals.get(i).name.equals("cheap")) {
                    int amount=0;
                    amount+=player.yourAnimals.get(i).amountInBuilding;
                    player.cash+=amount*RandomNumberGenerator.randomBetween(1,10);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "\nYours Animals: " +
                "\nname: " + name +
                //  "\ncostOfPurchase: " + costOfPurchase +
                "\nWeight: " + weight +
                "\ntimeToGrowUp: " + timeToGrowUp +
                //  "\ngainWeightForWeek: " + gainWeightForWeek +
                //  "\namountOfFoodPerWeek: " + amountOfFoodPerWeek +
                //  "\ntypeOfFoodThatCanEat: " + typeOfFoodThatCanEat +
                //  "\nchanceForReproduction: " + chanceForReproduction +
                "\namountInBuilding: " + amountInBuilding + "\n";
    }
}

