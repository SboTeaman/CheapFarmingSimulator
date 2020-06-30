package buildings;

public class Farm {

    public final int maxFieldsSlots;
    public final String name;
    public final double price;
    public final double priceForField = 1;
    public int fieldsSlots;


    public Farm(String name, double price, int fieldsSlots, int maxFieldsSlots) {
        this.name = name;
        this.price = price;
        this.fieldsSlots = fieldsSlots;
        this.maxFieldsSlots = maxFieldsSlots;
    }


    public String toString() {
        return " name: " + this.name +
                " price: " + this.price +
                " field Slots: " + this.fieldsSlots +
                " max field slots: " + this.maxFieldsSlots;


    }

}
