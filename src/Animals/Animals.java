package Animals;

import com.company.Plants;

public class Animals {
    public String name;
    public double costOfPurchase;
    public double timeToGrowUp;
    public double gainWeightForWeek;
    public double amountOfFoodPerWeek;
    public String typeOfFoodThatCanEat;
    public double chanceForReproduction;
    public int amountInBuilding = 0;

    public Animals(String name, double costOfPurchase, double timeToGrowUp, double gainWeightForWeek, double amountOfFoodPerWeek, String typeOfFoodThatCanEat, double chanceForReproduction) {
        this.name = name;
        this.costOfPurchase = costOfPurchase;
        this.timeToGrowUp = timeToGrowUp;
        this.gainWeightForWeek = gainWeightForWeek;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.typeOfFoodThatCanEat = typeOfFoodThatCanEat;
        this.chanceForReproduction = chanceForReproduction;

    }


    public Animals(String name, double costOfPurchase, double timeToGrowUp, double gainWeightForWeek, double amountOfFoodPerWeek, String typeOfFoodThatCanEat, double chanceForReproduction, int amountInBuilding) {
        this.name = name;
        this.costOfPurchase = costOfPurchase;
        this.timeToGrowUp = timeToGrowUp;
        this.gainWeightForWeek = gainWeightForWeek;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.typeOfFoodThatCanEat = typeOfFoodThatCanEat;
        this.chanceForReproduction = chanceForReproduction;
        this.amountInBuilding = amountInBuilding;

    }



    public void Feed() {
    }

    public void Reproduction() {
    }


/*
    @Override
    public void buy(Players player, int amount) {

    }

 */

    @Override
    public String toString() {
        return "\nYours Animals: " +
                "\nname: " + name +
                "\ncostOfPurchase: " + costOfPurchase +
                "\ntimeToGrowUp: " + timeToGrowUp +
                "\ngainWeightForWeek: " + gainWeightForWeek +
                "\namountOfFoodPerWeek: " + amountOfFoodPerWeek +
                "\ntypeOfFoodThatCanEat: " + typeOfFoodThatCanEat +
                "\nchanceForReproduction: " + chanceForReproduction +
                "\namountInBuilding: " + amountInBuilding +"\n";
    }
}

