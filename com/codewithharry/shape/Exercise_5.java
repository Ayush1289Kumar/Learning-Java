/*
You have to create a package named,  com.codewithharry.shape
This package should have individual classes for 
- rectangle, square, circle,cyllinder & sphere.
These classes should use inheritance to properly manage the code!
Include methods like volume,perimeter,area,surface area and getters/setters for dimensions.
*/

interface  shape{
    float perimeter();
    float area();
    float surfaceArea();
    float volume();
}
class Rectangle implements  shape{
    float length;
    float breadth;

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public float perimeter(){
        return 2*(this.length+this.breadth);
    }

    @Override
    public float area(){
        return this.length*this.breadth;
    }

    @Override
    public float surfaceArea() {
        System.out.println("Rectangle don't have surface area");
        return 0.0f;}

    @Override
    public float volume() {
        System.out.println("Rectangle don't have volume");
        return 0.0f; }
}

class Square implements shape{
    float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float perimeter(){
        return 4*this.side;
    }

    @Override
    public float area(){
        return this.side*this.side;
    }

    @Override
    public float surfaceArea() {
        System.out.println("Square don't have surface area");
        return 0.0f;}

    @Override
    public float volume() {
        System.out.println("Square don't have volume");
        return 0.0f; }
}

class Circle implements shape{
    float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float perimeter(){
        return (float) (2*Math.PI*this.radius);
    }

    @Override
    public float area(){
        return (float) (Math.PI*Math.pow(this.radius, 2));
    }

    @Override
    public float surfaceArea() {
        System.out.println("Circle don't have surface area");
        return 0.0f;}

    @Override
    public float volume() {
        System.out.println("Circle don't have volume");
        return 0.0f; }
}

class Cyllinder implements shape{
    float radius,height;

    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float surfaceArea(){
        return (float) (2*Math.PI*this.radius*(this.radius+this.height));
    }

    @Override
    public float volume(){
        return (float) ((float) Math.PI*Math.pow(this.radius, 2)*this.height);
    }

    @Override
    public float perimeter(){
        System.out.println("Cyllinder don't have perimeter.");
        return 0.0f;
    }

    @Override
    public float area(){
        System.out.println("Cyllinder don't have area.");
        return 0.0f;
    }
}

class Sphere implements shape{
    float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float surfaceArea(){
        return (float) (4*Math.PI*Math.pow(this.radius, 2));
    }
    
    @Override
    public float volume(){
        return (float) ((4.0/3.0)*Math.PI*Math.pow(this.radius, 3));
    }

    @Override
    public float perimeter(){
        System.out.println("Sphere don't have perimeter.");
        return 0.0f;
    }

    @Override
    public float area(){
        System.out.println("Sphere don't have area.");
        return 0.0f;
    }
}
public class Exercise_5 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Square sq =  new Square();
        Circle c = new Circle();
        Cyllinder cy = new Cyllinder();
        Sphere s = new Sphere();

        rec.setLength(4);
        rec.setBreadth(5);
        System.out.println("---Rectangle---");
        System.out.println("Length: "+rec.getLength());
        System.out.println("Breadth: "+rec.getBreadth());
        System.out.println("Perimeter: "+rec.perimeter());
        System.out.println("Area: "+rec.area());
        System.out.println("Surface Area: "+rec.surfaceArea());
        System.out.println("Volume: "+rec.volume());
        
        sq.setSide(3);
        System.out.println("\n---Square---");
        System.out.println("Side: "+sq.getSide());
        System.out.println("Perimeter: "+sq.perimeter());
        System.out.println("Area: "+sq.area());
        System.out.println("Surface Area: "+sq.surfaceArea());
        System.out.println("Volume: "+sq.volume());

        c.setRadius(7);
        System.out.println("\n---Circle---");
        System.out.println("Radius: "+c.getRadius());
        System.out.println("Perimeter: "+c.perimeter());
        System.out.println("Area: "+c.area());
        System.out.println("Surface Area: "+c.surfaceArea());
        System.out.println("Volume: "+c.volume());

        cy.setHeight(10);
        cy.setRadius(7);
        System.out.println("\n---Cyllinder---");
        System.out.println("Radius: "+cy.getRadius());
        System.out.println("Height: "+cy.getHeight());
        System.out.println("Perimeter: "+cy.perimeter());
        System.out.println("Area: "+cy.area());
        System.out.println("Surface Area: "+cy.surfaceArea());
        System.out.println("Volume: "+cy.volume());

        s.setRadius(8);
        System.out.println("\n---Sphere---");
        System.out.println("Radius: "+s.getRadius());
        System.out.println("Perimeter: "+s.perimeter());
        System.out.println("Area: "+s.area());
        System.out.println("Surface Area: "+s.surfaceArea());
        System.out.println("Volume: "+s.volume());

    }
}
