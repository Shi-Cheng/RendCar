package Project1;

public class demo {

    public static void main(String[] args){

        Telphone telphone1 = new CellPhnoe();
        Telphone telphone2 = new SmartPhone();
        telphone1.cell();
        telphone1.message();
        telphone2.cell();

        telphone2.message();
        IPlayGames iPlayGames = new SmartPhone();
        iPlayGames.playGame();

        IPlayGames psp = new Psp();
        psp.playGame();

    }

}
