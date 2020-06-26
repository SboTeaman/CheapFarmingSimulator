package com.company;

import Animals.Animal;
import Buildings.*;
import Interfaces.Buyable;
import Interfaces.RandomNumberGenerator;
import Interfaces.Saleable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Player.newPlayer();

        /*PLANTS*/



        /*PLANTS SEEDS */

        Plant cornSeed = new Plant("cornSeed", 2.0, 1, 200, 5, 0.25, 5, "corn");
        Plant carrotSeed = new Plant("carrotSeed", 3.0, 1, 210, 3, 0.3, 4, "carrot");
        Plant sunflowerSeed = new Plant("sunflowerSeed", 2.0, 1, 200, 5, 0.25, 5, "sunflower");
        Plant potatoSeed = new Plant("potatoSeed", 3.0, 8, 210, 3, 0.3, 4, "potato");
        Plant wheatSeed = new Plant("wheatSeed", 3.0, 8, 210, 3, 0.3, 4, "wheat");
        Plant broccoliSeed = new Plant("broccoliSeed", 3.0, 8, 210, 3, 0.3, 4, "broccoli");
        Plant onionSeed = new Plant("onionSeed", 2.0, 5, 200, 5, 0.25, 5, "onion");
        Plant lettuceSeed = new Plant("lettuceSeed", 2.0, 5, 200, 5, 0.25, 5, "lettuce");
        Plant tomatoSeed = new Plant("tomatoSeed", 3.0, 8, 210, 3, 0.3, 4, "tomato");

        Plant appleSeed = new Plant("appleSeed", 3.0, 8, 210, 3, 0.3, 4, "apple");
        Plant pearSeed = new Plant("pearSeed", 2.0, 5, 200, 5, 0.25, 5, "pear");
        Plant cherrySeed = new Plant("cherrySeed", 2.0, 5, 200, 5, 0.25, 5, "cherry");
        Plant melonSeed = new Plant("melonSeed", 3.0, 8, 210, 3, 0.3, 4, "melon");
        Plant watermelonSeed = new Plant("watermelonSeed", 2.0, 5, 200, 5, 0.25, 5, "watermelon");
        Plant lemonSeed = new Plant("lemonSeed", 2.0, 5, 200, 5, 0.25, 5, "lemon");
        Plant strawberriesSeed = new Plant("strawberriesSeed", 2.0, 5, 200, 5, 0.25, 5, "strawberries");

        /*ANIMALS */
        Animal cow = new Animal("cow", 100.0, 10.0, 10.0, 2.0, 2.0, "corn", 2.0, "milk", "Cowshed");
        Animal sheep = new Animal("sheep", 100.0, 10.0, 10.0, 2.0, 2.0, "cornSeed", 2.0, "wool", "Stable");
        Animal pig = new Animal("pig", 100.0, 10.0, 10.0, 2.0, 2.0, "cornSeed", 2.0, null, "Pigsty");
        Animal chicken = new Animal("chicken", 100.0, 10.0, 10.0, 2.0, 2.0, "cornSeed", 2.0, "egg", "Chickencoop");
        Animal dog = new Animal("dog", 100.0, 10.0, 10.0, 2.0, 2.0, "cornSeed", 2.0);
        Animal cat = new Animal("cat", 100.0, 10.0, 10.0, 2.0, 2.0, "cornSeed", 2.0);

        /*FARMS */
        Farm oldFarm = new Farm("Old Farm", RandomNumberGenerator.randomBetween(100, 900), RandomNumberGenerator.randomBetween(1, 2), 10, 1, 0);
        Farm startedFarm = new Farm("startedFarm", RandomNumberGenerator.randomBetween(900, 3000), RandomNumberGenerator.randomBetween(3, 4), 20, RandomNumberGenerator.randomBetween(2, 3), 1);
        Farm advancedFarm = new Farm("advancedFarm", RandomNumberGenerator.randomBetween(5000, 8000), RandomNumberGenerator.randomBetween(4, 5), 30, RandomNumberGenerator.randomBetween(3, 4), 2);
        Farm highTierFarm = new Farm("highTierFarm", RandomNumberGenerator.randomBetween(10000, 15000), RandomNumberGenerator.randomBetween(6, 7), 40, RandomNumberGenerator.randomBetween(5, 6), 3);
        Farm ultimateFarm = new Farm("ultimateFarm", RandomNumberGenerator.randomBetween(20000, 30000), RandomNumberGenerator.randomBetween(7, 10), 50, RandomNumberGenerator.randomBetween(7, 10), 5);

        /*BUILDINGS */
        Building smallCowshed = new Cowshed("smallCowshed", 1000.0, 2.0, 3, "Cowshed");
        Building smallPigsty = new Pigsty("smallPigsty", 1000.0, 2.0, 3, "Pigsty");
        Building smallStable = new Stable("smallStable", 1000.0, 2.0, 3, "Stable");
        Building smallChickencoop = new Chickencoop("smallChickencoop", 1000.0, 1.0, 10, "Chickencoop");

        Building mediumCowshed = new Cowshed("smallCowshed", 1000.0, 2.0, 3, "Cowshed");
        Building mediumPigsty = new Pigsty("smallPigsty", 1000.0, 2.0, 3, "Pigsty");
        Building mediumStable = new Stable("smallStable", 1000.0, 2.0, 3, "Stable");
        Building mediumChickencoop = new Chickencoop("mediumChickencoop", 1000.0, 1.0, 10, "Chickencoop");

        Building bigCowshed = new Cowshed("smallCowshed", 1000.0, 2.0, 3, "Cowshed");
        Building bigPigsty = new Pigsty("smallPigsty", 1000.0, 2.0, 3, "Pigsty");
        Building bigStable = new Stable("smallStable", 1000.0, 2.0, 3, "Stable");
        Building bigChickencoop = new Chickencoop("bigChickencoop", 1000.0, 1.0, 10, "Chickencoop");

        Building silos = new Silos("silos", 1000.0);

        int choiceMenu;
        int week;
        int year = 2020;
        for (week = 1; week > 0; week++) {

            System.out.println("Year: " + year + " Week:" + week);
            for (int whichPlayer = 0; whichPlayer < Player.playerList.size(); whichPlayer++) {
                do {
                    System.out.println("\n\n");
                    System.out.println("Turn:" + Player.playerList.get(whichPlayer).toString());
                    System.out.println("MENU");
                    System.out.println("---------------------");
                    System.out.println("1 - SHOP ");
                    System.out.println("2 - Statistic of yours Farms");
                    System.out.println("3 - Manage your farms:");
                    System.out.println("---------------------");
                    System.out.println("4 - end a week");


                    Scanner scannerMenu = new Scanner(System.in);
                    choiceMenu = scannerMenu.nextInt();
                    System.out.println(choiceMenu);
                    switch (choiceMenu) {
                        case 1: {
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
                            System.out.println("---------------------");
                            System.out.println("8 - return");

                            Scanner scannerFarm = new Scanner(System.in);
                            int choiceShop = scannerFarm.nextInt();

                            switch (choiceShop) {
                                case 1:
                                    System.out.println("Buy new Farm");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + oldFarm.toString());
                                    System.out.println("2 - " + startedFarm.toString());
                                    System.out.println("3 - " + advancedFarm.toString());
                                    System.out.println("4 - " + highTierFarm.toString());
                                    System.out.println("5 - " + ultimateFarm.toString());
                                    System.out.println("---------------------");
                                    System.out.println("6 - return");

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

                                    Scanner scannerPurchaseBuilding = new Scanner(System.in);
                                    int choicePurchaseBuilding = scannerPurchaseBuilding.nextInt();

                                    switch (choicePurchaseBuilding) {
                                        case 1:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), smallCowshed);
                                            break;
                                        case 2:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), smallPigsty);
                                            break;
                                        case 3:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), smallStable);
                                            break;
                                        case 4:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), smallChickencoop);
                                            break;
                                        case 5:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), mediumCowshed);
                                            break;
                                        case 6:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), mediumPigsty);
                                            break;
                                        case 7:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), mediumStable);
                                            break;
                                        case 8:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), mediumChickencoop);
                                            break;
                                        case 9:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), bigCowshed);
                                            break;
                                        case 10:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), bigPigsty);
                                            break;
                                        case 11:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), bigStable);
                                            break;
                                        case 12:
                                            Buyable.buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), bigChickencoop);
                                            break;
                                        case 13:
                                            Buyable.buySilos(Player.playerList.get(whichPlayer), silos);
                                            break;
                                    }
                                    break;
                                case 3: {
                                    System.out.println("Buy more field");
                                    System.out.println("You have " + Player.playerList.get(whichPlayer).getFarm().fieldsSlots + " from " + Player.playerList.get(whichPlayer).getFarm().maxFieldsSlots);

                                    Scanner scannerField = new Scanner(System.in);
                                    int choiceHowMuchField = scannerField.nextInt();
                                    Buyable.buyMoreField(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).getFarm(), choiceHowMuchField);

                                    break;
                                }
                                case 4:
                                    System.out.println("Buy Plants");
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

                                    Scanner scannerPlant = new Scanner(System.in);
                                    int choicePlant = scannerFarm.nextInt();

                                    System.out.println("How much you want to buy?");
                                    Scanner scannerBuyAmount = new Scanner(System.in);
                                    int choiceBuyAmount = scannerBuyAmount.nextInt();

                                    switch (choicePlant) {

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
                                    System.out.println("Buy Animals");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + cow.name);
                                    System.out.println("2 - " + sheep.name);
                                    System.out.println("3 - " + pig.name);
                                    System.out.println("4 - " + chicken.name);
                                    System.out.println("5 - " + cat.name);
                                    System.out.println("6 - " + dog.name);


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
                                    System.out.println(Player.playerList.get(whichPlayer).yourPlants);
                                    System.out.println("---------------------");
                                    System.out.println("Sell Plants");
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

                                    Scanner scannerSellPlant = new Scanner(System.in);
                                    int choiceSellPlant = scannerSellPlant.nextInt();

                                    System.out.println("How much you want to buy?");
                                    Scanner scannerSellAmount = new Scanner(System.in);
                                    int choiceSellAmount = scannerSellAmount.nextInt();

                                    switch (choiceSellPlant) {

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
                                    System.out.println("Sell Animals");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + cow.name);
                                    System.out.println("2 - " + sheep.name);
                                    System.out.println("3 - " + pig.name);
                                    System.out.println("4 - " + chicken.name);
                                    System.out.println("5 - " + cat.name);
                                    System.out.println("6 - " + dog.name);

                                    Scanner scannerSellAnimal = new Scanner(System.in);
                                    int choiceSellAnimal = scannerSellAnimal.nextInt();

                                    System.out.println("How much you want to buy?");
                                    Scanner scannerAnimalAmountToSell = new Scanner(System.in);
                                    int choiceAnimalAmountToSell = scannerAnimalAmountToSell.nextInt();

                                    switch (choiceSellAnimal) {
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
                            }

                        }
                        break;
                        case 2:
                            System.out.println("Statistic of yours Farms");
                            System.out.println("---------------------");
                            System.out.println("1 - Your farm");
                            System.out.println("2 - List of your buildings");
                            System.out.println("3 - List of your animals");
                            System.out.println("4 - List of your seeds/saplings");
                            System.out.println("5 - List of your planted plants");
                            System.out.println("6 - List of your plants");
                            System.out.println("---------------------");
                            System.out.println("6 - return");

                            Scanner scannerStatistic = new Scanner(System.in);
                            int choiceStatistic = scannerStatistic.nextInt();

                            switch (choiceStatistic) {
                                case 1:
                                    System.out.println("Your farm:");
                                    System.out.println(Player.playerList.get(whichPlayer).getFarm());
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
                            }
                            break;

                        case 3:
                            System.out.println("Manage your farms:");
                            System.out.println("---------------------");
                            System.out.println("1 - plant seeds/saplings");
                            System.out.println("2 - harvest ready plants");
                            System.out.println("3 - feed animals");
                            System.out.println("---------------------");
                            System.out.println("4 - return");

                            Scanner scannerManageFarm = new Scanner(System.in);
                            int choiceManageFarm = scannerManageFarm.nextInt();

                            switch (choiceManageFarm) {
                                case 1:
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
                                case 2:
                                    Plant.harvest(Player.playerList.get(whichPlayer)); //
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
                Plant.growingProcess(Player.playerList.get(whichPlayer));
                Plant.protectFromParasite(Player.playerList.get(whichPlayer));
                World.disasters(Player.playerList.get(whichPlayer), week);
                Animal.growingProcess(Player.playerList.get(whichPlayer));
                Animal.reproduction(Player.playerList.get(whichPlayer));
                Animal.productionItem(Player.playerList.get(whichPlayer));
                Animal.feed(Player.playerList.get(whichPlayer));

                if (Player.playerList.get(whichPlayer).getFarm().equals(ultimateFarm) && Player.playerList.get(whichPlayer).cash == 1000000.0) {
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