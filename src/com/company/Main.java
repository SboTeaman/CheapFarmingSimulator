package com.company;

import com.sun.source.tree.NewArrayTree;
import menu.Menu;
import notBuildings.*;
import buildings.*;
import interfaces.RandomNumberGeneratorInt;

import javax.swing.plaf.metal.MetalMenuBarUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player.newPlayer();

        int choiceMenu;
        int week;
        int year = 2020;
        for (week = 1; week > 0; week++) {

            Plant cornSeed = new Plant("cornSeed", 25.0, 10, RandomNumberGeneratorInt.randomBetween(200, 300), 20, 1.25, 200, 20, "corn");
            Plant carrotSeed = new Plant("carrotSeed", 33.50, 11, RandomNumberGeneratorInt.randomBetween(100, 150), 50, 2.3, 300, 30, "carrot");
            Plant sunflowerSeed = new Plant("sunflowerSeed", 22.0, 15, RandomNumberGeneratorInt.randomBetween(100, 220), 30, 0.25, 200, 20, "sunflower");
            Plant potatoSeed = new Plant("potatoSeed", 13.0, 8, RandomNumberGeneratorInt.randomBetween(150, 200), 35, 4.3, 400, 40, "potato");
            Plant wheatSeed = new Plant("wheatSeed", 43.40, 8, RandomNumberGeneratorInt.randomBetween(180, 200), 42, 2, 600, 60, "wheat");
            Plant broccoliSeed = new Plant("broccoliSeed", 13.0, 7, RandomNumberGeneratorInt.randomBetween(100, 120), 25, 3, 700, 70, "broccoli");
            Plant onionSeed = new Plant("onionSeed", 23.0, 12, RandomNumberGeneratorInt.randomBetween(100, 120), 30, 5.25, 200, 20, "onion");
            Plant lettuceSeed = new Plant("lettuceSeed", 26.60, 5, RandomNumberGeneratorInt.randomBetween(160, 200), 20, 2.25, 200, 20, "lettuce");
            Plant tomatoSeed = new Plant("tomatoSeed", 33.0, 9, RandomNumberGeneratorInt.randomBetween(100, 200), 33, 3.3, 400, 40, "tomato");

            Plant appleSeed = new Plant("appleSeed", 300.0, 20, RandomNumberGeneratorInt.randomBetween(30, 50), 100, 0.3, 1000, 10, "apple");
            Plant pearSeed = new Plant("pearSeed", 250.0, 22, RandomNumberGeneratorInt.randomBetween(35, 55), 120, 0.25, 2000, 20, "pear");
            Plant cherrySeed = new Plant("cherrySeed", 400.0, 21, RandomNumberGeneratorInt.randomBetween(40, 60), 130, 0.25, 3000, 30, "cherry");
            Plant melonSeed = new Plant("melonSeed", 50.0, 16, RandomNumberGeneratorInt.randomBetween(80, 110), 40, 4.3, 200, 20, "melon");
            Plant watermelonSeed = new Plant("watermelonSeed", 55.50, 12, RandomNumberGeneratorInt.randomBetween(90, 200), 47, 5.25, 250, 30, "watermelon");
            Plant lemonSeed = new Plant("lemonSeed", 27.0, 5, RandomNumberGeneratorInt.randomBetween(100, 200), 60, 0.25, 200, 20, "lemon");
            Plant strawberriesSeed = new Plant("strawberriesSeed", 60.0, RandomNumberGeneratorInt.randomBetween(100, 200), 200, 34, 6.25, 500, 50, "strawberries");

            Animal cow = new Animal("cow", 1000.0, 10.0, 200.0, 0.2, 2.0, "corn", "milk", "Cowshed", false);
            Animal sheep = new Animal("sheep", 1200.0, 10.0, 250.0, 0.1, 2.0, "wheat", "wool", "Stable", false);
            Animal pig = new Animal("pig", 800.0, 10.0, 180.0, 0.30, 2.0, "carrot", null, "Pigsty", false);
            Animal chicken = new Animal("chicken", 200.0, 0.2, 50.0, 0.1, 2.0, "sunflower", "egg", "Chickencoop", false);
            Animal dog = new Animal("dog", 2000.0, 1.0, 100.0, 0.2, 2.0, "dogFood", false);
            Animal cat = new Animal("cat", 2200.0, 0.5, 80.0, 0.1, 2.0, "catFood", false);


            Farm oldFarm = new Farm("Old Farm", RandomNumberGeneratorInt.randomBetween(1000, 1500), RandomNumberGeneratorInt.randomBetween(2, 5), 10);
            Farm startedFarm = new Farm("startedFarm", RandomNumberGeneratorInt.randomBetween(3000, 4000), RandomNumberGeneratorInt.randomBetween(5, 10), 20);
            Farm advancedFarm = new Farm("advancedFarm", RandomNumberGeneratorInt.randomBetween(5000, 8000), RandomNumberGeneratorInt.randomBetween(10, 15), 30);
            Farm highTierFarm = new Farm("highTierFarm", RandomNumberGeneratorInt.randomBetween(10000, 15000), RandomNumberGeneratorInt.randomBetween(20, 25), 40);
            Farm ultimateFarm = new Farm("ultimateFarm", RandomNumberGeneratorInt.randomBetween(200000, 300000), RandomNumberGeneratorInt.randomBetween(30, 40), 100);


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

            Silos silos = new Silos("silos", 2000.0);

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
                    System.out.println("4 - End a week");

                    Scanner scannerMenu = new Scanner(System.in);
                    choiceMenu = scannerMenu.nextInt();
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

                            switch (Menu.choiceMenu()) {
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

                                    Menu.whichFarm().buyFarm(Player.playerList.get(whichPlayer));
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

                                    Menu.whichBuilding().buyBuildings(Player.playerList.get(whichPlayer), Player.playerList.get(whichPlayer).farm.get(0));
                                    break;

                                case 3: {
                                    System.out.println("---------------------");
                                    System.out.println("Buy more field");
                                    System.out.println("---------------------");

                                    Player.playerList.get(whichPlayer).farm.get(0).buy(Player.playerList.get(whichPlayer));
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

                                    Menu.whichPlant().buy(Player.playerList.get(whichPlayer));
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

                                    Menu.whichAnimal().buy(Player.playerList.get(whichPlayer));
                                    break;

                                case 6:
                                    System.out.println("---------------------");
                                    System.out.println("Your plants: " + Player.playerList.get(whichPlayer).yourPlants);
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
                                    System.out.println("---------------------");
                                    System.out.println("0 - Return");
                                    System.out.println("---------------------");

                                    Menu.whichPlant().sell(Player.playerList.get(whichPlayer));
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

                                    Menu.whichAnimal().sell(Player.playerList.get(whichPlayer));
                                    break;

                                case 8:
                                    System.out.println("---------------------");
                                    System.out.println("Sell Field");
                                    System.out.println("---------------------");

                                    Player.playerList.get(whichPlayer).farm.get(0).sell(Player.playerList.get(whichPlayer));
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

                            switch (Menu.choiceMenu()) {
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
                                    System.out.println("Silos: " + Player.playerList.get(whichPlayer).isSilos);
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

                            switch (Menu.choiceMenu()) {
                                case 1:
                                    System.out.println("---------------------");
                                    System.out.println("Your seeds: " + Player.playerList.get(whichPlayer).yourSeeds);
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

                                    Menu.whichPlant().plant(Player.playerList.get(whichPlayer));
                                    break;

                                case 2:
                                    Plant.harvest(Player.playerList.get(whichPlayer));
                                    break;
                                case 3:
                                    Animal.feed(Player.playerList.get(whichPlayer));
                                    break;
                            }
                            break;
                    }
                }
                while (choiceMenu < 4);
                if (choiceMenu >= 4) {
                    break;
                }

                Plant.growingProcess(Player.playerList.get(whichPlayer));
                Plant.protectFromParasite(Player.playerList.get(whichPlayer));
                World.disasters(Player.playerList.get(whichPlayer), week);
                Animal.growingProcess(Player.playerList.get(whichPlayer));
                Animal.reproduction(Player.playerList.get(whichPlayer));
                Animal.productionItem(Player.playerList.get(whichPlayer));

                World.isWinner(Player.playerList.get(whichPlayer), ultimateFarm);
            }
            if (week == 52) {
                week = 0;
                year++;
            }
        }
    }

}


