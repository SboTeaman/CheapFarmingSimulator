package notBuildings;

import interfaces.Buyable;
import interfaces.RandomNumberGeneratorDouble;
import interfaces.RandomNumberGeneratorInt;
import interfaces.Saleable;

public class Animal implements Buyable,Saleable {
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
                    if (RandomNumberGeneratorInt.randomBetween(0, 10) == 5) {
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
                    player.setCash(amount * RandomNumberGeneratorInt.randomBetween(1, 3));
                }
            }
        }
    }

    public static void productionItem(Player player) {
        if (!player.yourAnimals.isEmpty()) {
            int amount = 0;
            for (int i = 0; i < player.yourAnimals.size(); i++) {
                if (player.yourAnimals.get(i).name.equals("cow") || player.yourAnimals.get(i).name.equals("chicken") || player.yourAnimals.get(i).name.equals("cheap") || player.yourPlantedPlants.get(i).timeToGrow <= 0) {
                    amount += player.yourAnimals.get(i).amountInBuilding;
                }
            }
            player.setCash(amount * RandomNumberGeneratorInt.randomBetween(2, 5));
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

    @Override
    public void sell(Player player, int amount) {
        for (int i = 0; i < player.yourAnimals.size(); i++) {
            if (player.yourBuildings.get(i).type.equals(this.buildingRequired)) {

                if (player.yourAnimals.get(i).name.equals(this.name)) {
                    if (player.yourAnimals.get(i).amountInBuilding >= amount) {

                        double valueOfTransaction = amount * this.costOfPurchase * RandomNumberGeneratorDouble.randomBetween(0.8, 1.2);
                        player.setCash(valueOfTransaction);
                        System.out.println("You successful sell " + amount + " of " + this.name);
                        player.yourAnimals.get(i).amountInBuilding -= amount;
                        player.yourBuildings.get(i).capacity += amount;
                        if (player.yourAnimals.get(i).amountInBuilding == 0) {
                            player.yourAnimals.remove(i);
                            break;
                        }

                    } else if (player.yourAnimals.get(i).amountInBuilding < amount) {
                        System.out.println("You don't have enough " + this.name + " to sell");
                    }
                }
                System.out.println("You don't have " + this.name + " to sell");
            }
        }
    }

    @Override
    public void buy(Player player, int amount) {
        if (!player.yourBuildings.isEmpty()) {
            double value = this.costOfPurchase * amount;
            for (int n = 0; n < player.yourBuildings.size(); n++) {
                if (player.yourBuildings.get(n).type.equals(this.buildingRequired)) {
                    if (player.getCash() >= this.costOfPurchase) {
                        if (player.yourBuildings.get(n).capacity >= amount) {
                            player.yourBuildings.get(n).capacity -= amount;

                            if (player.yourAnimals.isEmpty()) {
                                player.yourAnimals.add(new Animal(this.name, this.costOfPurchase, this.weight, this.timeToGrowUp, this.gainWeightForWeek, this.amountOfFoodPerWeek, this.typeOfFoodThatCanEat, amount));
                                player.setCash(-value);
                            } else {
                                if (player.yourAnimals.size() == 1 && player.yourAnimals.get(0).name.equals(this.name)) {
                                    player.yourAnimals.get(0).amountInBuilding += amount;
                                } else {
                                    if (player.yourAnimals.size() == 1) {
                                        player.yourAnimals.add(new Animal(this.name, this.costOfPurchase, this.weight, this.timeToGrowUp, this.gainWeightForWeek, this.amountOfFoodPerWeek, this.typeOfFoodThatCanEat, amount));
                                        player.setCash(-value);
                                    } else
                                        one:{
                                            for (int i = 0; i < player.yourAnimals.size(); i++) {
                                                if (player.yourAnimals.get(i).name.contains(this.name)) {
                                                    player.yourAnimals.get(i).amountInBuilding += amount;
                                                    player.setCash(-value);
                                                    break one;
                                                }
                                            }
                                            player.yourAnimals.add(new Animal(this.name, this.costOfPurchase, this.weight, this.timeToGrowUp, this.gainWeightForWeek, this.amountOfFoodPerWeek, this.typeOfFoodThatCanEat, amount));
                                            player.setCash(-value);
                                        }
                                }
                            }
                            System.out.println("You bought " + amount + " of " + this.name);
                        } else {
                            System.out.println("You don't enough space");
                        }
                    } else {
                        System.out.println("You don't have enough money!");
                    }
                }

            }
        } else {
            System.out.println("You don't have any buildings");
        }
    }
}
