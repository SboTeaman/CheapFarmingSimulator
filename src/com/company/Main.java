package com.company;

import Animals.Animal;
import Buildings.Building;
import Buildings.Cowshed;
import Buildings.Pigsty;
import Buildings.Stable;
import Buildings.Silos;
import Buildings.Farm;
import Interfaces.Buyable;
import Interfaces.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Player> playerList = new ArrayList<>();


    public static void main(String[] args) {

        newPlayer();

        /*PLANTS*/



        /*PLANTS SEEDS */

        Plant cornSeed = new Plant("cornSeed", 2.0, 1, 200, 5, 0.25, 5);
        Plant carrotSeed = new Plant("carrotSeed", 3.0, 1, 210, 3, 0.3, 4);
        Plant sunflowerSeed = new Plant("sunflowerSeed", 2.0, 1, 200, 5, 0.25, 5);
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
        Animal cow = new Animal("cow", 100.0, 10.0, 10.0, 2.0, 2.0, "corn", 2.0, "milk");
        Animal sheep = new Animal("sheep", 100.0, 10.0, 10.0, 2.0, 2.0, "cornSeed", 2.0, "wool");
        Animal pig = new Animal("pig", 100.0, 10.0, 10.0, 2.0, 2.0, "cornSeed", 2.0);
        Animal chicken = new Animal("chicken", 100.0, 10.0, 10.0, 2.0, 2.0, "cornSeed", 2.0, "egg");
        Animal dog = new Animal("dog", 100.0, 10.0, 10.0, 2.0, 2.0, "cornSeed", 2.0);
        Animal cat = new Animal("cat", 100.0, 10.0, 10.0, 2.0, 2.0, "cornSeed", 2.0);

        /*FARMS */
        Farm oldFarm = new Farm("Old Farm", RandomNumberGenerator.randomBetween(100, 900), RandomNumberGenerator.randomBetween(1, 2), 10.0, 1, 0);
        Farm startedFarm = new Farm("startedFarm", RandomNumberGenerator.randomBetween(900, 3000), RandomNumberGenerator.randomBetween(3, 4), 20.0, RandomNumberGenerator.randomBetween(2, 3), 1);
        Farm advancedFarm = new Farm("advancedFarm", RandomNumberGenerator.randomBetween(5000, 8000), RandomNumberGenerator.randomBetween(4, 5), 30.0, RandomNumberGenerator.randomBetween(3, 4), 2);
        Farm highTierFarm = new Farm("highTierFarm", RandomNumberGenerator.randomBetween(10000, 15000), RandomNumberGenerator.randomBetween(6, 7), 40.0, RandomNumberGenerator.randomBetween(5, 6), 3);
        Farm ultimateFarm = new Farm("ultimateFarm", RandomNumberGenerator.randomBetween(20000, 30000), RandomNumberGenerator.randomBetween(7, 10), 50.0, RandomNumberGenerator.randomBetween(7, 10), 5);

        /*BUILDINGS */
        Building smallCowshed = new Cowshed("smallCowshed", 1000.0, 2.0, 3);
        Building smallPigsty = new Pigsty("smallPigsty", 1000.0, 2.0, 3);
        Building smallStable = new Stable("smallStable", 1000.0, 2.0, 3);

        Building mediumCowshed = new Cowshed("smallCowshed", 1000.0, 2.0, 3);
        Building mediumPigsty = new Pigsty("smallPigsty", 1000.0, 2.0, 3);
        Building mediumStable = new Stable("smallStable", 1000.0, 2.0, 3);

        Building bigCowshed = new Cowshed("smallCowshed", 1000.0, 2.0, 3);
        Building bigPigsty = new Pigsty("smallPigsty", 1000.0, 2.0, 3);
        Building bigStable = new Stable("smallStable", 1000.0, 2.0, 3);

        Building silos = new Silos("silos", 1000.0);


        Player firstPlayer = new Player("me", 1000.0);
        Player secondPlayer = new Player("Not_me", 1000);

        int choiceMenu;
        int week;
        for (week = 1; week > 0; week++) {

            System.out.println("Week:" + week);
            for (int whichPlayer = 0; whichPlayer < playerList.size(); whichPlayer++) {
                do {
                    System.out.println("\n\n");
                    System.out.println("Turn:" + playerList.get(whichPlayer).toString());
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
                            System.out.println("2 - Buy new Buildings");
                            System.out.println("3 - Buy more field");
                            System.out.println("4 - Buy Plants");
                            System.out.println("5 - Buy Animals");
                            System.out.println("---------------------");
                            System.out.println("6 - return");

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
                                            Buyable.buyFarm(playerList.get(whichPlayer), oldFarm);
                                            break;
                                        case 2:
                                            Buyable.buyFarm(playerList.get(whichPlayer), startedFarm);
                                            break;
                                        case 3:
                                            Buyable.buyFarm(playerList.get(whichPlayer), advancedFarm);
                                            break;
                                        case 4:
                                            Buyable.buyFarm(playerList.get(whichPlayer), highTierFarm);
                                            break;
                                        case 5:
                                            Buyable.buyFarm(playerList.get(whichPlayer), ultimateFarm);
                                            break;
                                    }
                                    break;
                                case 2:
                                    System.out.println(" Buy new Buildings");
                                    System.out.println("---------------------");
                                    System.out.println("1 - " + smallCowshed.toString());
                                    System.out.println("2 - " + smallPigsty.toString());
                                    System.out.println("3 - " + smallStable.toString());
                                    System.out.println("4 - " + mediumCowshed.toString());
                                    System.out.println("5 - " + mediumPigsty.toString());
                                    System.out.println("6 - " + mediumStable.toString());
                                    System.out.println("7 - " + bigCowshed.toString());
                                    System.out.println("8 - " + bigPigsty.toString());
                                    System.out.println("9 - " + bigStable.toString());
                                    System.out.println("10 - " + silos.toString());
                                    System.out.println("---------------------");
                                    System.out.println("0 - return");

                                    Scanner scannerPurchaseBuilding = new Scanner(System.in);
                                    int choicePurchaseBuilding = scannerPurchaseBuilding.nextInt();

                                    switch (choicePurchaseBuilding) {
                                        case 1:
                                            Buyable.buyBuildings(playerList.get(whichPlayer), playerList.get(whichPlayer).getFarm(), smallCowshed);
                                        case 2:
                                            Buyable.buyBuildings(playerList.get(whichPlayer), playerList.get(whichPlayer).getFarm(), smallPigsty);
                                        case 3:
                                            Buyable.buyBuildings(playerList.get(whichPlayer), playerList.get(whichPlayer).getFarm(), smallStable);
                                        case 4:
                                            Buyable.buyBuildings(playerList.get(whichPlayer), playerList.get(whichPlayer).getFarm(), mediumCowshed);
                                        case 5:
                                            Buyable.buyBuildings(playerList.get(whichPlayer), playerList.get(whichPlayer).getFarm(), mediumPigsty);
                                        case 6:
                                            Buyable.buyBuildings(playerList.get(whichPlayer), playerList.get(whichPlayer).getFarm(), mediumStable);
                                        case 7:
                                            Buyable.buyBuildings(playerList.get(whichPlayer), playerList.get(whichPlayer).getFarm(), bigCowshed);
                                        case 8:
                                            Buyable.buyBuildings(playerList.get(whichPlayer), playerList.get(whichPlayer).getFarm(), bigPigsty);
                                        case 9:
                                            Buyable.buyBuildings(playerList.get(whichPlayer), playerList.get(whichPlayer).getFarm(), bigStable);
                                        case 10:
                                            Buyable.buySilos(playerList.get(whichPlayer), silos); //check later!

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
                                            Buyable.buyPlantSeed(playerList.get(whichPlayer), cornSeed, choiceAmount);
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
                            System.out.println("5 - List of your plants");
                            System.out.println("6 - List of your inventory");
                            System.out.println("---------------------");
                            System.out.println("7 - return");

                            Scanner scannerStatistic = new Scanner(System.in);
                            int choiceStatistic = scannerStatistic.nextInt();

                            switch (choiceStatistic) {
                                case 1:
                                    System.out.println("Your farm:");
                                    System.out.println(playerList.get(whichPlayer).getFarm());
                                    break;
                                case 2:
                                    System.out.println("List of your buildings:");
                                    System.out.println(playerList.get(whichPlayer).yourBuildings);
                                    break;
                                case 3:
                                    System.out.println("List of your Animals:");
                                    System.out.println(playerList.get(whichPlayer).yourAnimals);
                                    break;
                                case 4:
                                    System.out.println("List of your Seeds:");
                                    System.out.println(playerList.get(whichPlayer).yourSeeds);
                                    break;
                                case 5:
                                    System.out.println("List of your planted Seeds:");
                                    System.out.println(playerList.get(whichPlayer).yourPlantedPlants);
                                    break;
                                case 6:
                                    System.out.println("List of your plants:");
                                    System.out.println(playerList.get(whichPlayer).yourPlants);
                                    break;


                            }

                            break;
                        case 3:
                            System.out.println("Manage your farms:");
                            System.out.println("---------------------");
                            System.out.println("3 - plant seeds/saplings");
                            System.out.println("4 - harvest ready plants");
                            System.out.println("5 - feed animals");
                            System.out.println("---------------------");
                            System.out.println("6 - return");

                            Scanner scannerManageFarm = new Scanner(System.in);
                            int choiceManageFarm = scannerManageFarm.nextInt();

                            switch (choiceManageFarm) {
                                case 1:
                                    System.out.println("which plant you want to plant:");
                                    break;
                                case 2:
                                    Plant.harvest(playerList.get(whichPlayer), carrotSeed);

                                    break;

                            }
                    }
                }
                while (choiceMenu < 4);
                if (choiceMenu < 4) {
                    break;
                }
            }
        }


// */ // MENU!!! DO NOT REMOVE THIS!!!


    }


    public static void newPlayer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type how many player:");
        int howManyPlayer = scan.nextInt();
        if (playerList.isEmpty()) {
            for (int i = 0; i < howManyPlayer; i++) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Type a name:");
                String name = scanner.nextLine();
                playerList.add(new Player(name, 10000.0));
            }
        }
    }
}