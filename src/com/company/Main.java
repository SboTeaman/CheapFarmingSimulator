package com.company;

import Animals.Animals;
import Buildings.Buildings;
import Buildings.Cowshed;
import Buildings.Pigsty;
import Buildings.Stable;
import Buildings.Silos;
import Buildings.Farms;
import Interfaces.Buyable;
import Interfaces.RandomNumberGenerator;
import Interfaces.Saleable;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*PLANTS*/
        Plants corn = new Plants("corn", 2.0, 0.5, 200, 5, 0.25, 5);


        /*PLANTS SEEDS */

        Plants cornSeed = new Plants("cornSeed", 2.0, 0.5, 200, 5, 0.25, 5);
        Plants carrotSeed = new Plants("carrotSeed", 3.0, 0.8, 210, 3, 0.3, 4);
//        Plants sunflowerSeed = new Plants("sunflowerSeed", 2.0, 0.5, 200, 5.0, 0.25, 5);
//        Plants oliveSeed = new Plants("oliveSeed", 3.0, 0.8, 210, 3.0, 0.3, 4);
//        Plants rapeseedSeed = new Plants("rapeseedSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants potatoSeed = new Plants("potatoSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//        Plants ryeSeed = new Plants("ryeSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants wheatSeed = new Plants("wheatSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//        Plants riceSeed = new Plants("riceSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//        Plants oatsSeed = new Plants("oatsSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants broccoliSeed = new Plants("broccoliSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//        Plants cauliflowerSeed = new Plants("cauliflowerSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants onionSeed = new Plants("onionSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants chiveSeed = new Plants("chiveSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//        Plants garlicSeed = new Plants("garlicSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants arugulaSeed = new Plants("arugulaSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//        Plants lettuceSeed = new Plants("lettuceSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants tomatoSeed = new Plants("tomatoSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//
//        Plants appleSeed = new Plants("appleSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//        Plants pearSeed = new Plants("pearSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants plumSeed = new Plants("plumSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//        Plants cherrySeed = new Plants("cherrySeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants melonSeed = new Plants("melonSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//        Plants watermelonSeed = new Plants("watermelonSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants lemonSeed = new Plants("lemonSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);
//        Plants raspberriesSeed = new Plants("raspberriesSeed", 3.0, 0.8, 210, 3.0, 0.3, 4.0);
//        Plants strawberriesSeed = new Plants("strawberriesSeed", 2.0, 0.5, 200, 5.0, 0.25, 5.0);

        /*ANIMALS */
        Animals cow = new Animals("cow", 100.0, 10.0, 2.0, 2.0, "corn", 2.0);
        Animals sheep = new Animals("sheep", 100.0, 10.0, 2.0, 2.0, "cornSeed", 2.0);
        Animals pig = new Animals("pig", 100.0, 10.0, 2.0, 2.0, "cornSeed", 2.0);
        Animals chicken = new Animals("chicken", 100.0, 10.0, 2.0, 2.0, "cornSeed", 2.0);
        Animals dog = new Animals("dog", 100.0, 10.0, 2.0, 2.0, "cornSeed", 2.0);
        Animals cat = new Animals("cat", 100.0, 10.0, 2.0, 2.0, "cornSeed", 2.0);

        /*FARMS */
        Farms oldFarm = new Farms("Old Farm", RandomNumberGenerator.randomBetween(100, 900), RandomNumberGenerator.randomBetween(1, 2), 10.0, 1, 0);
        Farms startedFarm = new Farms("startedFarm", RandomNumberGenerator.randomBetween(900, 3000), RandomNumberGenerator.randomBetween(3, 4), 20.0, RandomNumberGenerator.randomBetween(2, 3), 1);
        Farms advancedFarm = new Farms("advancedFarm", RandomNumberGenerator.randomBetween(5000, 8000), RandomNumberGenerator.randomBetween(4, 5), 30.0, RandomNumberGenerator.randomBetween(3, 4), 2);
        Farms highTierFarm = new Farms("highTierFarm", RandomNumberGenerator.randomBetween(10000, 15000), RandomNumberGenerator.randomBetween(6, 7), 40.0, RandomNumberGenerator.randomBetween(5, 6), 3);
        Farms ultimateFarm = new Farms("ultimateFarm", RandomNumberGenerator.randomBetween(20000, 30000), RandomNumberGenerator.randomBetween(7, 10), 50.0, RandomNumberGenerator.randomBetween(7, 10), 5);

        /*BUILDINGS */
        Buildings smallCowshed = new Cowshed("smallCowshed", 1000.0, 2.0, 3);
        Buildings smallPigsty = new Pigsty("smallPigsty", 1000.0, 2.0, 3);
        Buildings smallStable = new Stable("smallStable", 1000.0, 2.0, 3);
        Buildings silos = new Silos("silos", 1000.0);


        Players firstPlayer = new Players("me");
        Players secondPlayer = new Players("Not_me");



/*
        int choiceMenu;
        for (int i = 1; i > 0; i++) {
            System.out.println("Week:" + i);
            do {
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
                    case 1:
                        System.out.println("Welcome in the Shop");
                        System.out.println("---------------------");
                        System.out.println("1 - Buy new Farm");
                        //System.out.println("2 - Buy new Buildings"); ;// add this to manage your farm
                        //System.out.println("3 - Buy more field");// add this to manage your farm
                        System.out.println("3 - Buy Plants");
                        System.out.println("4 - Buy Animals");
                        System.out.println("---------------------");
                        System.out.println("5 - return");

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
                                        firstPlayer.buyFarm(oldFarm);
                                        break;
                                    case 2:
                                        firstPlayer.buyFarm(startedFarm);
                                        break;
                                    case 3:
                                        firstPlayer.buyFarm(advancedFarm);
                                        break;
                                    case 4:
                                        firstPlayer.buyFarm(highTierFarm);
                                        break;
                                    case 5:
                                        firstPlayer.buyFarm(ultimateFarm);
                                        break;
                                }

                                break;
                            case 2:
                                System.out.println(" Buy new Buildings");
                                System.out.println("---------------------");
                                System.out.println("1 - " + smallCowshed.toString());
                                System.out.println("2 - " + smallPigsty.toString());
                                System.out.println("3 - " + smallStable.toString());
                                System.out.println("---------------------");
                                System.out.println("6 - return");

                                Scanner scannerPurchaseBuilding = new Scanner(System.in);
                                int choicePurchaseBuilding = scannerPurchaseBuilding.nextInt();

                                switch (choicePurchaseBuilding) {
                                    case 1:
                                        firstPlayer.buyBuildings(oldFarm,smallCowshed); // some improvement needed
                                    case 2:
                                    case 3:
                                }

                                break;
                            case 3:
                                System.out.println("Buy Plants");
                                System.out.println("---------------------");
                                System.out.println("1 - " + cornSeed.toString());
                                System.out.println("2 - " + carrotSeed.toString());

                                Scanner scannerPlant = new Scanner(System.in);
                                int choicePlant = scannerFarm.nextInt();

                                switch (choicePlant) {
                                    case 1:
                                        System.out.println("How much corn you want to buy?");
                                        Scanner scannerAmount = new Scanner(System.in);
                                        int choiceAmount = scannerFarm.nextInt();
                                        Buyable.buyPlantSeed(firstPlayer,cornSeed, choiceAmount);
                                }
                        }

                        break;
                    case 2:
                        System.out.println("Statistic of yours Farms");
                        System.out.println("---------------------");
                        System.out.println("1 - List of your farms");
                        System.out.println("2 - List of your buildings");
                        System.out.println("3 - List of your animals");
                        System.out.println("4 - List of your seeds/saplings");
                        System.out.println("5 - List of your plants");
                        System.out.println("6 - List of your inventory");
                        System.out.println("---------------------");
                        System.out.println("7 - return");

                        Scanner scannerStatistic = new Scanner(System.in);
                        int choiceStatistic = scannerStatistic.nextInt();

                        switch (choiceStatistic) {
                            case 1:
                                System.out.println("List of your farms:");
                                break;
                            case 2:
                                System.out.println("List of your buildings:");
                                System.out.println(firstPlayer.yourBuildings);
                                break;
                            case 3:
                                System.out.println("List of your Animals:");
                                System.out.println(firstPlayer.yourAnimals);
                                break;
                            case 4:
                                System.out.println("List of your Seeds:");
                                System.out.println(firstPlayer.yourSeeds);
                                break;

                        }

                        break;
                    case 3:
                        System.out.println("Manage your farms:");
                        System.out.println("1 - Buy new Buildings");
                        System.out.println("2 - plant seeds/saplings");
                        System.out.println("3 - harvest ready plants");
                        System.out.println("4 - feed animals");
                        System.out.println("---------------------");
                        System.out.println("5 - return");

                        break;

                }
            } while (choiceMenu < 4);
        }


 */ // MENU!!! DO NOT REMOVE THIS!!!


        Buyable.buyPlantSeed(firstPlayer, cornSeed, 10);
        Buyable.buyPlantSeed(firstPlayer, carrotSeed, 10);


        //Saleable.sellPlantSeed(firstPlayer, carrotSeed, 5);


        firstPlayer.buyFarm(oldFarm);
        //Buyable.buySilos(firstPlayer, silos);
        System.out.println(firstPlayer.isSilos);
        firstPlayer.buyMoreField(oldFarm, 10.0);

        System.out.println(firstPlayer.yourSeeds);

        Plants.plant(firstPlayer, carrotSeed, 9);

        System.out.println(firstPlayer.yourSeeds);
        System.out.println(firstPlayer.yourPlantedPlants);
        Plants.growingProcess(firstPlayer);
        Plants.growingProcess(firstPlayer);
        Plants.growingProcess(firstPlayer);
        Plants.growingProcess(firstPlayer);
        System.out.println(firstPlayer.cash);
        Plants.harvest(firstPlayer, carrotSeed);
        System.out.println(firstPlayer.cash);
        System.out.println(firstPlayer.yourPlants);

        Saleable.sellPlantSeed(firstPlayer, carrotSeed, 100);

        Buyable.buyAnimal(firstPlayer, cow, 1);
        Buyable.buyAnimal(firstPlayer, cow, 1);
        Buyable.buyAnimal(firstPlayer, sheep, 1);
        Buyable.buyAnimal(firstPlayer, sheep, 1);
        Buyable.buyAnimal(firstPlayer, cow, 1);
        Buyable.buyAnimal(firstPlayer, cow, 1);
        System.out.println(firstPlayer.yourAnimals);

        Saleable.sellAnimal(firstPlayer, cow, 1);
        Saleable.sellAnimal(firstPlayer, cow, 1);
        Saleable.sellAnimal(firstPlayer, cow, 1);
        Saleable.sellAnimal(firstPlayer, cow, 1);
        Saleable.sellAnimal(firstPlayer, sheep, 100);
        Saleable.sellAnimal(firstPlayer, sheep, 1);
        Saleable.sellAnimal(firstPlayer, sheep, 1);


        System.out.println(firstPlayer.yourAnimals);

    }

}