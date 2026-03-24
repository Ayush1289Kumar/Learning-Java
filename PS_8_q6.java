// Create  a class square with a method to initialize its radius, calculate area, perimeter etc.
import java.util.Scanner;
public class PS_8_q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius;

        System.out.print("Enter radius: ");
        radius = sc.nextInt();

        Circle c1 = new Circle(radius);

        System.out.println("Perimeter: "+c1.perimeter());
        System.out.println("Area: "+c1.area());
        
    }
}

class Circle{
    int radius;
    float PI = 3.14f;

    public Circle(int a) {
        this.radius = a;
    }

    float perimeter(){
        return 2*PI*radius;
    }

    float area(){
        return PI*(radius*radius);

    }
}