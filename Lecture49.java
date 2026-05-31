/*
Dynamic method dispatch
*/

class Animal{

    public Animal() {
        System.out.println("Constructor in Animal class");
    }

    public void sound(){
        System.out.println("Playing sound....");
    }
}

class Dog extends Animal{

    public Dog() {
        System.out.println("Constructor in Dog class");
    }

    @Override
    public void sound(){
        System.out.println("Bark...");
    }

    public void fetch_ball(){
        System.out.println("Fetching ball....");
    }
}

public class Lecture49 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        animal1.sound();

        Animal animal2 = new Dog();

        animal2.sound();
        // animal2.fetch_ball();  -> This will produce an error.
        
    }
}
