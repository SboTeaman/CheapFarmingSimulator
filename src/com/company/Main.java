package com.company;

import Animals.Animals;
import Buildings.Buildings;
import Buildings.Farms;
import Interfaces.RandomNumberGenerator;

public class Main {
    public static void main(String[] args) {

        Plants corn = new Plants("corn", 2.0, 0.5, 200.0, 5.0, 0.25, 5.0);
        Plants carrot = new Plants("carrot", 3.0, 0.8, 210.0, 3.0, 0.3, 4.0);

        Farms OldFarm = new Farms(
                "Old Farm",
                RandomNumberGenerator.randomBetween(100, 900),
                RandomNumberGenerator.randomBetween(1, 2),
                10.0,
                1,
                0);

        Farms StartedFarm = new Farms(
                "StartedFarm",
                RandomNumberGenerator.randomBetween(900, 3000),
                RandomNumberGenerator.randomBetween(3, 4),
                20.0,
                RandomNumberGenerator.randomBetween(2, 3),
                1);

        Farms AdvancedFarm = new Farms( "AdvancedFarm", RandomNumberGenerator.randomBetween(5000, 8000), RandomNumberGenerator.randomBetween(4, 5), 30.0, RandomNumberGenerator.randomBetween(3, 4), 2);
        Farms HighTierFarm = new Farms( "HighTierFarm", RandomNumberGenerator.randomBetween(10000, 15000), RandomNumberGenerator.randomBetween(6, 7), 40.0, RandomNumberGenerator.randomBetween(5, 6), 3);
        Farms UltimateFarm = new Farms( "UltimateFarm", RandomNumberGenerator.randomBetween(20000, 30000), RandomNumberGenerator.randomBetween(7, 10), 50.0, RandomNumberGenerator.randomBetween(7, 10), 5);

        Animals cow = new Animals("cow", 100.0, 10.0, 2.0, 2.0, corn, 2.0);

        //System.out.println(randomBetween(10, 100));


        Players FirstPlayer = new Players("me");
        Players SecondPlayer = new Players("Not_me");


        System.out.println(FirstPlayer.cash);
        FirstPlayer.sellField(OldFarm, 5);
        FirstPlayer.buyPlant(corn, 10.0);
        System.out.println(FirstPlayer.cash);
        FirstPlayer.buyFarm(OldFarm);
        FirstPlayer.buyFarm(AdvancedFarm);
        FirstPlayer.buyFarm(UltimateFarm);
        FirstPlayer.sellField(OldFarm, 5);
        System.out.println(FirstPlayer.cash);
        System.out.println((FirstPlayer.yourFarms));
        System.out.println(FirstPlayer.cash);
        FirstPlayer.buyMoreField(OldFarm, 9);
        FirstPlayer.buyMoreField(OldFarm, 9);

        System.out.println(FirstPlayer.cash);
        System.out.println(FirstPlayer.yourFarms.toString());
        FirstPlayer.sellField(OldFarm, 5);
        System.out.println(FirstPlayer.cash);
        System.out.println(FirstPlayer.yourFarms.toString());
        System.out.println(corn.toString());
        System.out.println(FirstPlayer.inventory);

        FirstPlayer.buyAnimal(cow, 1);
        System.out.println((FirstPlayer.yourAnimals));
    }
}