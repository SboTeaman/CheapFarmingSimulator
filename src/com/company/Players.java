package com.company;

import com.company.Interfaces.Buying;
import com.company.Interfaces.Selling;

import java.util.ArrayList;
import java.util.List;

public class Players implements Selling, Buying {

    private final String name;
    public double cash;
    public List<Plants> inventory = new ArrayList<>(100);

    Players(String name) {
        this.name = name;
        this.cash = 1000.0;
    }




    @Override
    public void buy( Plants plants, Double amount)  {

            if (this.cash >= plants.value_kg) {
                double valueOfTransaction = amount * plants.value_kg;
                this.cash -= valueOfTransaction;
                plants.amountInInventory+=amount;
                this.inventory.add(plants);
                System.out.println("You bought "+amount+" of "+plants.name);

            }
            else{
                System.out.println("You don't have enough money to buy: "+plants.name);
            }
    }
    @Override
    public void sell(Plants plants, Double amount )  {
            if(inventory.contains(plants)){
                if (plants.amountInInventory > 0){
                double valueOfTransaction = amount * plants.value_kg;
                this.cash += valueOfTransaction;
                System.out.println("You successful sell "+amount+ " of " + plants.name);
                plants.amountInInventory -= amount;
                }

                else if (plants.amountInInventory <  amount ) {
                System.out.println("You don't have enough "+plants.name+ " to sell");
                }
                if(plants.amountInInventory == 0) {
                    inventory.remove(plants);
                }
            }
            else{
                System.out.println("You don't have "+plants.name+ " in your inventory");
                }
    }


        public String toString () {
            return "name: " + this.name + "\ncash: " + this.cash;
        }
    }
