package interfaces;

import animals.Animal;
import buildings.Building;
import buildings.Farm;
import com.company.Plant;
import com.company.Player;

public class Buyable {

    public static void buyPlantSeed(Player player, Plant plant, int amount) {
        if (player.getCash() >= plant.value_kg) {
            double value = plant.costOfHarvesting * amount;
            if (player.yourSeeds.isEmpty()) {
                player.yourSeeds.add(new Plant(plant.name, plant.costOfPlanting, plant.costOfProtectingFromParasite, plant.efficiency_ha, plant.timeToGrow, plant.costOfHarvesting, plant.value_kg, amount, plant.product));
                player.setCash(-value);

            } else {
                if (player.yourSeeds.size() == 1 && player.yourSeeds.get(0).name.equals(plant.name)) {
                    player.yourSeeds.get(0).amountInInventory += amount;
                } else {
                    if (player.yourSeeds.size() == 1) {
                        player.yourSeeds.add(new Plant(plant.name, plant.costOfPlanting, plant.costOfProtectingFromParasite, plant.efficiency_ha, plant.timeToGrow, plant.costOfHarvesting, plant.value_kg, amount, plant.product));
                        player.setCash(-value);
                    } else
                        one:{
                            for (int i = 0; i < player.yourSeeds.size(); i++) {
                                if (player.yourSeeds.get(i).name.contains(plant.name)) {
                                    player.yourSeeds.get(i).amountInInventory += amount;
                                    player.setCash(-value);
                                    break one;
                                }
                            }
                            player.yourSeeds.add(new Plant(plant.name, plant.costOfPlanting, plant.costOfProtectingFromParasite, plant.efficiency_ha, plant.timeToGrow, plant.costOfHarvesting, plant.value_kg, amount, plant.product));
                            player.setCash(-value);
                        }
                }
            }
            System.out.println("You bought " + amount + " " + plant.name);
        } else {
            System.out.println("You don't have enough money!");
        }
    }

    public static void buyAnimal(Player player, Animal animal, int amount) {
        if (!player.yourBuildings.isEmpty()) {
            double value = animal.costOfPurchase * amount;
            for (int n = 0; n < player.yourBuildings.size(); n++) {
                if (player.yourBuildings.get(n).type.equals(animal.buildingRequired)) {
                    if (player.getCash() >= animal.costOfPurchase) {
                        if (player.yourBuildings.get(n).capacity >= amount) {
                            player.yourBuildings.get(n).capacity -= amount;

                            if (player.yourAnimals.isEmpty()) {
                                player.yourAnimals.add(new Animal(animal.name, animal.costOfPurchase, animal.weight, animal.timeToGrowUp, animal.gainWeightForWeek, animal.amountOfFoodPerWeek, animal.typeOfFoodThatCanEat, amount));
                                player.setCash(-value);
                            } else {
                                if (player.yourAnimals.size() == 1 && player.yourAnimals.get(0).name.equals(animal.name)) {
                                    player.yourAnimals.get(0).amountInBuilding += amount;
                                } else {
                                    if (player.yourAnimals.size() == 1) {
                                        player.yourAnimals.add(new Animal(animal.name, animal.costOfPurchase, animal.weight, animal.timeToGrowUp, animal.gainWeightForWeek, animal.amountOfFoodPerWeek, animal.typeOfFoodThatCanEat, amount));
                                        player.setCash(-value);
                                    } else
                                        one:{
                                            for (int i = 0; i < player.yourAnimals.size(); i++) {
                                                if (player.yourAnimals.get(i).name.contains(animal.name)) {
                                                    player.yourAnimals.get(i).amountInBuilding += amount;
                                                    player.setCash(-value);
                                                    break one;
                                                }
                                            }
                                            player.yourAnimals.add(new Animal(animal.name, animal.costOfPurchase, animal.weight, animal.timeToGrowUp, animal.gainWeightForWeek, animal.amountOfFoodPerWeek, animal.typeOfFoodThatCanEat, amount));
                                            player.setCash(-value);
                                        }
                                }
                            }
                            System.out.println("You bought " + amount + " of " + animal.name);
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

    public static void buySilos(Player player, Building silos) {
        if (player.getCash() > silos.getPrice()) {
            player.setCash(-silos.getPrice());
            player.isSilos = true;
            System.out.println("You bought " + silos.name);
        } else {
            System.out.println("You don't have money for " + silos.name);
        }
    }

    public static void buyFarm(Player player, Farm farm) {

        if (player.getCash() >= farm.price) {

            if (player.farm.isEmpty()) {
                player.setCash(-farm.price);
                player.farm.add(new Farm(farm.name, farm.price, farm.fieldsSlots, farm.maxFieldsSlots));
                System.out.println("You bought: " + farm.name);
            } else if (player.farm.get(0).name.equals(farm.name)) {
                System.out.println("You already have: " + farm.name);
            } else {
                player.setCash(-farm.price);
                player.farm.remove(0);
                player.farm.add(new Farm(farm.name, farm.price, farm.fieldsSlots, farm.maxFieldsSlots));
                System.out.println("You bought: " + farm.name);
            }

        } else {
            System.out.println("You don't have enough money to buy: " + farm.name);
        }
    }

    public static void buyBuildings(Player player, Farm farm, Building building) {
        if (player.farm.isEmpty()) {
            System.out.println("You don't have any farm");
        } else {
            if (player.getCash() > building.getPrice()) {
                if (farm.fieldsSlots > 0) {

                    if (player.yourBuildings.isEmpty()) {
                        player.setCash(-building.getPrice());
                        farm.fieldsSlots -= 1;
                        player.yourBuildings.add(building);
                        System.out.println("You bought: " + building.name);
                    } else {
                        one:
                        {
                            for (int i = 0; i < player.yourBuildings.size(); i++) {
                                if (player.yourBuildings.get(i).type.equals(building.type)) {
                                    player.yourBuildings.get(i).capacity += building.capacity;
                                    break one;
                                }
                            }
                            player.yourBuildings.add(building);
                        }
                    }

                } else {
                    System.out.println("You don't have enough space for " + building.name);
                }
            } else {
                System.out.println("You don't have enough money to buy: " + building.name);
            }
        }
    }

    public static void buyMoreField(Player player, Farm farm, double amount) {

        double valueOfTransaction = farm.priceForField * amount * RandomNumberGenerator.randomBetween(800, 1000);

        if (player.getCash() >= valueOfTransaction) {
            if (player.farm.get(0).name.equals(farm.name)) {
                if (farm.maxFieldsSlots >= amount && player.getCash() >= valueOfTransaction && farm.fieldsSlots < farm.maxFieldsSlots) {
                    farm.fieldsSlots += amount;
                    player.setCash(-valueOfTransaction);
                    System.out.println("You successful expand your farm by " + amount + " new Ha of field");
                } else {
                    System.out.println("You don't have enough space for new field");
                }
            } else {
                System.out.println("You don't have farm to expand");
            }
        } else {
            System.out.println("You don't have enough money for new field!");
        }
    }
}



