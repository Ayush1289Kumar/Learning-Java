import java.util.Scanner;

public class Lecture18 {
    public static void main(String[] args) {
        System.out.println("\n-----Switch cases-----\n");
        
        int marks;

        Scanner sc =  new  Scanner(System.in);
        System.out.print("Enter marks: ");
        marks=sc.nextInt();

        switch (marks){
            
            case 99 -> {System.out.print("You were the Topper of this subject\t");
                        System.out.println("Computer Science");}
            
            case 96 -> System.out.println("Physical Education");

            case 91 -> System.out.println("English");
            
            case 84 -> System.out.println("Chemistry");
            
            case 79 -> System.out.println("Physics");
            
            case 78 -> System.out.println("Maths");
            
            default -> System.out.println("Not your marks!!!");
        }
    }
}
