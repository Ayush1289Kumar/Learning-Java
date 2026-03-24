// Create  a class square with a method to initialize its side, calculate area, perimeter etc.
import java.util.Scanner;
public class PS_8_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side;

        System.out.print("Enter side: ");
        side =  sc.nextInt();
        
        Square s1 = new Square(side);

        System.out.println("Perimeter: "+s1.perimeter());
        System.out.println("Area: "+s1.area());
        
    }
}

class Square{
    int side;
    float per,ar;

    public Square(int a) {
        this.side = a;
    }

    float perimeter(){
        per = 4*side;
        return per;
    }

    float area(){
        ar = side*side;
        return ar;

    }
}