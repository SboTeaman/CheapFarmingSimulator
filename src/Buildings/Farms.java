package Buildings;
import Interfaces.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Farms extends Buildings  {

    public int index;
    public String name;
    public double price;
    public double startingAmountOfFields;
    public double maxAmountOfFields;
    public double silosSlots;
    public double garageSlots;
    List<Farms> farmList= new ArrayList();

    public Farms(int index,
                 String name,
                 double price,
                 double startingAmountOfFields,
                 double maxAmountOfFields,
                 double silosSlots,
                 double garageSlots) {
        super(name, price);
        this.index = index;
        this.startingAmountOfFields = startingAmountOfFields;
        this.maxAmountOfFields = maxAmountOfFields;
        this.silosSlots = silosSlots;
        this.garageSlots = garageSlots;

    }




    public String ToString(){
        return "index: "+this.index+
                " name: "+this.name +
                " price: "+this.price +
                " starting Amount Of Fields "+this.startingAmountOfFields +
                " max Amount Of Fields "+this.maxAmountOfFields +
                " silos Slots "+this.silosSlots +
                " garage Slots "+this.garageSlots;
    }

}
