
class Employee{
    int no;
    String name;
    static int countofEmployees;

    public Employee(){
        countofEmployees++;
    }

    public Employee(int no, String name) {
        this.no = no;
        this.name = name;
    }
}

public class staticvariable {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        Employee e4 = new Employee();
        System.out.println("No of employees: "+ Employee.countofEmployees);
    }
}
