package Buildings;


public class Buildings {

    public String name;
    public double price;
    public double fieldRequired;
    public double capacity;

    public Buildings(String name, double price, double fieldRequired) {
        this.name = name;
        this.price = price;
        this.fieldRequired = fieldRequired;

    } public Buildings(String name, double price) {
        this.name = name;
        this.price = price;

    }
    public Buildings(String name, double price, double fieldRequired, double capacity) {
        this.name = name;
        this.price = price;
        this.fieldRequired = fieldRequired;
        this.capacity = capacity;
    }

    public String toString() {
        return
                " name: " + this.name +
                        " price: " + this.price;

    }
}
