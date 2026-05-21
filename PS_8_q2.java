

/*
Create a class cellphone with methods to 
print "ringing...","vibrating..." etc
*/

class Cellphone{
    void ring(){
        System.out.println("Phone is ringing...");
    }

    void vibrate(){
        System.out.println("Phone is vibrating...");
    }
}
public class PS_8_q2 {
    public static void main(String[] args) {
        // Creating an object of the class cellphone.
        Cellphone cp = new Cellphone();

        cp.ring();
        cp.vibrate();
        
    }
}
