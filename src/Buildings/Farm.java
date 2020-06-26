package Buildings;

import Interfaces.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    public int fieldsSlots;
    public int maxFieldsSlots;
    public double silosSlots;
    public double garageSlots;
    public String name;
    public double price;
    public double priceForField = RandomNumberGenerator.randomBetween(10,10);


    public List<Farm> farmList = new ArrayList();


    public Farm(String name, double price, int fieldsSlots, int maxFieldsSlots, double silosSlots, double garageSlots) {
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
