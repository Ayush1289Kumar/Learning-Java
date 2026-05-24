/*
Create a class Cylinder and use getters and setters
to set it radius and height.
- calculate surface area and volume of the cylinder.
- use of constructor.

do the same for a Sphere
*/

import java.util.Scanner;


class Cylinder{
    public static final float PI = 3.14f;
    private float radius,height;

    public Cylinder(){
        this.radius = 7;
        this.height = 14;
    }
    public Cylinder(float r, float h){
        this.radius = r;
        this.height = h;
        }

    public void setRadius(float  radius) {
        this.radius = radius;
    }

    public void setHeight(float  height) {
        this.height = height;
    }

    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }

    public float  surface_area(){
        return  2*PI*radius*(radius+height);
    }

    public float volume(){
        return PI*radius*radius*height;
    }
}

class Sphere{
    private float radius;

    public Sphere(float radius){
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float surface_area(){
        return 4*Cylinder.PI*radius*radius;
    }

    public float volume(){
        return (4.0f/3.0f)*Cylinder.PI*(radius*radius*radius);
    }

}
public class PS_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius, radius_,height;

        Cylinder cy1 = new Cylinder();
        System.out.println("Radius: "+cy1.getRadius());
        System.out.println("Height: "+cy1.getHeight());
        System.out.println("Surface Area: "+cy1.surface_area());
        System.out.println("Volume: "+cy1.volume());

        System.out.println();
        System.out.print("Enter radius: ");
        radius = sc.nextFloat();
        cy1.setRadius(radius);
        System.out.print("Enter height: ");
        height = sc.nextFloat();
        cy1.setHeight(height);
        System.out.println("New Surface Area: "+cy1.surface_area());
        System.out.println("New Volume: "+cy1.volume());

        Cylinder cy2 = new Cylinder(14,7);
        System.out.println("Radius: "+cy2.getRadius());
        System.out.println("Height: "+cy2.getHeight());
        System.out.println("Surface Area: "+cy2.surface_area());
        System.out.println("Volume: "+cy2.volume());

        System.out.print("Enter radius of sphere: ");
        radius_ = sc.nextFloat();
        Sphere s = new Sphere(radius_);
        System.out.println("Radius: "+s.getRadius());
        System.out.println("Surface Area: "+s.surface_area());
        System.out.println("Volume: "+s.volume());
        
        sc.close();
    }
}
