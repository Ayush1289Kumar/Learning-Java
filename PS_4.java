import java.util.Scanner;
public class PS_4 {
    public static void main(String[] args) {
        /* 1. What will be the output of this program: 

        int a = 10;
        if (a=11)
                System.out.println(“I am 11”);
        else
                System.out.println(“I am not 11”);
        */
        // Error because there should a==11 not a=10,
        //  this means assigning value of 10 to a 
        // but we want to check whether it is equal or not so for that purpose 
        // we will have to use == instead of =

        /*
        2.Write a program to find out whether a student is pass or fail; 
        if it requires a total of 40% and at least 33% in each subject to pass.
        Assume 3 subjects and take marks as input from the user.
        */
        // int maths,phy,chem;

        // float percentage;

        // int pass_check = 1;

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter marks obtained in Maths: ");
        // maths=sc.nextInt();

        // System.out.print("Enter marks obtained in Physics: ");
        // phy=sc.nextInt();

        // System.out.print("Enter marks obtained in Chemistry: ");
        // chem=sc.nextInt();

        // percentage = (maths+phy+chem)/3;

        
        // if (maths<33 || phy <33 || chem<33) {
        //     pass_check=0;
        // }
        // else if(percentage<40){
        //     pass_check = 0;
        // }

        // if (pass_check==0){
        //     System.out.println("You are failed");
        // }
        
        // else
        //     System.out.println("Your Percentage: "+percentage);

        /*
        Calculate income tax paid by an employee to the government
        as per the slabs mentioned below:
                
        Income Slab	Tax
        2.5L – 5.0L  	5%
        5.0L – 10.0L 	20%
        Above 10.0L	    30%

        */
        // float income,tax;

        // System.out.print("Enter your early Income: ");
        // income=sc.nextFloat();

        // if (income >=2_50_000 && income < 5_00_000){
        //     tax = income*5/100;
        //     System.out.println("Your Income tax: "+tax);
        // }
        // else if(income >=5_50_000 && income < 10_00_000){
        //     tax = income*20/100;
        //     System.out.println("Your Income tax: "+tax);
        // }
        // else if(income>10_00_000){
        //     tax = income*30/100;
        //     System.out.println("Your Income tax: "+tax);
        // }
        // else{
        //     System.out.println("You are tax free!!!");
        // }

        /*
        Write a Java program to find out the day of the week given the number 
        [1 for Monday, 2 for Tuesday … and so on!]
        */
        // int day;
        // System.out.print("Enter day number: ");
        // day=sc.nextInt();

        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Please Enter a valid week day number.");
        // }
        
        /*
        Write a Java program to find whether a year entered by the user is a leap year or not.
        */
        // int year;
        // System.out.print("Enter year: ");
        // year= sc.nextInt();

        // if(year%4==0 && year%100!=0 || year%400==0){
        //     System.out.println("Leap Year");
        // }
        // else {
        //     System.out.println("Not a Leap Year");
        // }

        /*
        Write a program to find out the type of website from the URL:
        .com – commercial website
        .org – organization website
        .in – Indian website
        */

        // String website;
        // System.out.println("Enter a website: ");
        // website=sc.next();

        // if (website.endsWith(".com")){
        //     System.out.println("Commercial Website");
        // }
        // else if(website.endsWith(".org")){
        //     System.out.println("Organization Website");
        // }
        // else if(website.endsWith(".in")){
        //     System.out.println("Indian Websie");
        // }
    }

}
