package Buildings;


public class Building {

    public String name;
    public double price;
    public double fieldRequired;
    public double capacity;
    public String type;

    public Building(String name, double price, double fieldRequired, double capacity, String type) {
        this.name = name;
        this.price = price;
        this.fieldRequired = fieldRequired;
        this.capacity = capacity;
        this.type = type;
    }

    public Building(String name, double price, double fieldRequired) {
        this.name = name;
        this.price = price;
        this.fieldRequired = fieldRequired;

    } public Building(String name, double price) {
        this.name = name;
        this.price = price;

    }
    public Building(String name, double price, double fieldRequired, double capacity) {
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
