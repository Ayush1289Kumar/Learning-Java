
// Create a class cellphone with methods to print "ringing...","vibrating..." etc
public class PS_8_q2 {
    public static void main(String[] args) {
        Cellphone c = new Cellphone();
        c.setBattery(99);
        int battery_health = c.getBattery();

        c.ring();
        c.vibrate();
        boolean battery_low = c.isBatteryLow();

        String brand = c.getBrand();
        System.out.println("Battery health: "+battery_health);
        System.out.println("Is Battery low: "+battery_low);
        System.out.println("Brand: "+brand);
        
    }
}

class Cellphone{
    String brand_name = "Vivo";
    int battery;
    void ring(){
        System.out.println("Your phone is ringing...");
    }

    void vibrate(){
        System.out.println("Your phone is vibrating...");
    }

    boolean isBatteryLow(){
        if (battery <=20){
            return true;
        }
        else 
            return false;
    }

    int getBattery(){
        return battery;
    }

    void setBattery(int new_battery){
        battery = new_battery;
    }

    String getBrand(){
        return brand_name;
    }
}