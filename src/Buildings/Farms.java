package Buildings;

import Interfaces.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Farms  {

    public double fieldsSlots;
    public double maxFieldsSlots;
    public double silosSlots;
    public double garageSlots;
    public String name;
    public double price;
    public double priceForField = RandomNumberGenerator.randomBetween(10,10);


    public List<Farms> farmList = new ArrayList();


    public Farms(String name, double price, double fieldsSlots, double maxFieldsSlots, double silosSlots, double garageSlots) {
        this.name = name;
        this.price = price;
        this.fieldsSlots = fieldsSlots;
        this.maxFieldsSlots = maxFieldsSlots;
        this.silosSlots = silosSlots;
        this.garageSlots = garageSlots;
    }


    public String toString() {
        return
                " name: " + this.name +
                " price: " + this.price +
                " field Slots: " + this.fieldsSlots +
                " max field slots: " + this.maxFieldsSlots +
                " silos Slots: " + this.silosSlots +
                " garage Slots: " + this.garageSlots;
    }

}
