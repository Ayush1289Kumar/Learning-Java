
/*
Create an interface TvRemote and use it to inherit 
another interface SmartTvRemote.

and

Create a class Tv which implements TvRemote interface */

interface TvRemote{
    default void start(){
        System.out.println("Starting Tv...");
    }
    void volumeUp(int x);
    void volumeDown(int y);
    void changeChannel(int n);
}

interface SmartTvRemote extends TvRemote{
    void openVoiceSearch();
    void networkConnect(String wifi);
}

class Tv implements TvRemote,SmartTvRemote{

    @Override
    public void volumeUp(int x) {
        System.out.println("Increasing volume by "+x);
    }

    @Override
    public void volumeDown(int y) {
        System.out.println("Decreasing volume by "+y);
    }

    @Override
    public void changeChannel(int n) {
        System.out.println("Channel changed to "+n);
    }

    @Override
    public void openVoiceSearch() {
        System.out.println("Opening Voice search....");
    }

    @Override
    public void networkConnect(String wifi) {
        System.out.println("Connecting network to "+wifi);
    }

}
public class PS_11_q6_7 {
    public static void main(String[] args) {
        Tv newTv = new Tv();

        newTv.start();
        newTv.volumeUp(5);
        newTv.volumeDown(2);
        newTv.changeChannel(133);
        newTv.openVoiceSearch();
        newTv.networkConnect("Airtel-5G");
    }
}
