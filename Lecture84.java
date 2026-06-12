/*
throw vs throws

-> throw = yeh ek exception throw karta hain...
-> throws = Yeh btata hain ki koi mehod ek particular exception throw kar sakta hain...
*/

import java.util.Scanner;

class NegativeNumberException extends Exception{

    @Override
    public String toString() {
        return "Number can't be negative";
    }

}
public class Lecture84 {

    public static void ageCheck(int age) throws NegativeNumberException{
        if (age<0){
            throw new NegativeNumberException();
        } else {
            System.out.println("Your age: "+age);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int x = sc.nextInt();

        try {
            ageCheck(x);
        } catch (NegativeNumberException e) {
            System.out.println(e);
        }

    }
}
