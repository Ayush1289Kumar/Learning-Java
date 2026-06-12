/*
3. WAP that allows you to keep accessing an array until a valid index
is given. if max retries exceed 5 print "Error".

4. Throw a custom Exception if max retries are reached.

5. wrap inside a function which throws your custom exception.

*/

import java.util.Scanner;

class MaxTryReachedException extends Exception{

    @Override
    public String toString() {
        return "Maximum try reached...";
    }
}
public class PS_14_q3_4_5 {

    public static void accessArray(int[] arr) throws MaxTryReachedException{
        int attempt = 0;
        Scanner sc = new Scanner(System.in);
        boolean success = false;

        while (attempt<5){
            System.out.print("Enter a index: ");
            int idx = sc.nextInt();

            try {
                int key = arr[idx];
                System.out.println(key);
                success = true;
                break;
            } catch (IndexOutOfBoundsException e) {
                // System.out.println(idx+" is out of bound...");
                attempt++;
            }
        }

        if (!success){
            System.out.println("Error");
            throw new MaxTryReachedException();
        }
        
    }
    public static void main(String[] args) {
        int[] num = {37,38,35,36,33};

        try {
            accessArray(num);
        } catch (MaxTryReachedException e) {
            System.out.println(e);
        }
    }
}
