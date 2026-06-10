
/*
Prove that you cannot access default property 
but access protected property from the subclass. */

class Phone{
    String brand = "Vivo";
    protected float balance = 100.23f;

    public void ringing(){
        System.out.println("Phone is ringing...");
    }

    public float getBalance() {
        return balance;
    }
}

class SmartPhone extends Phone{
    // brand = "Samsung"; -> This line will throw error.
    float vivoBalance = getBalance();
}

public class PS_12_q4 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        System.out.println(sp.vivoBalance);
    }
}
