
import java.util.Scanner;

public class level4 {
    
static double area(double radius){
    double PI = 3.14;

    double area = 2*PI*radius;
    return area;
}

static double area(double length,double breadth){
    double area = length*breadth;
    return area;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        q10.
        Write an overloaded method area() that:
        · Takes one double (radius) -> returns area of a circle
        · Takes two doubles (length, breadth) -> returns area of a rectangle
        */
        double radius,length,breadth;

        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();

        System.out.printf("\nArea of circle with radius %.2f is %.2f\n",radius,area(radius));

        System.out.print("Enter length: ");
        length = sc.nextDouble();

        System.out.print("Enter breadth:");
        breadth = sc.nextDouble();

        System.out.printf("Area with length %.2f and breadth %.2f is %.2f",length,breadth,area(length,breadth));

        sc.close();
    }
}
