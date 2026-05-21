/*
Create a class square,rectangle and circle with a method to initialize
its side, calculating area, perimeter etc... */


import java.util.Scanner;

class Square{
    float side;

    public Square(float side) {
        this.side = side;
    }

    public float area(){
        return side*side;
    }

    public float perimeter(){
        return 4*side;
    }
}

class Rectangle{
    float length,breadth;

    public Rectangle(float length, float breadth ){
        this.length = length;
        this.breadth = breadth;
    }

    public float area(){
        return length*breadth;
    }

    public float perimeter(){
        return 2*(length+breadth);
    }

}

class Circle{
    float PI=3.14f;
    float radius;

    public Circle(float radius){
        this.radius = radius;
    }

    public float area(){
        return PI*radius*radius;
    }

    public float perimeter(){
        return 2*PI*radius;
    }
}
public class PS_8_q3_4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chk;
        float radius, length, breadth, side;

        do { 
            System.out.println("Choose from the following: ");
            System.out.println("1.Square");
            System.out.println("2.Rectangle");
            System.out.println("3.Circle");
            System.out.println("Any negative number to exit");
            System.out.print("Your Choice: ");
            chk = sc.nextInt();
            System.out.println();

            if (chk == 1){
                System.out.print("Enter Side: ");
                side = sc.nextFloat();
                Square sq = new Square(side);
                System.out.println("Area: "+sq.area()+"\nPerimeter: "+sq.perimeter());
            }

            else if(chk == 2){
                System.out.print("Enter Length:");
                length = sc.nextFloat();
                System.out.print("\nEnter Breadth: ");
                breadth = sc.nextFloat();
                Rectangle rc = new Rectangle(length, breadth);
                System.out.println("Area: "+rc.area()+"\nPerimeter: "+rc.perimeter());
            }

            else if(chk== 3){
                System.out.print("Enter Radius: ");
                radius = sc.nextFloat();
                Circle c = new Circle(radius);
                System.out.println("Area: "+c.area()+"\nPerimeter: "+c.perimeter());
            }
        } while (chk > 0);
    }
}
