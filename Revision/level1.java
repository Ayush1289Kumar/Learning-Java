
public class level1 {
    public static void main(String[] args) {
        /*
        q1. WAP that takes  that takes a temperature in Celsius 
        and converts it to Fahrenheit.
        Store Celsius as a double.
        
        Formula :- F = (C*9/5)+32
        */
        // Scanner sc = new Scanner(System.in);
        // double celsius,fahrenheit;

        // System.out.print("Enter value in Celsius: ");
        // celsius=sc.nextDouble();

        // fahrenheit = (celsius*9/5)+32;

        // System.out.println("Value in Fahrenheit: "+fahrenheit);
        
        /*
        q2. WAP to swap two integers without using third variable.
        */

        int num1=17, num2=8;

        System.out.println("Before swapping:");
        System.out.println("Num1: "+num1+"   Num2: "+num2);

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;

        System.out.println("\nAfter swapping:");
        System.out.println("Num1: "+num1+"   Num2: "+num2);

    }
}
