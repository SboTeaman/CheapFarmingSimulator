package Buildings;

public class Silos extends Building {


    public Silos(String name, double price) {
        super(name, price);
    }
    @Override
    public String toString() {
        return "Cowshed{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", fieldRequired=" + fieldRequired +
                ", capacity=" + capacity +
                '}';
    }
}


