package buildings;


import notBuildings.Player;

public class Building {

    public final String name;
    private final double price;
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

    public Building(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public double getPrice() {
        return price;
    }

    public void buyBuildings(Player player, Farm farm) {
        if (player.farm.isEmpty()) {
            System.out.println("You don't have any farm");
        } else {
            if (player.getCash() > this.getPrice()) {
                if (farm.fieldsSlots > 0) {

                    if (player.yourBuildings.isEmpty()) {
                        player.setCash(-this.getPrice());
                        farm.fieldsSlots -= 1;
                        player.yourBuildings.add(this);
                        System.out.println("You bought: " + this.name);
                    } else {
                        one:
                        {
                            for (int i = 0; i < player.yourBuildings.size(); i++) {
                                if (player.yourBuildings.get(i).type.equals(this.type)) {
                                    player.yourBuildings.get(i).capacity += this.capacity;
                                    break one;
                                }
                            }
                            player.yourBuildings.add(this);
                            System.out.println("You bought: " + this.name);
                        }
                    }

                } else {
                    System.out.println("You don't have enough space for " + this.name);
                }
            } else {
                System.out.println("You don't have enough money to buy: " + this.name);
            }
        }
    }

    public String toString() {
        return " name: " + this.type +
                " price: " + this.price;

    }
}
