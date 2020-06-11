package com.company;

import Buildings.Farms;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {


        //System.out.println(randomBetween(10, 100));


        Plants corn = new Plants("corn", 2.0, 0.5, 200.0, 5.0, 0.25, 5.0);
        Plants carrot = new Plants("carrot", 3.0, 0.8, 210.0, 3.0, 0.3, 4.0);


        Players FirstPlayer = new Players("me");
        Players SecondPlayer = new Players("Not_me");

    }
}