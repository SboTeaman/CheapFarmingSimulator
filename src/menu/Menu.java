package menu;

import buildings.*;
import interfaces.RandomNumberGeneratorInt;
import notBuildings.Animal;
import notBuildings.Plant;
import notBuildings.Player;

import java.util.Scanner;

public class Menu {
    /* PLANTS */
    static Plant cornSeed = new Plant("cornSeed", 25.0, 10, RandomNumberGeneratorInt.randomBetween(200, 300), 20, 1.25, 200, 20, "corn");
    static Plant carrotSeed = new Plant("carrotSeed", 33.50, 11, RandomNumberGeneratorInt.randomBetween(100, 150), 50, 2.3, 300, 30, "carrot");
    static Plant sunflowerSeed = new Plant("sunflowerSeed", 22.0, 15, RandomNumberGeneratorInt.randomBetween(100, 220), 30, 0.25, 200, 20, "sunflower");
    static Plant potatoSeed = new Plant("potatoSeed", 13.0, 8, RandomNumberGeneratorInt.randomBetween(150, 200), 35, 4.3, 400, 40, "potato");
    static Plant wheatSeed = new Plant("wheatSeed", 43.40, 8, RandomNumberGeneratorInt.randomBetween(180, 200), 42, 2, 600, 60, "wheat");
    static Plant broccoliSeed = new Plant("broccoliSeed", 13.0, 7, RandomNumberGeneratorInt.randomBetween(100, 120), 25, 3, 700, 70, "broccoli");
    static Plant onionSeed = new Plant("onionSeed", 23.0, 12, RandomNumberGeneratorInt.randomBetween(100, 120), 30, 5.25, 200, 20, "onion");
    static Plant lettuceSeed = new Plant("lettuceSeed", 26.60, 5, RandomNumberGeneratorInt.randomBetween(160, 200), 20, 2.25, 200, 20, "lettuce");
    static Plant tomatoSeed = new Plant("tomatoSeed", 33.0, 9, RandomNumberGeneratorInt.randomBetween(100, 200), 33, 3.3, 400, 40, "tomato");
    /* fruits */
    static Plant appleSeed = new Plant("appleSeed", 300.0, 20, RandomNumberGeneratorInt.randomBetween(30, 50), 100, 0.3, 1000, 10, "apple");
    static Plant pearSeed = new Plant("pearSeed", 250.0, 22, RandomNumberGeneratorInt.randomBetween(35, 55), 120, 0.25, 2000, 20, "pear");
    static Plant cherrySeed = new Plant("cherrySeed", 400.0, 21, RandomNumberGeneratorInt.randomBetween(40, 60), 130, 0.25, 3000, 30, "cherry");
    static Plant melonSeed = new Plant("melonSeed", 50.0, 16, RandomNumberGeneratorInt.randomBetween(80, 110), 40, 4.3, 200, 20, "melon");
    static Plant watermelonSeed = new Plant("watermelonSeed", 55.50, 12, RandomNumberGeneratorInt.randomBetween(90, 200), 47, 5.25, 250, 30, "watermelon");
    static Plant lemonSeed = new Plant("lemonSeed", 27.0, 5, RandomNumberGeneratorInt.randomBetween(100, 200), 60, 0.25, 200, 20, "lemon");
    static Plant strawberriesSeed = new Plant("strawberriesSeed", 60.0, RandomNumberGeneratorInt.randomBetween(100, 200), 200, 34, 6.25, 500, 50, "strawberries");
    /*ANIMALS*/
    static Animal cow = new Animal("cow", 1000.0, 10.0, 200.0, 0.2, 2.0, "corn", "milk", "Cowshed", false);
    static Animal sheep = new Animal("sheep", 1200.0, 10.0, 250.0, 0.1, 2.0, "wheat", "wool", "Stable", false);
    static Animal pig = new Animal("pig", 800.0, 10.0, 180.0, 0.30, 2.0, "carrot", null, "Pigsty", false);
    static Animal chicken = new Animal("chicken", 200.0, 0.2, 50.0, 0.1, 2.0, "sunflower", "egg", "Chickencoop", false);
    static Animal dog = new Animal("dog", 2000.0, 1.0, 100.0, 0.2, 2.0, "dogFood", false);
    static Animal cat = new Animal("cat", 2200.0, 0.5, 80.0, 0.1, 2.0, "catFood", false);

    /*BUILDINGS*/
    static Building smallCowshed = new Cowshed("smallCowshed", 1000.0, 1.0, 10, "Cowshed");
    static Building smallPigsty = new Pigsty("smallPigsty", 1000.0, 1.0, 10, "Pigsty");
    static Building smallStable = new Stable("smallStable", 1000.0, 1.0, 10, "Stable");
    static Building smallChickencoop = new Chickencoop("smallChickencoop", 1000.0, 1.0, 10, "Chickencoop");

    static Building mediumCowshed = new Cowshed("mediumCowshed", 5000.0, 1.0, 30, "Cowshed");
    static Building mediumPigsty = new Pigsty("mediumPigsty", 5000.0, 1.0, 30, "Pigsty");
    static Building mediumStable = new Stable("mediumStable", 5000.0, 1.0, 30, "Stable");
    static Building mediumChickencoop = new Chickencoop("mediumChickencoop", 5000.0, 1.0, 30, "Chickencoop");

    static Building bigCowshed = new Cowshed("bigCowshed", 10000.0, 1.0, 100, "Cowshed");
    static Building bigPigsty = new Pigsty("bigPigsty", 10000.0, 1.0, 100, "Pigsty");
    static Building bigStable = new Stable("bigStable", 10000.0, 1.0, 100, "Stable");
    static Building bigChickencoop = new Chickencoop("bigChickencoop", 1000.0, 1.0, 100, "Chickencoop");

    static Silos silos = new Silos("silos", 2000.0);
    /*FARMS*/
    static Farm oldFarm = new Farm("Old Farm", RandomNumberGeneratorInt.randomBetween(1000, 1500), RandomNumberGeneratorInt.randomBetween(2, 5), 10);
    static Farm startedFarm = new Farm("startedFarm", RandomNumberGeneratorInt.randomBetween(3000, 4000), RandomNumberGeneratorInt.randomBetween(5, 10), 20);
    static Farm advancedFarm = new Farm("advancedFarm", RandomNumberGeneratorInt.randomBetween(5000, 8000), RandomNumberGeneratorInt.randomBetween(10, 15), 30);
    static Farm highTierFarm = new Farm("highTierFarm", RandomNumberGeneratorInt.randomBetween(10000, 15000), RandomNumberGeneratorInt.randomBetween(20, 25), 40);
    static Farm ultimateFarm = new Farm("ultimateFarm", RandomNumberGeneratorInt.randomBetween(200000, 300000), RandomNumberGeneratorInt.randomBetween(30, 40), 100);


    public static int choiceMenu() {
        Scanner scannerMenu = new Scanner(System.in);
        int choiceMenu = scannerMenu.nextInt();
        return choiceMenu;
    }

    public static Plant whichPlant() {

        System.out.println("Select plant:");

        switch (Menu.choiceMenu()) {
            case 0:
                break;
            case 1:
                return cornSeed;
            case 2:
                return carrotSeed;
            case 3:
                return sunflowerSeed;
            case 4:
                return potatoSeed;
            case 5:
                return wheatSeed;
            case 6:
                return broccoliSeed;
            case 7:
                return onionSeed;
            case 8:
                return lettuceSeed;
            case 9:
                return tomatoSeed;
            case 10:
                return appleSeed;
            case 11:
                return pearSeed;
            case 12:
                return cherrySeed;
            case 13:
                return melonSeed;
            case 14:
                return watermelonSeed;
            case 15:
                return lemonSeed;
            case 16:
                return strawberriesSeed;
        }
        return null;
    }

    public static Animal whichAnimal() {

        System.out.println("Select animal:");

        switch (Menu.choiceMenu()) {
            case 1:
                return cow;
            case 2:
                return sheep;
            case 3:
                return pig;
            case 4:
                return chicken;
            case 5:
                return dog;
            case 6:
                return cat;
        }
        return null;
    }

    public static Building whichBuilding() {
        switch (Menu.choiceMenu()) {
            case 1:
                return smallCowshed;
            case 2:
                return smallPigsty;
            case 3:
                return smallStable;
            case 4:
                return smallChickencoop;
            case 5:
                return mediumCowshed;
            case 6:
                return mediumPigsty;
            case 7:
                return mediumStable;
            case 8:
                return mediumChickencoop;
            case 9:
                return bigCowshed;
            case 10:
                return bigPigsty;
            case 11:
                return bigStable;
            case 12:
                return bigChickencoop;
            case 13:
                return silos;
        }
        return null;
    }

    public static Farm whichFarm() {

        switch (Menu.choiceMenu()) {
            case 1:
                return oldFarm;
            case 2:
                return startedFarm;
            case 3:
                return advancedFarm;
            case 4:
                return highTierFarm;
            case 5:
                return ultimateFarm;
        }
        return null;
    }
}
