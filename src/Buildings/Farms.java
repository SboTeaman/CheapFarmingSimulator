package Buildings;

import java.util.ArrayList;
import java.util.List;

public class Farms extends Buildings  {

    public int index;
    public String name;
    public double price;

    List<Farms> farmList= new ArrayList();

    public Farms(int index,
                 String name,
                 double price,
                 double fieldsSlots,
                 double maxFieldSlots,
                 double silosSlots,
                 double garageSlots) {
        super(name, price, fieldsSlots,maxFieldSlots, silosSlots, garageSlots);
        this.index = index;


    }




    public String ToString(){
        return "index: "+this.index+
                " name: "+this.name +
                " price: "+this.price +
                " field Slots "+this.fieldsSlots+
                "max field slots"+this.maxFieldsSlots+
                " silos Slots "+this.silosSlots +
                " garage Slots "+this.garageSlots;
    }

}
