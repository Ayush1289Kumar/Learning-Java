
import java.util.Scanner;

public class level5 {
    public static void main(String[] args) {
        // WAP to check whether a number is palindrome or not.
        // 121 -> palindrome, 123 -> not palindrome.

        Scanner sc = new Scanner(System.in);

        int num,temp,rem,rev=0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        temp =  num;
        while (temp>0){
            rem = temp%10;
            temp = temp/10;

            rev = rev*10 + rem;
        }

        if (rev == num){
            System.out.printf("%d is palindrome\n",num);
        } 

        else {
            System.out.printf("%d is not palindrome\n",num);
        }

        // WAP to print the fibonacci series up to n terms using a for loop.

        int a=0,b=1,n;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.printf("\nFibonacci series up to %d terms:",n);
        System.out.print(a+" ");
        for (int i=1;i<n;i++){
            int next = a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }

        sc.close();
    }
}
