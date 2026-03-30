/*
q1.
Create a class Cylinder 
and use getters and setters to set its radius and height.

q2.
Calculate surface area and volume of the cylinder.

q3.
Use constructor.
*/

import java.util.Scanner;

class Cylinder{
    float PI = 3.14f;
    int radius,height;

    public Cylinder(){

    }
    public Cylinder(int r, int h){
        radius = r;
        height = h;
    }
    int get_radius(){
        return radius;
    }

    int get_height(){
        return height;
    }

    void set_radius(int r){
        this.radius = r;
    }

    void set_height(int h){
        this.height = h;
    }

    float surface_area(int r,int h){
        return 2*PI*r*(r+h);
    }

    float volume(int r,int h){
        return PI*r*r*h;
    }
}
public class PS_9 {
    public static void main(String[] args) {
        int r,h;
        
        Cylinder c1 = new Cylinder();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of cylinder: ");
        r = sc.nextInt();

        System.out.print("Enter height of cylinder: ");
        h = sc.nextInt();

        c1.set_radius(r);
        c1.set_height(h);

        System.out.println("Radius: "+c1.get_radius());
        System.out.println("Height: "+c1.get_height());

        System.out.println("Surface Area: "+c1.surface_area(r, h));
        System.out.println("Volume: "+c1.volume(r, h));

        int r1=c1.get_radius()+5;
        int h1=c1.get_height()+6;

        Cylinder c2 = new Cylinder(r1, h1);

        System.out.println("New Radius: "+c2.get_radius());
        System.out.println("New Height: "+c2.get_height());

    }
}
