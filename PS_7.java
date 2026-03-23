import java.util.Scanner;

public class PS_7 {

    static void  multiplication(int num){
        System.out.println("Mulitplication table of "+num+" : ");
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",num,i,num*i);
        }
    }

    static void pattern1(int num){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int num){
        for (int i = num; i !=0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int cal_sum_rec(int n){
        if (n<=1)
            return 1;
        return n+cal_sum(n-1);
    }
    
    static int fibo(int n){
        if (n==0 || n==1)
            return n;

        return fibo(n-1) + fibo(n-2);
    }

    static float avg(int ...arr){
        float result;
        float sum = 0;

        for (float ele:arr){
            sum+=ele;
        }
        result = sum/(float) arr.length;

        return result;
    }

    static void pattern1_rec(int n){
        if (n == 0) return;
        
        pattern1_rec(n-1);

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        
    }

    static void pattern2_rec(int n){
        if (n == 0) return;

        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        pattern2_rec(n-1);
    }

    static int cal_sum(int n){
        int result=0;

        for (int i = 0;i<=n;i++)
            result+=i;
        return result;
    }
    static float celsiusToFahrenheit(float c){
        float f;
        f = (c*9/5)+32;

        return f;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Write a java method to print multiplication table of a number.
        // int num;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // num =  sc.nextInt();
        // multiplication(num);

        // Write a java method to print the following patern.
        /* 
        *
        * *
        * * *
        * * * *
        */
        // System.out.print("Enter number of rows to print in the pattern: ");
        // num =  sc.nextInt();
        // pattern1(num);

        // Write a recursive function to calculate sum of first n natural numbers.
        // System.out.print("Enter n: ");
        // num = sc.nextInt();

        // int result = cal_sum_rec(num);

        // System.out.printf("Sum of first %d Natural numbers: %d",num,result);
        
        // Write a java method to print the following patern.
        /* 
        * * * *
        * * *
        * *
        * 
        */
        // System.out.print("Enter number of rows to print in the pattern: ");
        // num =  sc.nextInt();
        // pattern2(num);

        // Write a function to print nth term of fibonacci series using recursion.
        // System.out.print("Enter n: ");
        // num=sc.nextInt();

        
        // int result = fibo(num);
        // System.out.printf("%d term of fibonacci series: %d\n",num,result);

        // System.out.print("First 10th term of fibonaaci series: ");
        // for (int i=1;i<=10;i++){
        //     System.out.print(fibo(i)+" ");
        // }

        // write a function to find average of  a set of numbers passed as arguments.
        // float result;

        // result = avg(5,7,2,3,1);
        // System.out.println("Avg: "+result);

        // Write a recursive program to print the upright star pattern.

        // int num;
        // System.out.print("Enter number of rows: ");
        // num = sc.nextInt();

        // pattern1_rec(num);

        // Write a recursive program to print the downright star pattern.

        // pattern2_rec(num);

        // Write a function to convert celsius temperature into fahrenheit.
        // f = (c*9/5)+32

        // float c,f;

        // System.out.print("Enter Temperature in Celsius: ");
        // c = sc.nextInt();

        // f = celsiusToFahrenheit(c);
        // System.out.print("Temperature in Fahrenheit: "+f);

        // write a function to calculate sum of first n natural numbers.

        int n,result;
        System.out.print("Enter n: ");
        n = sc.nextInt();

        result = cal_sum(n);

        System.out.printf("Sum of first %d natural numbers: %d",n,result);


    }   
}
