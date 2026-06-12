/*
1. WAP to demonstrate syntax,logical & runtime errors. 

*/
public class PS_14_q1 {
    public static void main(String[] args) {
        int a = 16;
        // System.out.println(a) -> Syntax error

        System.out.println("Square : "+2*a); // Logical error: for square it should be a*a

        // int result = a/0; // Runtime error:- Division by zero...
    }
}
