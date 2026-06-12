/*
finally block :
This block always run even if the program/methods 
returns or break in between.
*/


public class Lecture85 {
    public static double div(int a,int b) throws Exception{
        try {
            return a/b;
        } finally{
            System.out.println("Thanks for using...");
        }
    }

    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        try {
            double x = div(40,0);
            System.out.println(x);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Program finished...");
        }

        
        for (int i = 0;i<100;i=i+(2*2)){
            try {
                System.out.println(i);
                if (8==i) {break;}
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                System.out.println("Thanks for using....");
            }
            System.out.println("The number was: "+i);

        }

        }
    }

