package Project3;

import java.util.Scanner;

public class demo {

    private static Scanner choices;

    /*public static Car[] car = { new Truck("小型货车",300,5),new Truck("大型货车",1000,20),
            new PassageCar("宝马Z4",3,2), new PassageCar("奥迪A8",2,5),
            new Pickup("江铃皮卡",1500,5,1),new Pickup("福特猛禽",2300,5,3)};
*/
    public static void main(String[] args) {
        Car[] car = { new Truck("货车",300,5),new Truck("大型货车",1000,20),
                new PassageCar("宝马Z4",3,2), new PassageCar("奥迪A8",2,5),
                new Pickup("江铃皮卡",1500,5,1),new Pickup("福特猛禽",2300,5,3)};
        System.out.println("您是否租车：1是    0否");

        System.out.println("以下是车辆信息，请您选择");
        for (int i = 0;i < car.length;i++) {
            System.out.print((i+1)+"、");
            car[i].list();
        }
    }
}
