package com.company;

import animals.Animal;
import buildings.*;
import interfaces.Buyable;
import interfaces.RandomNumberGenerator;
import interfaces.Saleable;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Player.newPlayer();

        int choiceMenu;
        int week;
        int year = 2020;
        for (week = 1; week > 0; week++) {

            /*PLANTS SEEDS */

            Plant cornSeed = new Plant("cornSeed", 25.0, 10, RandomNumberGenerator.randomBetween(200, 300), 2, 1.25, 200, 20, "corn");
            Plant carrotSeed = new Plant("carrotSeed", 33.50, 11, RandomNumberGenerator.randomBetween(100, 150), 50, 2.3, 300, 30, "carrot");
            Plant sunflowerSeed = new Plant("sunflowerSeed", 22.0, 15, RandomNumberGenerator.randomBetween(100, 220), 30, 0.25, 200, 20, "sunflower");
            Plant potatoSeed = new Plant("potatoSeed", 13.0, 8, RandomNumberGenerator.randomBetween(150, 200), 35, 4.3, 400, 40, "potato");
            Plant wheatSeed = new Plant("wheatSeed", 43.40, 8, RandomNumberGenerator.randomBetween(180, 200), 42, 2, 600, 60, "wheat");
            Plant broccoliSeed = new Plant("broccoliSeed", 13.0, 7, RandomNumberGenerator.randomBetween(100, 120), 25, 3, 700, 70, "broccoli");
            Plant onionSeed = new Plant("onionSeed", 23.0, 12, RandomNumberGenerator.randomBetween(100, 120), 30, 5.25, 200, 20, "onion");
            Plant lettuceSeed = new Plant("lettuceSeed", 26.60, 5, RandomNumberGenerator.randomBetween(160, 200), 20, 2.25, 200, 20, "lettuce");
            Plant tomatoSeed = new Plant("tomatoSeed", 33.0, 9, RandomNumberGenerator.randomBetween(100, 200), 33, 3.3, 400, 40, "tomato");

            Plant appleSeed = new Plant("appleSeed", 300.0, 20, RandomNumberGenerator.randomBetween(30, 50), 100, 0.3, 1000, 10, "apple");
            Plant pearSeed = new Plant("pearSeed", 250.0, 22, RandomNumberGenerator.randomBetween(35, 55), 120, 0.25, 2000, 20, "pear");
            Plant cherrySeed = new Plant("cherrySeed", 400.0, 21, RandomNumberGenerator.randomBetween(40, 60), 130, 0.25, 3000, 30, "cherry");
            Plant melonSeed = new Plant("melonSeed", 50.0, 16, RandomNumberGenerator.randomBetween(80, 110), 40, 4.3, 200, 20, "melon");
            Plant watermelonSeed = new Plant("watermelonSeed", 55.50, 12, RandomNumberGenerator.randomBetween(90, 200), 47, 5.25, 250, 30, "watermelon");
            Plant lemonSeed = new Plant("lemonSeed", 27.0, 5, RandomNumberGenerator.randomBetween(100, 200), 60, 0.25, 200, 20, "lemon");
            Plant strawberriesSeed = new Plant("strawberriesSeed", 60.0, RandomNumberGenerator.randomBetween(100, 200), 200, 34, 6.25, 500, 50, "strawberries");

            /*ANIMALS */
            Animal cow = new Animal("cow", 1000.0, 10.0, 200.0, 0.2, 2.0, "corn", "milk", "Cowshed");
            Animal sheep = new Animal("sheep", 1200.0, 10.0, 250.0, 0.1, 2.0, "wheat", "wool", "Stable");
            Animal pig = new Animal("pig", 800.0, 10.0, 180.0, 0.30, 2.0, "carrot", null, "Pigsty");
            Animal chicken = new Animal("chicken", 200.0, 0.2, 50.0, 0.1, 2.0, "sunflower", "egg", "Chickencoop");
            Animal dog = new Animal("dog", 2000.0, 1.0, 100.0, 0.2, 2.0, "dogFood");
            Animal cat = new Animal("cat", 2200.0, 0.5, 100.0, 0.1, 2.0, "catFood");

            /*FARMS */
            Farm oldFarm = new Farm("Old Farm", RandomNumberGenerator.randomBetween(1000, 1500), RandomNumberGenerator.randomBetween(2, 5), 10);
            Farm startedFarm = new Farm("startedFarm", RandomNumberGenerator.randomBetween(3000, 4000), RandomNumberGenerator.randomBetween(5, 10), 20);
            Farm advancedFarm = new Farm("advancedFarm", RandomNumberGenerator.randomBetween(5000, 8000), RandomNumberGenerator.randomBetween(10, 15), 30);
            Farm highTierFarm = new Farm("highTierFarm", RandomNumberGenerator.randomBetween(10000, 15000), RandomNumberGenerator.randomBetween(20, 25), 40);
            Farm ultimateFarm = new Farm("ultimateFarm", RandomNumberGenerator.randomBetween(200000, 300000), RandomNumberGenerator.randomBetween(30, 40), 100);

            /*BUILDINGS */
            Building smallCowshed = new Cowshed("smallCowshed", 1000.0, 1.0, 10, "Cowshed");
            Building smallPigsty = new Pigsty("smallPigsty", 1000.0, 1.0, 10, "Pigsty");
            Building smallStable = new Stable("smallStable", 1000.0, 1.0, 10, "Stable");
            Building smallChickencoop = new Chickencoop("smallChickencoop", 1000.0, 1.0, 10, "Chickencoop");

            Building mediumCowshed = new Cowshed("mediumCowshed", 5000.0, 1.0, 30, "Cowshed");
            Building mediumPigsty = new Pigsty("mediumPigsty", 5000.0, 1.0, 30, "Pigsty");
            Building mediumStable = new Stable("mediumStable", 5000.0, 1.0, 30, "Stable");
            Building mediumChickencoop = new Chickencoop("mediumChickencoop", 5000.0, 1.0, 30, "Chickencoop");

            Building bigCowshed = new Cowshed("bigCowshed", 10000.0, 1.0, 100, "Cowshed");
            Building bigPigsty = new Pigsty("bigPigsty", 10000.0, 1.0, 100, "Pigsty");
            Building bigStable = new Stable("bigStable", 10000.0, 1.0, 100, "Stable");
            Building bigChickencoop = new Chickencoop("bigChickencoop", 1000.0, 1.0, 100, "Chickencoop");

            Building silos = new Silos("silos", 2000.0);

            /*MENU*/
            System.out.println("Year: " + year + " Week:" + week);

            for (int whichPlayer = 0; whichPlayer < Player.playerList.size(); whichPlayer++) {
                do {
                    System.out.println("\n\n");
                    System.out.println("---------------------");
                    System.out.println("Turn: " + Player.playerList.get(whichPlayer).toString());
                    System.out.println("---------------------");
                    System.out.println("MENU");
                    System.out.println("---------------------");
                    System.out.println("1 - SHOP ");
                    System.out.println("2 - Statistic of yours Farms");
                    System.out.println("3 - Manage your farms:");
                    System.out.println("---------------------");
                    System.out.println("0 - End a week");


                    Scanner scannerMenu = new Scanner(System.in);
                    choiceMenu = scannerMenu.nextInt();
                    System.out.println(choiceMenu);
                    switch (choiceMenu) {
                        case 1: {
                            System.out.println("---------------------");
                            System.out.println("Welcome in the Shop");
                            System.out.println("---------------------");
                            System.out.println("1 - Buy new Farm");
                            System.out.println("2 - Buy new Buildings");
                            System.out.println("3 - Buy more field");
                            System.out.println("4 - Buy Plants");
                            System.out.println("5 - Buy Animals");
                            System.out.println("---------------------");
                            System.out.println("6 - Sell Plants");
                            System.out.println("7 - Sell Animals");
                            System.out.println("8 - Sell Field");
                            System.out.println("---------------------");
                            System.out.println("9 - Return");
                            System.out.println("---------------------");

                            Scanner scannerFarm = new Scanner(System.in);
                            int choiceShop = scannerFarm.nextInt();

                            switch (choiceShop) {
                                case 1:
                                    System.out.println("---------------------");
                                    System.out.println("Buy new Farm");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + oldFarm.toString());
                                    System.out.println("2 - " + startedFarm.toString());
                                    System.out.println("3 - " + advancedFarm.toString());
                                    System.out.println("4 - " + highTierFarm.toString());
                                    System.out.println("5 - " + ultimateFarm.toString());
                                    System.out.println("---------------------");
                                    System.out.println("0 - Return");
                                    System.out.println("---------------------");

                                    Scanner scannerPurchaseFarm = new Scanner(System.in);
                                    int choicePurchaseFarm = scannerPurchaseFarm.nextInt();
                                    switch (choicePurchaseFarm) {
                                        case 1:
                                            Buyable.buyFarm(Player.playerList.get(whichPlayer), oldFarm);
                                            break;
                                        case 2:
                                            Buyable.buyFarm(Player.playerList.get(whichPlayer), startedFarm);
                                            break;
                                        case 3:
                                            Buyable.buyFarm(Player.playerList.get(whichPlayer), advancedFarm);
                                            break;
                                        case 4:
                                            Buyable.buyFarm(Player.playerList.get(whichPlayer), highTierFarm);
                                            break;
                                        case 5:
                                            Buyable.buyFarm(Player.playerList.get(whichPlayer), ultimateFarm);
                                            break;
                                    }
                                    break;

                                case 2:
                                    System.out.println("---------------------");
                                    System.out.println(" Buy new Buildings");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + smallCowshed.toString());
                                    System.out.println("2 - " + smallPigsty.toString());
                                    System.out.println("3 - " + smallStable.toString());
                                    System.out.println("4 - " + smallChickencoop.toString());
                                    System.out.println("5 - " + mediumCowshed.toString());
                                    System.out.println("6 - " + mediumPigsty.toString());
                                    System.out.println("7 - " + mediumStable.toString());
                                    System.out.println("8 - " + mediumChickencoop.toString());
                                    System.out.println("9 - " + bigCowshed.toString());
                                    System.out.println("10 - " + bigPigsty.toString());
                                    System.out.println("11 - " + bigStable.toString());
                                    System.out.println("12 - " + bigChickencoop.toString());
                                    System.out.println("13 - " + silos.toString());
                                    System.out.println("---------------------");
                                    System.out.println("0 - return");
                                    System.out.println("---------------------");

                                    Scanner scannerPurchaseBuilding = new Scanner(System.in);
                                    int choicePurchaseBuilding = scannerPurchaseBuilding.nextInt();

                                    switch (choicePurchaseBuilding) {
                                        case 1:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), smallCowshed);
                                            break;
                                        case 2:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), smallPigsty);
                                            break;
                                        case 3:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), smallStable);
                                            break;
                                        case 4:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), smallChickencoop);
                                            break;
                                        case 5:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), mediumCowshed);
                                            break;
                                        case 6:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), mediumPigsty);
                                            break;
                                        case 7:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), mediumStable);
                                            break;
                                        case 8:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), mediumChickencoop);
                                            break;
                                        case 9:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), bigCowshed);
                                            break;
                                        case 10:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), bigPigsty);
                                            break;
                                        case 11:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), bigStable);
                                            break;
                                        case 12:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), bigChickencoop);
                                            break;
                                        case 13:
                                            Buyable.buySilos(Player.playerList.get(whichPlayer), silos);
                                            break;
                                    }
                                    break;
                                case 3: {
                                    System.out.println("---------------------");
                                    System.out.println("Buy more field");
                                    System.out.println("---------------------");

                                    if (Player.playerList.get(whichPlayer).farm == null) {
                                        System.out.println("You don't have any farm");

                                    } else {
                                        System.out.println("You have " + Player.playerList.get(whichPlayer).farm.get(0).fieldsSlots + " from " + Player.playerList.get(whichPlayer).farm.get(0).maxFieldsSlots);
                                        System.out.println("How much you want to buy?");

                                        Scanner scannerField = new Scanner(System.in);
                                        int choiceHowMuchField = scannerField.nextInt();
                                        Buyable.buyMoreField(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), choiceHowMuchField);
                                    }

                                    break;
                                }
                                case 4:
                                    System.out.println("---------------------");
                                    System.out.println("Buy Plants");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + cornSeed.name + " " + cornSeed.costOfBuying + " for One Ha");
                                    System.out.println("2 - " + carrotSeed.name + " " + carrotSeed.costOfBuying + " for One Ha");
                                    System.out.println("3 - " + sunflowerSeed.name + " " + sunflowerSeed.costOfBuying + " for One Ha");
                                    System.out.println("4 - " + potatoSeed.name + " " + potatoSeed.costOfBuying + " for One Ha");
                                    System.out.println("5 - " + wheatSeed.name + " " + wheatSeed.costOfBuying + " for One Ha");
                                    System.out.println("6 - " + broccoliSeed.name + " " + broccoliSeed.costOfBuying + " for One Ha");
                                    System.out.println("7 - " + onionSeed.name + " " + onionSeed.costOfBuying + " for One Ha");
                                    System.out.println("8 - " + lettuceSeed.name + " " + lettuceSeed.costOfBuying + " for One Ha");
                                    System.out.println("9 - " + tomatoSeed.name + " " + tomatoSeed.costOfBuying + " for One Ha");
                                    System.out.println("10 - " + appleSeed.name + " " + appleSeed.costOfBuying + " for One Ha");
                                    System.out.println("11 - " + pearSeed.name + " " + pearSeed.costOfBuying + " for One Ha");
                                    System.out.println("12 - " + cherrySeed.name + " " + cherrySeed.costOfBuying + " for One Ha");
                                    System.out.println("13 - " + melonSeed.name + " " + melonSeed.costOfBuying + " for One Ha");
                                    System.out.println("14 - " + watermelonSeed.name + " " + watermelonSeed.costOfBuying + " for One Ha");
                                    System.out.println("15 - " + lemonSeed.name + " " + lemonSeed.costOfBuying + " for One Ha");
                                    System.out.println("16 - " + strawberriesSeed.name + " " + strawberriesSeed.costOfBuying + " for One Ha");
                                    System.out.println("---------------------");
                                    System.out.println("0 - Return");

                                    Scanner scannerPlant = new Scanner(System.in);
                                    int choicePlant = scannerPlant.nextInt();


                                    System.out.println("How much you want to buy?");
                                    Scanner scannerBuyAmount = new Scanner(System.in);
                                    int choiceBuyAmount = scannerBuyAmount.nextInt();

                                    switch (choicePlant) {
                                        case 0:
                                            break;
                                        case 1:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), cornSeed, choiceBuyAmount);
                                            break;
                                        case 2:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), carrotSeed, choiceBuyAmount);
                                            break;
                                        case 3:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), sunflowerSeed, choiceBuyAmount);
                                            break;
                                        case 4:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), potatoSeed, choiceBuyAmount);
                                            break;
                                        case 5:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), wheatSeed, choiceBuyAmount);
                                            break;
                                        case 6:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), broccoliSeed, choiceBuyAmount);
                                            break;
                                        case 7:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), onionSeed, choiceBuyAmount);
                                            break;
                                        case 8:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), lettuceSeed, choiceBuyAmount);
                                            break;
                                        case 9:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), tomatoSeed, choiceBuyAmount);
                                            break;
                                        case 10:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), appleSeed, choiceBuyAmount);
                                            break;
                                        case 11:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), pearSeed, choiceBuyAmount);
                                            break;
                                        case 12:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), cherrySeed, choiceBuyAmount);
                                            break;
                                        case 13:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), melonSeed, choiceBuyAmount);
                                            break;
                                        case 14:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), watermelonSeed, choiceBuyAmount);
                                            break;
                                        case 15:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), lemonSeed, choiceBuyAmount);
                                            break;
                                        case 16:
                                            Buyable.buyPlantSeed(Player.playerList.get(whichPlayer), strawberriesSeed, choiceBuyAmount);
                                            break;
                                    }
                                    break;


                                case 5:
                                    System.out.println("---------------------");
                                    System.out.println("Buy Animals");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + cow.name + " " + cow.costOfPurchase + " $");
                                    System.out.println("2 - " + sheep.name + " " + sheep.costOfPurchase + " $");
                                    System.out.println("3 - " + pig.name + " " + pig.costOfPurchase + " $");
                                    System.out.println("4 - " + chicken.name + " " + chicken.costOfPurchase + " $");
                                    System.out.println("5 - " + cat.name + " " + cat.costOfPurchase + " $");
                                    System.out.println("6 - " + dog.name + " " + dog.costOfPurchase + " $");
                                    System.out.println("---------------------");
                                    System.out.println("0 - Return");
                                    System.out.println("---------------------");


                                    Scanner scannerAnimal = new Scanner(System.in);
                                    int choiceAnimal = scannerAnimal.nextInt();

                                    System.out.println("How much you want to buy?");
                                    Scanner scannerAnimalAmount = new Scanner(System.in);
                                    int choiceAnimalAmount = scannerAnimalAmount.nextInt();

                                    switch (choiceAnimal) {
                                        case 1:
                                            Buyable.buyAnimal(Player.playerList.get(whichPlayer), cow, choiceAnimalAmount);
                                            break;
                                        case 2:
                                            Buyable.buyAnimal(Player.playerList.get(whichPlayer), sheep, choiceAnimalAmount);
                                            break;
                                        case 3:
                                            Buyable.buyAnimal(Player.playerList.get(whichPlayer), pig, choiceAnimalAmount);
                                            break;
                                        case 4:
                                            Buyable.buyAnimal(Player.playerList.get(whichPlayer), chicken, choiceAnimalAmount);
                                            break;
                                        case 5:
                                            Buyable.buyAnimal(Player.playerList.get(whichPlayer), dog, choiceAnimalAmount);
                                            break;
                                        case 6:
                                            Buyable.buyAnimal(Player.playerList.get(whichPlayer), cat, choiceAnimalAmount);
                                            break;
                                    }
                                    break;
                                case 6:
                                    System.out.println("---------------------");
                                    System.out.println("Your plants: " + Player.playerList.get(whichPlayer).yourPlants);
                                    System.out.println("---------------------");
                                    System.out.println("Sell Plants");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + cornSeed.name + " " + cornSeed.value_kg + " for One Kg");
                                    System.out.println("2 - " + carrotSeed.name + " " + carrotSeed.value_kg + " for One Kg");
                                    System.out.println("3 - " + sunflowerSeed.name + " " + sunflowerSeed.value_kg + " for One Kg");
                                    System.out.println("4 - " + potatoSeed.name + " " + potatoSeed.value_kg + " for One Kg");
                                    System.out.println("5 - " + wheatSeed.name + " " + wheatSeed.value_kg + " for One Kg");
                                    System.out.println("6 - " + broccoliSeed.name + " " + broccoliSeed.value_kg + " for One Kg");
                                    System.out.println("7 - " + onionSeed.name + " " + onionSeed.value_kg + " for One Kg");
                                    System.out.println("8 - " + lettuceSeed.name + " " + lettuceSeed.value_kg + " for One Kg");
                                    System.out.println("9 - " + tomatoSeed.name + " " + tomatoSeed.value_kg + " for One Kg");
                                    System.out.println("10 - " + appleSeed.name + " " + appleSeed.value_kg + " for One Kg");
                                    System.out.println("11 - " + pearSeed.name + " " + pearSeed.value_kg + " for One Kg");
                                    System.out.println("12 - " + cherrySeed.name + " " + cherrySeed.value_kg + " for One Kg");
                                    System.out.println("13 - " + melonSeed.name + " " + melonSeed.value_kg + " for One Ha");
                                    System.out.println("14 - " + watermelonSeed.name + " " + watermelonSeed.value_kg + "f or One Kg");
                                    System.out.println("15 - " + lemonSeed.name + " " + lemonSeed.value_kg + " for One Kg");
                                    System.out.println("16 - " + strawberriesSeed.name + " " + strawberriesSeed.value_kg + " for One Kg");
                                    System.out.println("---------------------");
                                    System.out.println("0 - Return");
                                    System.out.println("---------------------");

                                    Scanner scannerSellPlant = new Scanner(System.in);
                                    int choiceSellPlant = scannerSellPlant.nextInt();

                                    System.out.println("How much you want to sell?");
                                    Scanner scannerSellAmount = new Scanner(System.in);
                                    int choiceSellAmount = scannerSellAmount.nextInt();

                                    switch (choiceSellPlant) {
                                        case 0:
                                            break;
                                        case 1:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), cornSeed, choiceSellAmount);
                                            break;
                                        case 2:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), carrotSeed, choiceSellAmount);
                                            break;
                                        case 3:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), sunflowerSeed, choiceSellAmount);
                                            break;
                                        case 4:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), potatoSeed, choiceSellAmount);
                                            break;
                                        case 5:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), wheatSeed, choiceSellAmount);
                                            break;
                                        case 6:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), broccoliSeed, choiceSellAmount);
                                            break;
                                        case 7:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), onionSeed, choiceSellAmount);
                                            break;
                                        case 8:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), lettuceSeed, choiceSellAmount);
                                            break;
                                        case 9:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), tomatoSeed, choiceSellAmount);
                                            break;
                                        case 10:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), appleSeed, choiceSellAmount);
                                            break;
                                        case 11:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), pearSeed, choiceSellAmount);
                                            break;
                                        case 12:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), cherrySeed, choiceSellAmount);
                                            break;
                                        case 13:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), melonSeed, choiceSellAmount);
                                            break;
                                        case 14:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), watermelonSeed, choiceSellAmount);
                                            break;
                                        case 15:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), lemonSeed, choiceSellAmount);
                                            break;
                                        case 16:
                                            Saleable.sellPlant(Player.playerList.get(whichPlayer), strawberriesSeed, choiceSellAmount);
                                            break;
                                    }
                                    break;
                                case 7:
                                    System.out.println("---------------------");
                                    System.out.println("Yours animals" + Player.playerList.get(whichPlayer).yourAnimals);
                                    System.out.println("---------------------");
                                    System.out.println("Sell Animals");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + cow.name);
                                    System.out.println("2 - " + sheep.name);
                                    System.out.println("3 - " + pig.name);
                                    System.out.println("4 - " + chicken.name);
                                    System.out.println("5 - " + cat.name);
                                    System.out.println("6 - " + dog.name);
                                    System.out.println("---------------------");
                                    System.out.println("0- Return");

                                    Scanner scannerSellAnimal = new Scanner(System.in);
                                    int choiceSellAnimal = scannerSellAnimal.nextInt();


                                    System.out.println("How much you want to buy?");
                                    Scanner scannerAnimalAmountToSell = new Scanner(System.in);
                                    int choiceAnimalAmountToSell = scannerAnimalAmountToSell.nextInt();

                                    switch (choiceSellAnimal) {
                                        case 0:
                                            break;
                                        case 1:
                                            Saleable.sellAnimal(Player.playerList.get(whichPlayer), cow, choiceAnimalAmountToSell);
                                            break;
                                        case 2:
                                            Saleable.sellAnimal(Player.playerList.get(whichPlayer), sheep, choiceAnimalAmountToSell);
                                            break;
                                        case 3:
                                            Saleable.sellAnimal(Player.playerList.get(whichPlayer), pig, choiceAnimalAmountToSell);
                                            break;
                                        case 4:
                                            Saleable.sellAnimal(Player.playerList.get(whichPlayer), chicken, choiceAnimalAmountToSell);
                                            break;
                                        case 5:
                                            Saleable.sellAnimal(Player.playerList.get(whichPlayer), dog, choiceAnimalAmountToSell);
                                            break;
                                        case 6:
                                            Saleable.sellAnimal(Player.playerList.get(whichPlayer), cat, choiceAnimalAmountToSell);
                                            break;
                                    }
                                    break;
                                case 8:
                                    System.out.println("---------------------");
                                    System.out.println("Sell Field");
                                    System.out.println("---------------------");

                                    System.out.println("You have " + Player.playerList.get(whichPlayer).farm.get(0).fieldsSlots + " from " + Player.playerList.get(whichPlayer).farm.get(0).maxFieldsSlots);
                                    System.out.println("How much you want to sell?");

                                    Scanner scannerField = new Scanner(System.in);
                                    int choiceHowMuchField = scannerField.nextInt();
                                    Saleable.sellField(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0), choiceHowMuchField);

                            }

                        }
                        break;
                        case 2:
                            System.out.println("---------------------");
                            System.out.println("Statistic of yours Farms");
                            System.out.println("---------------------");
                            System.out.println("1 - Your farm");
                            System.out.println("2 - List of your buildings");
                            System.out.println("3 - List of your animals");
                            System.out.println("4 - List of your seeds/saplings");
                            System.out.println("5 - List of your planted plants");
                            System.out.println("6 - List of your plants");
                            System.out.println("7 - Silos status");
                            System.out.println("---------------------");
                            System.out.println("0 - Return");


                            Scanner scannerStatistic = new Scanner(System.in);
                            int choiceStatistic = scannerStatistic.nextInt();

                            switch (choiceStatistic) {
                                case 1:
                                    System.out.println("Your farm:");
                                    System.out.println(Player.playerList.get(whichPlayer).farm);
                                    break;
                                case 2:
                                    System.out.println("List of your buildings:");
                                    System.out.println(Player.playerList.get(whichPlayer).yourBuildings);
                                    break;
                                case 3:
                                    System.out.println("List of your Animals:");
                                    System.out.println(Player.playerList.get(whichPlayer).yourAnimals);
                                    break;
                                case 4:
                                    System.out.println("List of your Seeds:");
                                    System.out.println(Player.playerList.get(whichPlayer).yourSeeds);
                                    break;
                                case 5:
                                    System.out.println("List of your planted Seeds:");
                                    System.out.println(Player.playerList.get(whichPlayer).yourPlantedPlants);
                                    break;
                                case 6:
                                    System.out.println("List of your plants:");
                                    System.out.println(Player.playerList.get(whichPlayer).yourPlants);
                                    break;
                                case 7:
                                    System.out.println("Silos: "+Player.playerList.get(whichPlayer).isSilos);

                                    break;
                            }
                            break;

                        case 3:
                            System.out.println("---------------------");
                            System.out.println("Manage your farms:");
                            System.out.println("---------------------");
                            System.out.println("1 - plant seeds/saplings");
                            System.out.println("2 - harvest ready plants");
                            System.out.println("3 - feed animals");
                            System.out.println("---------------------");
                            System.out.println("0 - Return");


                            Scanner scannerManageFarm = new Scanner(System.in);
                            int choiceManageFarm = scannerManageFarm.nextInt();

                            switch (choiceManageFarm) {
                                case 1:
                                    System.out.println("---------------------");
                                    System.out.println("which plant you want to plant:");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + cornSeed.name);
                                    System.out.println("2 - " + carrotSeed.name);
                                    System.out.println("3 - " + sunflowerSeed.name);
                                    System.out.println("4 - " + potatoSeed.name);
                                    System.out.println("5 - " + wheatSeed.name);
                                    System.out.println("6 - " + broccoliSeed.name);
                                    System.out.println("7 - " + onionSeed.name);
                                    System.out.println("8 - " + lettuceSeed.name);
                                    System.out.println("9 - " + tomatoSeed.name);
                                    System.out.println("10 - " + appleSeed.name);
                                    System.out.println("11 - " + pearSeed.name);
                                    System.out.println("12 - " + cherrySeed.name);
                                    System.out.println("13 - " + melonSeed.name);
                                    System.out.println("14 - " + watermelonSeed.name);
                                    System.out.println("15 - " + lemonSeed.name);
                                    System.out.println("16 - " + strawberriesSeed.name);
                                    System.out.println("---------------------");
                                    System.out.println("0 - Return");
                                    System.out.println("---------------------");

                                    Scanner scannerPlantSeed = new Scanner(System.in);
                                    int choicePlantSeed = scannerPlantSeed.nextInt();

                                    System.out.println("How much you want to plant?");
                                    Scanner scannerAmountToPlant = new Scanner(System.in);
                                    int choiceAmountToPlant = scannerAmountToPlant.nextInt();

                                    switch (choicePlantSeed) {
                                        case 1:
                                            Plant.plant(Player.playerList.get(whichPlayer), cornSeed, choiceAmountToPlant);
                                            break;
                                        case 2:
                                            Plant.plant(Player.playerList.get(whichPlayer), carrotSeed, choiceAmountToPlant);
                                            break;
                                        case 3:
                                            Plant.plant(Player.playerList.get(whichPlayer), sunflowerSeed, choiceAmountToPlant);
                                            break;
                                        case 4:
                                            Plant.plant(Player.playerList.get(whichPlayer), potatoSeed, choiceAmountToPlant);
                                            break;
                                        case 5:
                                            Plant.plant(Player.playerList.get(whichPlayer), wheatSeed, choiceAmountToPlant);
                                            break;
                                        case 6:
                                            Plant.plant(Player.playerList.get(whichPlayer), broccoliSeed, choiceAmountToPlant);
                                            break;
                                        case 7:
                                            Plant.plant(Player.playerList.get(whichPlayer), onionSeed, choiceAmountToPlant);
                                            break;
                                        case 8:
                                            Plant.plant(Player.playerList.get(whichPlayer), lettuceSeed, choiceAmountToPlant);
                                            break;
                                        case 9:
                                            Plant.plant(Player.playerList.get(whichPlayer), tomatoSeed, choiceAmountToPlant);
                                            break;
                                        case 10:
                                            Plant.plant(Player.playerList.get(whichPlayer), appleSeed, choiceAmountToPlant);
                                            break;
                                        case 11:
                                            Plant.plant(Player.playerList.get(whichPlayer), pearSeed, choiceAmountToPlant);
                                            break;
                                        case 12:
                                            Plant.plant(Player.playerList.get(whichPlayer), cherrySeed, choiceAmountToPlant);
                                            break;
                                        case 13:
                                            Plant.plant(Player.playerList.get(whichPlayer), melonSeed, choiceAmountToPlant);
                                            break;
                                        case 14:
                                            Plant.plant(Player.playerList.get(whichPlayer), watermelonSeed, choiceAmountToPlant);
                                            break;
                                        case 15:
                                            Plant.plant(Player.playerList.get(whichPlayer), lemonSeed, choiceAmountToPlant);
                                            break;
                                        case 16:
                                            Plant.plant(Player.playerList.get(whichPlayer), strawberriesSeed, choiceAmountToPlant);
                                            break;
                                    }
                                    break;
                                case 2:
                                    Plant.harvest(Player.playerList.get(whichPlayer));
                                    break;
                                case 3:
                                    Animal.feed(Player.playerList.get(whichPlayer));
                                    break;
                            }
                    }
                }
                while (choiceMenu < 4);
                if (choiceMenu < 4) {
                    break;
                }

                /* Thinks that happened independently from player decision */
                Player.isCash(Player.playerList.get(whichPlayer));
                Plant.growingProcess(Player.playerList.get(whichPlayer));
                Plant.protectFromParasite(Player.playerList.get(whichPlayer));
                World.disasters(Player.playerList.get(whichPlayer), week);
                Animal.growingProcess(Player.playerList.get(whichPlayer));
                Animal.reproduction(Player.playerList.get(whichPlayer));
                Animal.productionItem(Player.playerList.get(whichPlayer));
                Animal.feed(Player.playerList.get(whichPlayer));

                /*GOAL*/
                if (Player.playerList.get(whichPlayer).farm.get(0).name.equals(ultimateFarm.name) && Player.playerList.get(whichPlayer).getCash() >= 1000000.0) {
                    System.out.println("Player:" + Player.playerList.get(whichPlayer).getName() + " win the game!!!");
                    System.exit(0);
                }
            }

            if (week == 52) {
                week = 0;
                year++;
            }
        }
    }


}