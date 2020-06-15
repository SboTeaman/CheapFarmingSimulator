package Buildings;

public class Silos extends Buildings {


    public Silos(String name, double price, double silosSlots, double maxSilosSlots) {
        super(name, price, silosSlots, maxSilosSlots);
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


