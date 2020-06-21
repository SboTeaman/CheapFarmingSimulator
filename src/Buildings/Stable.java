package Buildings;

public class Stable extends Building {


    public Stable(String name, double price, double fieldRequired, double capacity) {
        super(name, price, fieldRequired, capacity);
    }


    @Override
    public String toString() {
        return "Stable{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", fieldRequired=" + fieldRequired +
                ", capacity=" + capacity +
                '}';
    }
}

