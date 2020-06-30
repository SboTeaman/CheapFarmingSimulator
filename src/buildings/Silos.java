package buildings;

public class Silos extends Building {


    public Silos(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return " name: '" + type +
                ", price: " + getPrice() +
                ", fieldRequired: " + fieldRequired +
                ", capacity: " + capacity;
    }
}


