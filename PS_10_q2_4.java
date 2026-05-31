/*
Create a class Rectangle and use inheritance to 
create another class cuboid. try to keep is as close 
to real world scenario as possible.
*/

class Rectangle{
    float length,breadth;

    public Rectangle( float l, float b) {
        this.length = l;
        this.breadth = b;
    }

    public float getLength() {
        return length;
    }

    public float getBreadth() {
        return breadth;
    }

    public double area(){
        return length*breadth;
    }
}

class Cuboid extends Rectangle{
    float height;

    public float getHeight() {
        return height;
    }

    public Cuboid(float l,float b,float h){
        super(l, b);
        this.height = h;
    }
    public double volume(){
        return area()*height;
    }

}
public class PS_10_q2_4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 7);
        System.out.println("Length: "+rect.getLength()+"\nBreadth: "+rect.getBreadth());
        System.out.println("Area: "+rect.area());

        Cuboid cub = new Cuboid(5, 7, 6);
        System.out.println("Length: "+cub.getLength()+"\nBreadth: "+cub.getBreadth()+"\nHeight: "+cub.getHeight());
        System.out.println("Volume: "+cub.volume());
    }
}
