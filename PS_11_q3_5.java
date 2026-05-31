/*
Create a class Monkey with jump() and bite() methods.
Create a class Human which inherits this Monkey class
and implements BasicAnimal interface with eat() sleep() methods.

and
Demonstrate polymorphism using monkey class

*/

import  java.util.Scanner;

interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Jumping....");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}

class Human extends Monkey implements BasicAnimal{
    
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
    
    public void watchAnime(){
        System.out.println("Watching anime in 4k...");
    }
}
public class PS_11_q3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Polymorphism---");
        
        BasicAnimal human = new Human();
        System.out.println("When created BasicAnimal from Human class");
        human.eat();
        human.sleep();
        // human.watchAnime(); not allowed

        Monkey monkey = new Human();
        System.out.println("\nWhen created monkey from Human class");
        monkey.bite();
        monkey.jump();
        // monkey.watchAnime(); --> not allowed

        Human H = new Human();
        System.out.println("\nWhen created a human.");
        H.eat();
        H.bite();
        H.jump();
        H.sleep();
        H.watchAnime();

    }
}
