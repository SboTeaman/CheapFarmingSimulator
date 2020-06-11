package Buildings;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Farms {

    public int index;
    public String name;
    public double price;
    public double startingAmountOfFields;
    public double maxAmountOfFields;
    public double silosSlots;
    public double garageSlots;
    List<Farms> farmList= new ArrayList();

    public Farms(int index,
                 String name,
                 double price,
                 double startingAmountOfFields,
                 double maxAmountOfFields,
                 double silosSlots,
                 double garageSlots) {

        this.index = index;
        this.name = name;
        this.price = price;
        this.startingAmountOfFields = startingAmountOfFields;
        this.maxAmountOfFields = maxAmountOfFields;
        this.silosSlots = silosSlots;
        this.garageSlots = garageSlots;



    }
    Farms OldFarm = new Farms(1, "Old Farm", randomBetween(100, 900), randomBetween(2, 3), 5,1, 0);
    Farms StartedFarm = new Farms(2, "StartedFarm", randomBetween(900, 3000), randomBetween(3, 4), 6, randomBetween(2, 3), 1);
    Farms AdvancedFarm = new Farms(3, "AdvancedFarm", randomBetween(5000, 8000), randomBetween(4, 5),7, randomBetween(3, 4), 2);
    Farms HighTierFarm = new Farms(4, "HighTierFarm", randomBetween(10000, 15000), randomBetween(6, 7), 8, randomBetween(5, 6), 3);
    Farms UltimateFarm = new Farms(5, "UltimateFarm", randomBetween(20000, 30000), randomBetween(7, 10), 10, randomBetween(7, 10), 5);

    

    public String ToString(){
        return "index: "+this.index+
                " name: "+this.name +
                " price: "+this.price +
                " starting Amount Of Fields "+this.startingAmountOfFields +
                " max Amount Of Fields "+this.maxAmountOfFields +
                " silos Slots "+this.silosSlots +
                " garage Slots "+this.garageSlots;
    }
    static int randomBetween(int start, int end) {
        Random random = new Random();

        int a1 = random.nextInt(end - start + 1);
        int a2 = a1 + start;
        return a2;
    }
}
