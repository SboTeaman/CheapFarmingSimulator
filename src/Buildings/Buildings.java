package Buildings;


public class Buildings {

    public String name;
    public double price;
    public double fieldsSlots;
    public double maxFieldsSlots;
    public double silosSlots;
    public double maxSilosSlots;
    public double garageSlots;
    public double maxGarageSlots;

    public Buildings(String name, double price,double fieldsSlots,double maxFieldsSlots, double silosSlots, double garageSlots) {
    this.name=name;
    this.price=price;
    this.fieldsSlots=fieldsSlots;
    this.maxFieldsSlots=maxFieldsSlots;
    this.silosSlots=silosSlots;
    this.garageSlots=garageSlots;
    }

    public Buildings(String name, double price,double silosSlots ,double maxSilosSlots, double garageSlots) {
        this.name=name;
        this.price=price;
        this.silosSlots=silosSlots;
        this.maxSilosSlots=maxSilosSlots;
        this.garageSlots=garageSlots;
    }



    public String toString(){return
                " name: "+this.name +
                " price: "+this.price +
                " field Slots "+this.fieldsSlots+
                " max field slots "+this.maxFieldsSlots+
                " silos Slots "+this.silosSlots +
                " garage Slots "+this.garageSlots;
    }
}
