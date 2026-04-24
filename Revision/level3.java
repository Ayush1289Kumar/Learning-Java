import java.util.Scanner;

public class level3 {
    public static void main(String[] args) {
        // q6. Print the multiplication of any number using for loop.
        Scanner sc = new Scanner(System.in);

        // int num;
        // System.out.print("Enter num: ");
        // num = sc.nextInt();

        // for (int i = 1; i <= 10; i++) {
        //     System.out.printf("%d x %d = %d\n",num,i,i*num);
        // }

        /*
        q7. Print the following pattern using nested for loops:
        *
        * *
        * * *
        * * * *
        * * * * *
        */

        // for (int i = 1;i<=5;i++){
        //     for (int j = 0;j<i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // q8. WAP to print all prime numbers between 1 and 50 using for loop.

        // for (int i = 2;i<50;i++){
        //     int j;
        //     for (j = 2;j<=i;j++){
        //         if (i%j==0){
        //             break;
        //         }
        //     }
        //     if (j==i){
        //         System.out.printf("%d ",i);
        //     }
        // }

        // q9. WAP using a while loop that finds the sum of digits of a number.
        // e.g:-   1234 -> 1+2+3+4 = 10

        int num,rem,sum=0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num>0){
            rem = num%10;
            sum+=rem;
            num = num/10;
        }
        System.out.println("Sum of digits: "+sum);

    }
}
