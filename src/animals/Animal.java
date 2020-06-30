package animals;

import interfaces.RandomNumberGenerator;
import com.company.Player;

public class Animal {
    public final String name;
    public final double costOfPurchase;
    public final double gainWeightForWeek;
    public final double amountOfFoodPerWeek;
    public final String typeOfFoodThatCanEat;
    public double weight;
    public double timeToGrowUp;
    public String productForSelling;
    public int amountInBuilding = 0;
    public String buildingRequired;

    public Animal(String name, double costOfPurchase, double weight, double timeToGrowUp, double gainWeightForWeek, double amountOfFoodPerWeek, String typeOfFoodThatCanEat, String productForSelling, String buildingRequired) {
        this.name = name;
        this.costOfPurchase = costOfPurchase;
        this.weight = weight;
        this.timeToGrowUp = timeToGrowUp;
        this.gainWeightForWeek = gainWeightForWeek;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.typeOfFoodThatCanEat = typeOfFoodThatCanEat;
        this.productForSelling = productForSelling;
        this.buildingRequired = buildingRequired;
    }

    public Animal(String name, double costOfPurchase, double weight, double timeToGrowUp, double gainWeightForWeek, double amountOfFoodPerWeek, String typeOfFoodThatCanEat, String productForSelling) {
        this.name = name;
        this.costOfPurchase = costOfPurchase;
        this.weight = weight;
        this.timeToGrowUp = timeToGrowUp;
        this.gainWeightForWeek = gainWeightForWeek;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.typeOfFoodThatCanEat = typeOfFoodThatCanEat;
        this.productForSelling = productForSelling;

    }

    public Animal(String name, double costOfPurchase, double weight, double timeToGrowUp, double gainWeightForWeek, double amountOfFoodPerWeek, String typeOfFoodThatCanEat) {
        this.name = name;
        this.costOfPurchase = costOfPurchase;
        this.weight = weight;
        this.timeToGrowUp = timeToGrowUp;
        this.gainWeightForWeek = gainWeightForWeek;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.typeOfFoodThatCanEat = typeOfFoodThatCanEat;

    }

    public Animal(String name, double costOfPurchase, double weight, double timeToGrowUp, double gainWeightForWeek, double amountOfFoodPerWeek, String typeOfFoodThatCanEat, int amountInBuilding) {
        this.name = name;
        this.costOfPurchase = costOfPurchase;
        this.weight = weight;
        this.timeToGrowUp = timeToGrowUp;
        this.gainWeightForWeek = gainWeightForWeek;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.typeOfFoodThatCanEat = typeOfFoodThatCanEat;
        this.amountInBuilding = amountInBuilding;

    }

    public static void growingProcess(Player player) {
        if (!player.yourAnimals.isEmpty()) {
            for (int i = 0; i < player.yourAnimals.size(); i++) {
                if (player.yourAnimals.get(i).timeToGrowUp > 0) {
                    player.yourAnimals.get(i).timeToGrowUp -= 1;
                    player.yourAnimals.get(i).weight += player.yourAnimals.get(i).gainWeightForWeek;
                }
            }
        }
    }

    public static void reproduction(Player player) {
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

    public static void feed(Player player) {
        if (!player.yourAnimals.isEmpty()) {
            double amount;
            for (int i = 0; i < player.yourAnimals.size(); i++) {
                amount = player.yourAnimals.get(i).amountInBuilding * player.yourAnimals.get(i).amountOfFoodPerWeek;
                if (!player.yourPlants.isEmpty() && player.yourPlants.get(i).name.equals(player.yourAnimals.get(i).typeOfFoodThatCanEat)) {
                    player.yourPlants.get(i).amountInInventory -= amount;

                } else if (player.yourPlants.isEmpty()) {
                    player.setCash(amount * RandomNumberGenerator.randomBetween(1, 3));
                }
            }
        }
    }

    public static void productionItem(Player player) {
        if (!player.yourAnimals.isEmpty()) {
            int amount = 0;
            for (int i = 0; i < player.yourAnimals.size(); i++) {
                if (player.yourAnimals.get(i).name.equals("cow") || player.yourAnimals.get(i).name.equals("chicken") || player.yourAnimals.get(i).name.equals("cheap")) {
                    amount += player.yourAnimals.get(i).amountInBuilding;
                }
            }
            player.setCash(amount * RandomNumberGenerator.randomBetween(1, 10));
        }
    }

    @Override
    public String toString() {
        return "Yours Animals: " +
                "\nname: " + name +
                "\ncostOfPurchase: " + costOfPurchase +
                "\nWeight: " + weight +
                "\ntimeToGrowUp: " + timeToGrowUp +
                "\ngainWeightForWeek: " + gainWeightForWeek +
                "\namountOfFoodPerWeek: " + amountOfFoodPerWeek +
                "\ntypeOfFoodThatCanEat: " + typeOfFoodThatCanEat +
                "\namountInBuilding: " + amountInBuilding + "\n";
    }
}

