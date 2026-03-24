// Create a class TommyVecetti for Rockstar games capable of 
// hitting(print hitting...), running,firing, etc.
import java.util.Scanner;

public class PS_8_q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of character: ");
        String character = sc.nextLine();

        TommyVecetti new_character = new TommyVecetti(character);

        new_character.hitting();
        new_character.running();
        new_character.firing();
    }
}

class TommyVecetti{
    String character;

    public TommyVecetti(String character){
        this.character = character;
    }

    void hitting(){
        System.out.println(character+" is Hitting...");
    }

    void running(){
        System.out.println(character+" is Running...");
    }

    void firing(){
        System.out.println(character+" is Firing...");
    }
}
