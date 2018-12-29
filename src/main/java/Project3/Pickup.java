package Project3;

public class Pickup extends Car {
    @Override
    public void list() {
        System.out.println("\t"+ carName + "\t租金：" + rendCost + "\t载物：" + carryThingNumber +"\t载人："+carryPeopleNumber);
    }

    public Pickup(String carName, int carryThingNumber, int rendCost,int carryPeopleNumber) {
        carName = carName;
        carryThingNumber = carryThingNumber;
        rendCost = rendCost;
        carryPeopleNumber = carryPeopleNumber;

    }
}
