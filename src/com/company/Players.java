package com.company;

import com.company.Interfaces.Buying;
import com.company.Interfaces.Selling;

import java.util.ArrayList;
import java.util.List;

public class Players implements Selling, Buying {

    private final String name;
    public double cash;
    public List<Plants> inventory = new ArrayList<>();

    Players(String name) {
        this.name = name;
        this.cash = 0.0;
    }


    @Override
    public void sell(Plants plants, Double amount) throws Exception {
        double valueOfTransaction = amount * plants.value_kg;
        this.cash += valueOfTransaction;

    }

    @Override
    public void buy(Plants plants, Double amount) throws Exception {

            if (this.cash >= plants.value_kg) {
                double valueOfTransaction = amount * plants.value_kg;
                this.cash -= valueOfTransaction;
                plants.amount = amount;
                inventory.add((plants));
                System.out.println("You bought "+plants.amount+" of "+plants.name);
            }
            else{
                System.out.println("You don't have enough money to buy: "+plants.name);
            }
    }

        public String toString () {
            return "name: " + this.name + "\ncash: " + this.cash;
        }
    }
