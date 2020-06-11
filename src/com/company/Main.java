package com.company;

import Buildings.Buildings;
import Buildings.Farms;
import Interfaces.RandomNumberGenerator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {

        Plants corn = new Plants("corn", 2.0, 0.5, 200.0, 5.0, 0.25, 5.0);
        Plants carrot = new Plants("carrot", 3.0, 0.8, 210.0, 3.0, 0.3, 4.0);

        Buildings OldFarm = new Farms(1,
                "Old Farm",
                RandomNumberGenerator.randomBetween(100, 900),
                RandomNumberGenerator.randomBetween(1,2),
                10.0,
                1,
                0);

        Buildings StartedFarm = new Farms(2,
                "StartedFarm",
                RandomNumberGenerator.randomBetween(900, 3000),
                RandomNumberGenerator.randomBetween(3, 4),
                20.0,
                RandomNumberGenerator.randomBetween(2, 3),
                1);

        Buildings AdvancedFarm = new Farms(3, "AdvancedFarm",RandomNumberGenerator.randomBetween(5000, 8000),RandomNumberGenerator.randomBetween(4, 5),30.0,RandomNumberGenerator.randomBetween(3, 4), 2);
        Buildings HighTierFarm = new Farms(4, "HighTierFarm", RandomNumberGenerator.randomBetween(10000, 15000), RandomNumberGenerator.randomBetween(6, 7),40.0, RandomNumberGenerator.randomBetween(5, 6), 3);
        Buildings UltimateFarm = new Farms(5, "UltimateFarm", RandomNumberGenerator.randomBetween(20000, 30000), RandomNumberGenerator.randomBetween(7, 10),50.0,  RandomNumberGenerator.randomBetween(7, 10), 5);


        //System.out.println(randomBetween(10, 100));




        Players FirstPlayer = new Players("me");
        Players SecondPlayer = new Players("Not_me");
        System.out.println(FirstPlayer.cash);
        FirstPlayer.buyPlant(corn,10.0);
        System.out.println(FirstPlayer.cash);
        FirstPlayer.buyBuilding(OldFarm);
        System.out.println(FirstPlayer.cash);
        System.out.println((FirstPlayer.yourBuildings));
        System.out.println(FirstPlayer.cash);
        FirstPlayer.buyMoreField(OldFarm, 9);
        FirstPlayer.buyMoreField(OldFarm, 9);

        System.out.println(FirstPlayer.cash);
        System.out.println(FirstPlayer.yourBuildings.toString());
    }
}