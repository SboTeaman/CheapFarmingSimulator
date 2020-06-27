package Buildings;

public class Chickencoop extends Building {


    public Chickencoop(String name, double price, double fieldRequired, double capacity, String type) {
        super(name, price, fieldRequired, capacity, type);
    }

    @Override
    public String toString() {
        return "name='" + type + '\'' +
                ", price=" + price +
                ", fieldRequired=" + fieldRequired +
                ", capacity=" + capacity +
                '}';
    }
}
