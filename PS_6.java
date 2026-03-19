import java.util.Scanner;

public class PS_6 {
    public static void main(String[] args) {
        // WAP to Create an array of 5 floats and calculate their sum.
        // float[] nums = {2.0f,8.0f,17.0f,2.8f,17.8f};
        // float sum=0;

        // for(int i=0;i<nums.length;i++)
        // {
        //     sum+=nums[i];
        // }
        // System.out.println("Sum: "+sum);
        
        // WAP to find out whether a given integer is present in an array or not.
        // int[] arr = {2,8,17,1,0};
        // int length = arr.length;
        // boolean found = false;
        // int target;

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the target value: ");
        // target=sc.nextInt();

        // for (int i =0;i<length;i++)
        // {
        //     if (arr[i]==target)
        //         found = true;
        // }

        // if (found)
        //     System.out.printf("%d is present in the array.",target);

        // else
        //     System.out.printf("%d is not present in the array.",target);

        // WAP to Calculate the average marks from an array
        //  containing marks of all students in physics using a for-each loop.

        // int[] marks = {87,98,81,99,79};
        // int sum=0;
        // float avg;

        // for (int ele:marks){
        //     sum+=ele;
        // }
        // avg = (float) (sum/5.0);

        // System.out.println("Average: "+avg);

        // WAP to add two matrices of size 2x3.

        // int[][] matrix1 = {{1,2,3},{4,5,6}};

        // int[][] matrix2 = {{1,2,3},{4,5,6}};

        // int[][] result = {{0,0,0},{0,0,0}};

        // for (int i=0;i<2;i++){
        //     for (int j =0;j<3;j++){
        //         result[i][j] = matrix1[i][j]+matrix2[i][j];
        //     }
        // }

        // System.out.println("Matrix1:");
        // for (int i=0;i<2;i++){
        //     for (int j=0;j<3;j++)
        //         System.out.print(matrix1[i][j]+"\t");
        //     System.out.println();}

        // System.out.println("Matrix2:");

        //     for (int i=0;i<2;i++){
        //         for (int j=0;j<3;j++)
        //             System.out.print(matrix2[i][j]+"\t");
        //         System.out.println();}

        // System.out.println("Sum:");
        
        // for (int i=0;i<2;i++){
        //     for (int j=0;j<3;j++)
        //         System.out.print(result[i][j]+"\t");
        //     System.out.println();}

        // WAP to reverse an array.
        // int[] arr = {2,8,17,1,0};

        // int first = 0;
        // int last = arr.length - 1;
        
        // System.out.print("Original Array: ");
        // for (int ele:arr){
        //     System.out.print(ele+" ");
        // }
        // System.out.println();

        // while (first<last) {
        //     int temp = arr[first];

        //     arr[first] = arr[last];

        //     arr[last] = temp;

        //     first++;
        //     last--;
        // }

        // System.out.print("Reversed Array: ");
        // for (int ele:arr){
        //     System.out.print(ele+" ");
        // }

        // WAP to find the maximum element in an array.

        // int[] arr = {1,0,2,8,17};

        // int max = arr[0];

        // for (int ele:arr) {
        //     if (ele>max)
        //         max = ele;
        // }
        
        // System.out.println("Maximum element: "+max);

        // WAP to find the maximum and minimum element in java array.
        // System.out.println(Integer.MAX_VALUE);
        // System.out.println(Integer.MIN_VALUE);

        // WAP to find whether an array is sorted or not.
        int[] arr = {1,0,2,8,17};
        boolean isSorted = true;

        for (int i=1;i<arr.length;i++){
            if (!(arr[i-1]<arr[i]))
                isSorted = false;
        }

        if (isSorted)
            System.out.println("The Array is sorted.");

        else
            System.out.println("The Array is not sorted.");
    }
}
