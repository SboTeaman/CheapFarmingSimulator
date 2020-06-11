package com.company;


import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args) throws Exception {

        Plants corn = new Plants("corn",2.0,0.5,200.0,5.0,0.25,5.0);
        Plants carrot = new Plants("carrot",3.0,0.8,210.0,3.0,0.3,4.0);


        Players FirstPlayer= new Players("me");
        Players SecondPlayer = new Players("Not_me");
       // System.out.println(FirstPlayer.toString());


        //System.out.println(FirstPlayer.toString());

        FirstPlayer.buy(corn,20.0);
        FirstPlayer.buy(carrot,20.0);
        System.out.println(FirstPlayer.inventory);
        FirstPlayer.sell(corn,10.0);
        FirstPlayer.sell(corn,10.0);
        FirstPlayer.sell(corn,10.0);

        FirstPlayer.sell(carrot,10.0);
        FirstPlayer.sell(carrot,10.0);
        FirstPlayer.sell(carrot,10.0);


       // SecondPlayer.buy(corn,40.0);
        System.out.println((corn.amountInInventory));


    }


}
