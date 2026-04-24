import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        /*
        q3.
        Write a program that takes a String name and prints:
        •  "Hello, [name]!" — if name length is less than 5
        •  "That's a long name, [name]!" — if 5 or more
        Use .length() and an if-else.
        */
        
        Scanner sc = new  Scanner(System.in);

        // String name;

        // System.out.print("Enter a name: ");
        // name = sc.nextLine();

        // int length = name.length();

        // if (length<5){
        //     System.out.printf("Hello, %s",name);
        // }

        // else {
        //     System.out.printf("That's a long name, %s",name);
        // }

        /*
        q4.
        Write a program using a switch statement that takes an integer
        day (1—7) and prints the day name.
        For anything outside 1—7, print "Invalid day".
        */
        
        // int day;

        // System.out.print("Enter day(1-7): ");
        // day = sc.nextInt();

        // switch (day) {
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Enter a valid day.");
        // }

        /*
        q6.
        Write a program that checks if a given year is a leap year.
        Rules:
        • Divisible by 4
        • BUT not by 100
        • UNLESS also divisible by 400
        */

        long year;

        System.out.print("Enter year: ");
        year = sc.nextLong();

        if ((year%4==0 || year%400==0) && year%100!=0){
            System.out.printf("%d is a Leap year",year);
        }
        else{
            System.out.printf("%d is Not a Leap year",year);
        }
    }
}
