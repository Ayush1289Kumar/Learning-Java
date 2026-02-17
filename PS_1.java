import java.util.Scanner;

public class PS_1 {
    public static void main(String[] args) {
        // Problem set 1 solution.
        
        // W.A.P to sum  three numbers in java.
        // int num1, num2,num3,sum;
        Scanner sc =  new Scanner(System.in);

        // System.out.print("Enter first number: ");
        // num1 = sc.nextInt();

        // System.out.print("Enter second number: ");
        // num2 = sc.nextInt();

        // System.out.print("Enter third number: ");
        // num3 = sc.nextInt();

        // sum = num1+num2+num3;
        // System.out.println("Sum: "+sum);

        // W.A.P to calculate CGPA of three subjects (out of 100).

        // float phy, chem, math, cgpa;
        
        // System.out.print("Enter marks obtained in Physics: ");
        // phy = sc.nextFloat();

        // System.out.print("Enter marks obtained in Chemistry: ");
        // chem = sc.nextFloat();

        // System.out.print("Enter marks obtained in Maths: ");
        // math= sc.nextFloat();

        // cgpa = (phy+chem+math)/3 ;
        // System.out.println("CGPA (out of 100):"+cgpa);

        // W.A.P that asks the user for name, and greets them with "Hello <name>, have a good day" text

        // String name;
        // System.out.print("Enter your name: ");
        // name = sc.next();

        // System.out.println("Hello "+name+", have a good day");


        // W.A.P to convert kilometers to miles.

        // 1km = 0.621371
        // double km, mile;

        // System.out.print("Enter values in Km: ");
        // km= sc.nextDouble();

        // mile = 0.621371*km;

        // System.out.print("Value in Miles: "+mile);

        // W.A.P to check whether the input given by the user is integer or not.

        boolean isInt;
        System.out.print("Enter a number: ");

        isInt=sc.hasNextInt();
        
        System.out.println(isInt);
    }   
}
