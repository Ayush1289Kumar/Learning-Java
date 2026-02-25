

public class PS_6 {
    public static void main(String[] args) {
        // Create an array of 5 floats and calculate their sum.
        // float[] arr = {2.8f,5.2f,7.17f,8.01f,17.03f};
        // float sum=0;
        // for (float element:arr)
        //     sum+=element;
        
        // System.out.println(sum);

        // WAP to find out whether a given integer is present in an array or not.
        // int[] arr = {2,5,7,8,17};
        // boolean found = false;
        // int target;

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number to check: ");
        // target=sc.nextInt();

        // for (int i =0;i<arr.length;i++){
        //     if (arr[i]==target){
        //         System.out.printf("%d found at index: %d",target,i);
        //         found = true;
        //         break; 
        //     }
        // }
        // if (!found)
        //     System.out.printf("%d Not found",target);

        /*
        Calculate the average marks from an array containing
        marks of all students in physics using a for-each loop.
        */
        // int[]  marks = {79,34,82,90,76};
        // int total=0;
        // float avg;

        // for (int element:marks)
        //     total+=element;

        // avg = total/5.0f;

        // System.out.println("Average marks in physics: "+avg);
        
        // WAP to add two matrices of size 2x3.

        // int[][] matrix1 = {{1,2,3},{4,5,6}};
        // int[][] matrix2 = {{4,5,6},{7,8,9}};

        // for (int i=0;i<matrix1.length;i++){
        //     for (int j=0;j<matrix1[0].length;j++){
        //         System.out.print((matrix1[i][j]+matrix2[i][j])+"  ");
        //     }
        //     System.out.println();
        // }

        // WAP to reverse an array.
        // int[] arr = {2,5,7,8,17};
        // int len = arr.length;
        // int temp;
        
        // System.out.print("Original Array: ");
        // for(int element:arr)
        //     System.out.print(element+" ");
        // System.out.println();
        // for (int i = 0; i <len/2; i++) {
        //     temp=arr[i];
        //     arr[i]=arr[len-1-i];
        //     arr[len-1-i]=temp;
        // }
        
        // System.out.print("Reversed Array: ");
        // for(int element:arr)
        //     System.out.print(element+" ");
        // System.out.println();

        // WAP to find the maximum element in an array.
        // int[] arr = {2,5,2005,7,8,17};
        // int max = arr[0];

        // for (int element:arr){
        //     if (max<element){
        //         max = element;
        //     }
        // }
        // System.out.println("Maximum value of the array: "+max);

        // WAP to find whether an array is sorted or not.
        int[] arr = {2,3,6,87};
        boolean isSorted =  true;

        for (int i = 0;i<arr.length-1;i++){
            if (!(arr[i]<arr[i+1])){
                isSorted=false;
                break;}
        }
        if (isSorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted.");
    }   
}
