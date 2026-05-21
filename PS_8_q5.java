/*
Create a class TommyVecetti for Rockstar games
capable of hitting(print hitting...),running,firing etc.
*/

import java.util.Scanner;

class TommyVecetti{
    String name;
    int level;

    public TommyVecetti(String name, int level){
        this.name = name;
        this.level = level;
    }

    public void hit(){
        System.out.println(this.name+" is hitting...");
    }

    public void run(){
        System.out.println(this.name+" is running...");
    }

    public void fire(){
        System.out.println(this.name+" is firing...");
    }

}
public class PS_8_q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int level;

        System.out.print("Enter name: ");
        name = sc.next();

        System.out.print("Enter level: ");
        level = sc.nextInt();

        TommyVecetti player = new TommyVecetti(name, level);

        player.hit();
        player.run();
        player.fire();

    }
}
