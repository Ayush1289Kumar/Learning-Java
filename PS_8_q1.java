// Create a class employee with following properties and method.
// salary (property) (int)
// getSalary (method) (returning int)
// name (property) (String)
// getName (method) (returning String)
// setName (method) (changing name)

public class PS_8_q1 {
    public static void main(String[] args) {
        int salary;
        String name;

        Employee emp = new Employee();
        salary = emp.getSalary();
        System.out.println("Salary: "+salary);

        emp.setName("Hakari");
        name = emp.getName();
        System.out.println("Name: "+name);

    }
}

class Employee {
    int salary=1_45_000;
    String name;

    int getSalary(){
        return salary;
    }

    String getName(){
        return name;
    }

    void setName(String s){
        name = s;
    }
}
