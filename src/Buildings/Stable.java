package Buildings;

public class Stable extends Building {


    public Stable(String name, double price, double fieldRequired, double capacity, String type) {
        super(name, price, fieldRequired, capacity,type);
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

