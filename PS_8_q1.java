/*
Create a class Employee with following properties and methods.
- salary (property) (int)
- getSalary (method) (returning int)
- name (property) (string)
- getName (method) (returning string)
- setName (method) (changing name)
*/
import java.util.Scanner;

class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName( String newName){
        name = newName;
    }
}
public class PS_8_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an employee object
        Employee emp = new Employee();
        emp.salary = 1_32_0000;
        System.out.print("Enter a name: ");
        String name = sc.next();

        emp.setName(name);

        System.out.printf("Hello my name is %s and my salary is %d ",emp.name,emp.salary);
        
        sc.close();
    }
}
