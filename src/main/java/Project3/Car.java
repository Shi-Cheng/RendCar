package Project3;

public class Car {
    public String carName;
    public int carryPeopleNumber;
    public int rendCost;
    public int carryThingNumber;
    public void list(){
        System.out.println("车："+carName + "\t载人：" + carryPeopleNumber + "\t载货："+ carryThingNumber +"\t费用:"+ rendCost );
    }
}
