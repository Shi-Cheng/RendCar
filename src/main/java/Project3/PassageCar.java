package Project3;

public class PassageCar extends Car {
    @Override
    public void list() {
        System.out.println("\t"+ carName + "\t租金：" + rendCost + "\t载物：" + carryThingNumber );
    }
    public PassageCar(String carName, int carryPeopleNumber, int rendCost) {
        carName = carName;
        carryPeopleNumber = carryPeopleNumber;
        rendCost = rendCost;
    }
}
