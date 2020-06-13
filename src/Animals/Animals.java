package Animals;

import com.company.Plants;

public class Animals {
    public String name;
    public double costOfPurchase;
    public double timeToGrowUp;
    public double gainWeightForWeek;
    public double amountOfFoodPerWeek;
    public Plants typeOfFoodThatCanEat;
    public double chanceForReproduction;


    public Animals(String name, double costOfPurchase, double timeToGrowUp, double gainWeightForWeek, double amountOfFoodPerWeek, Plants typeOfFoodThatCanEat, double chanceForReproduction) {
        this.name=name;
        this.costOfPurchase = costOfPurchase;
        this.timeToGrowUp = timeToGrowUp;
        this.gainWeightForWeek = gainWeightForWeek;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.typeOfFoodThatCanEat = typeOfFoodThatCanEat;
        this.chanceForReproduction = chanceForReproduction;

    }

    public void Feed() {
    }

    public void Reproduction() {
    }

    public String toString(){
        return this.name;
    }

}

