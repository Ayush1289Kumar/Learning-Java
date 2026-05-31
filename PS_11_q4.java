/*
Create a class TelePhone with ring(),lift() and disconnect() methods
as abstract methods create another class SmartPhone and 
demonstrate polymorphism

*/
abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}

class SmartPhone extends TelePhone{

    @Override
    public void ring() {
        System.out.println("Ringing...");
    }

    @Override
    public void lift() {
        System.out.println("Lifting...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting...");
    }
    
    public void camera(){
        System.out.println("Opening Camera...");
    }
    
}
public class PS_11_q4 {
    public static void main(String[] args) {

        TelePhone tp = new SmartPhone();
        System.out.println("When using Smartphone as Telephone: ");
        tp.ring();
        tp.lift();
        tp.disconnect();

        // tp.camera(); --> not allowed as camera method is in Smartphone class 
        // not in Telephone class, and humne Telephone class ke reference
        // se Smartphone ka object banaya hain.
        // i.e  Here is a smartphone but use it as a telephone only...

        System.out.println("\nWhen using as complete Smartphone: ");
        SmartPhone sp = new SmartPhone();

        sp.ring();
        sp.lift();
        sp.disconnect();
        sp.camera();


    }
}
