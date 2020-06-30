package buildings;


public class Building {

    public final String name;
    public  double fieldRequired;
    public double capacity;
    public String type;
    private final double price;
    public Building(String name, double price, double fieldRequired, double capacity, String type) {
        this.name = name;
        this.price = price;
        this.fieldRequired = fieldRequired;
        this.capacity = capacity;
        this.type = type;
    }

    public Building(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return " name: " + this.type +
                " price: " + this.price;

    }
}
