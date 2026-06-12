/*
WAP that prints "haha" during Arithmetic Exception
and "hehe" during an Illegal argument exception. */

import java.util.Scanner;

public class PS_14_q2 {

    public static void checkArgument(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers not allowed!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            checkArgument(a);

            try {
                int result = 5000/a;
            } catch (ArithmeticException e) {
                System.out.println("HaHa");
            }
        } catch (IllegalArgumentException e){
            System.out.println("HeHe");
        } finally {
            sc.close();
        }
    }
}
