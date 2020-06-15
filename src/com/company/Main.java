package com.company;

import Animals.Animals;
import Buildings.Buildings;
import Buildings.Cowshed;
import Buildings.Pigsty;
import Buildings.Stable;
import Buildings.Farms;
import Interfaces.RandomNumberGenerator;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Plants corn = new Plants("corn", 2.0, 0.5, 200.0, 5.0, 0.25, 5.0);
        Plants carrot = new Plants("carrot", 3.0, 0.8, 210.0, 3.0, 0.3, 4.0);

        Farms oldFarm = new Farms(
                "Old Farm",
                RandomNumberGenerator.randomBetween(100, 900),
                RandomNumberGenerator.randomBetween(1, 2),
                10.0,
                1,
                0);

        Farms startedFarm = new Farms(
                "startedFarm",
                RandomNumberGenerator.randomBetween(900, 3000),
                RandomNumberGenerator.randomBetween(3, 4),
                20.0,
                RandomNumberGenerator.randomBetween(2, 3),
                1);

        Farms advancedFarm = new Farms("advancedFarm", RandomNumberGenerator.randomBetween(5000, 8000), RandomNumberGenerator.randomBetween(4, 5), 30.0, RandomNumberGenerator.randomBetween(3, 4), 2);
        Farms highTierFarm = new Farms("highTierFarm", RandomNumberGenerator.randomBetween(10000, 15000), RandomNumberGenerator.randomBetween(6, 7), 40.0, RandomNumberGenerator.randomBetween(5, 6), 3);
        Farms ultimateFarm = new Farms("ultimateFarm", RandomNumberGenerator.randomBetween(20000, 30000), RandomNumberGenerator.randomBetween(7, 10), 50.0, RandomNumberGenerator.randomBetween(7, 10), 5);


        Animals cow = new Animals("cow", 100.0, 10.0, 2.0, 2.0, corn, 2.0);

        //System.out.println(randomBetween(10, 100));


        Players FirstPlayer = new Players("me");
        Players SecondPlayer = new Players("Not_me");


        Buildings smallCowshed = new Cowshed("smallCowshed", 1000.0, 2.0, 3);
        Buildings smallPigsty = new Pigsty("smallPigsty", 1000.0, 2.0, 3);
        Buildings smallStable = new Stable("smallStable", 1000.0, 2.0, 3);
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
                                        FirstPlayer.buyFarm(oldFarm);
                                        break;
                                    case 2:
                                        FirstPlayer.buyFarm(startedFarm);
                                        break;
                                    case 3:
                                        FirstPlayer.buyFarm(advancedFarm);
                                        break;
                                    case 4:
                                        FirstPlayer.buyFarm(highTierFarm);
                                        break;
                                    case 5:
                                        FirstPlayer.buyFarm(ultimateFarm);
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
                                        FirstPlayer.buyBuildings(oldFarm,smallCowshed); // some improvement needed
                                    case 2:
                                    case 3:
                                }

                                break;
                            case 3:
                                System.out.println("Buy Plants");
                                System.out.println("---------------------");
                                System.out.println("1 - " + corn.toString());
                                System.out.println("2 - " + carrot.toString());

                                Scanner scannerPlant = new Scanner(System.in);
                                int choicePlant = scannerFarm.nextInt();

                                switch (choicePlant) {
                                    case 1:
                                        System.out.println("How much corn you want to buy?");
                                        Scanner scannerAmount = new Scanner(System.in);
                                        int choiceAmount = scannerFarm.nextInt();
                                        FirstPlayer.buyPlant(corn, choiceAmount);
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
                                System.out.println(FirstPlayer.yourFarms);
                                break;
                            case 2:
                                System.out.println("List of your buildings:");
                                System.out.println(FirstPlayer.yourBuildings);
                                break;
                            case 3:
                                System.out.println("List of your Animals:");
                                System.out.println(FirstPlayer.yourAnimals);
                                break;
                            case 4:
                                System.out.println("List of your Plants:");
                                System.out.println(FirstPlayer.inventory);
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

    }

}