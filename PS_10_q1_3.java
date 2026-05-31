/*
Create a class circle and use inheritance
to create another class Cylinder from it.
 */

class Circle{
    float radius;
    public Circle(float r){
        this.radius = r;
    }

    double area(){
        return Math.PI*radius*radius;
    }
}

class Cylinder extends Circle{
    float height;
    public Cylinder(float r,float h){
        super(r);
        this.height = h;
    }

    double volume(){
        return area()*height;
    }
}

public class PS_10_q1_3 {
    public static void main(String[] args) {
        
        Circle c1 = new Circle(7);
        Cylinder cy1 = new Cylinder(7, 10);

        System.out.println("Radius of circle: "+c1.radius);
        System.out.println("Area of circle: "+c1.area());
        System.out.println("Radius of cylinder: "+cy1.radius+"\nHeight of cylinder: "+cy1.height);
        System.out.println("Volume of cylinder: "+cy1.volume());
    }
}
