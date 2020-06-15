package Buildings;

public class Cowshed extends  Buildings{

     public Cowshed(String name, double price, double fieldRequired, double capacity) {
        super(name, price, fieldRequired, capacity);
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
