/* 
Create an abstract class Pen with methods 
write() and refill() as abstract methods

and 

use pen class to create FountainPen class with additional methods.
*/


import java.util.Scanner;
abstract class Pen{
    
    String penColor = "Blue";

    abstract public void write();

    abstract public void refill();

}

class FountainPen extends Pen{
    @Override
    public void write() {
        System.out.println("Writing....");
    }

    @Override
    public void refill() {
        System.out.println("Refilling "+penColor+" ink");
    }

    public void changeInk(String inkColor){
        this.penColor = inkColor;
    }

    public String getPenColor() {
        return penColor;
    }

}
public class PS_11_q1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FountainPen fpen =  new FountainPen();

        System.out.println("Pen color: "+fpen.getPenColor());
        fpen.write();
        fpen.refill();
        
        System.out.print("Enter the color of new ink: ");
        String ink = sc.nextLine();
        fpen.changeInk(ink);
        System.out.println("Pen color: "+fpen.getPenColor());
        fpen.write();
        fpen.refill();
    }
}
