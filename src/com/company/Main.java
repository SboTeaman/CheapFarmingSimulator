package com.company;



public class Main
{
    public static void main(String[] args) throws Exception {

        Plants corn = new Plants("corn",2.0,0.5,200.0,5.0,0.25,5.0);
        Plants carrot = new Plants("carrot",3.0,0.8,210.0,3.0,0.3,4.0);


        Players FirstPlayer= new Players("me");
       // System.out.println(FirstPlayer.toString());

        FirstPlayer.sell(corn,10.0);
        //System.out.println(FirstPlayer.toString());

        FirstPlayer.buy(corn,20.0);
        FirstPlayer.buy(carrot,20.0);
       // System.out.println(FirstPlayer.toString());
       // System.out.println(FirstPlayer.inventory);
    }


}
