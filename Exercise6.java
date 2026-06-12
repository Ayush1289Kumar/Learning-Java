/*
You have to create a custom calculator with following operations: 
-> Addition
-> Subtraction
-> Multiplication
-> Division

which throws the following exceptions:
1. Invalid input exception , e.g: 8 & 9
2. Cannot divide by 0 exception
3. Max input exception if any of the value is greater than 100000
4. Max Multiplier Reached Exception - 
Don't allow any multiplication input to be greater than 7000

*/

import java.util.Scanner;

class InvalidInputException extends Exception{

    @Override
    public String toString() {
        return "Invalid input only(+,-,*,/) is allowed.";
    }
}

class DivideByZeroException extends Exception{

    @Override
    public String toString() {
        return "Divide by 0 is not allowed.";
    }
    
}
class MaxInputException extends Exception{

    @Override
    public String toString() {
        return "Input value can't be greater than 1_00_000";
    }
    
}

class MaxMultiplierReachedException extends Exception {

    @Override
    public String toString() {
        return "Value can't be greater than 7000";
    }
    
}

class Calculator{
    public double Addition(double x, double y) throws MaxInputException{
        if (x>1_00_000 || y>1_00_000) {
            throw new MaxInputException();
        }
        return x+y;
    }

    public double Subtraction(double x, double y) throws MaxInputException{
        if (x>1_00_000 || y>1_00_000) {
            throw new MaxInputException();
        }
        return x-y;
    }
    public double Multiplication(double x,double y) throws MaxInputException,MaxMultiplierReachedException {
        
        if (x > 7000 || y > 7000) {
            throw new MaxMultiplierReachedException();
        }

        return x*y;
    }

    public double Division(double x, double y) throws MaxInputException,DivideByZeroException {
        
        if (x>1_00_000 || y>1_00_000) {
            throw new MaxInputException();
        }
        if (0==y){
            throw new DivideByZeroException();
        }
        return x/y;
    }
}
public class Exercise6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            
            System.out.print("Enter Operation: ");
            sc.nextLine();
            String op = sc.nextLine();

            switch (op){
                case "+" -> System.out.println(c.Addition(num1, num2));
                case "-" -> System.out.println(c.Subtraction(num1, num2));
                case "*" -> System.out.println(c.Multiplication(num1, num2));
                case "/" -> System.out.println(c.Division(num1, num2));
                default -> throw new InvalidInputException();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        }
    }