/*
We can write custom exception at our own using Exception class..

-> getMessage() = prints the exception message.
-> toString() = executed when print(e) is ran.
-> printStackTrace() = prints stack tree of exceptions.

*/

import java.util.Scanner;

class myException extends Exception{
    @Override
    public String toString() {
        return "This is toString()";
    }

    @Override
    public String getMessage() {
        return "This is getMessage()";
    }

}
public class Lecture83 {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        a= sc.nextInt();

        if (a<9){
            try {
                throw new myException();
            } catch (myException e) {
                // System.out.println(e);
                // System.out.println(e.getMessage());
                // System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
