package Project1;

public class SmartPhone extends  Telphone implements IPlayGames{
    @Override
    public void cell() {
        System.out.println("this is smartphone makes a call");
    }

    @Override
    public void message() {
        System.out.println("this is smartphone makes a message");
    }

    @Override
    public void playGame() {
        System.out.println("this is smartphone plays games");
    }
}
