package Project2;

public class demo1 {
    public static void main(String[] args){

        //多态方法
        People p1 = new AmericaPeople();
        People p2 = new ChinesePeople();
        p1.Speak();
        p2.Speak();

        MoreOutgoing moreOutgoing = new AmericaPeople();
        moreOutgoing.fighting();
    }
}
