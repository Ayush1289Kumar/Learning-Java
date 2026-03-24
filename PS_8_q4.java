// Create  a Rectangle class initialize its lenght,Breadth and calculate area, perimeter.
import java.util.Scanner;
public class PS_8_q4 {
    public static void main(String[] args) {
        float length,breadth;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();

        Rectangle rec = new Rectangle(length, breadth);
        System.out.print("Perimeter: "+rec.Perimeter());
        System.out.print("\nArea: "+rec.Area());
        
    }
}

class Rectangle{
    float length,breadth;
    public Rectangle(float  l, float  b) {
        this.length = l;
        this.breadth = b;
    }

    float Perimeter(){
        return 2*(length+breadth);
    }
    
    float Area(){
        return length*breadth;
    }
}