package Project3;

public class Truck extends Car{

    @Override
    public void list() {
        System.out.println("\t"+ carName + "\t租金：" + rendCost + "\t载物：" + carryThingNumber );
    }

    public Truck(String carName, int carryThingNumber, int rendCost) {
        carName = carName;
        carryThingNumber = carryThingNumber;
        rendCost = rendCost;
    }
}
