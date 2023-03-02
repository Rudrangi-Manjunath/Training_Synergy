import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class student2{
    String name;
    Integer classroom;
    Integer marks;

    public student2(String name, Integer classroom, Integer marks) {
        this.name = name;
        this.classroom = classroom;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClassroom() {
        return classroom;
    }

    public void setClassroom(Integer classroom) {
        this.classroom = classroom;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

}

class Employee{
    String name;
    String department;
    Integer salary;

    public Employee(String name, String department, Integer salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}


public class problem3 {
    public static <Department> void main(String[] args) {
        student2 s1 = new student2("nani",5,65);
        student2 s2 = new student2("shiva",6,100);
        student2 s3 = new student2("shashi",7,99);

        List<student2> l = Arrays.asList(s1,s2,s3);
        List<student2> p = l.stream().filter(s -> s.getMarks()>90).collect(Collectors.toList()) ;
        for(student2 s:p){
            System.out.println(s.getName()+": "+s.getMarks());
        }
        Integer res = l.stream().reduce(0,(a,b) -> a+b.getMarks(),Integer::sum);
        System.out.println(res);

        Employee e1 = new Employee("rakesh","ECE",20000);
        Employee e2 = new Employee("mukesh","EEE",15000);
        Employee e3 = new Employee("suresh","CSE",10000);
        Employee e4 = new Employee("naresh","CSE",15000); 

        List<Employee> l2 = Arrays.asList(e1,e2,e3,e4);
        Integer res1 = l2.stream().reduce(0,(a,b) -> a+b.getSalary(),Integer::sum);
        System.out.println(res1);

        Map<String,List<Employee>> m =l2.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        m.entrySet().forEach(me -> {
            System.out.print("Branch: " + me.getKey());
            System.out.print(" Employees: ");
            me.getValue().forEach(s -> System.out.print(s.getName() + " "));
            System.out.println();
        });
        Map<String,List<String>> m1 =l2.
                stream().
                collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        System.out.println(m1);


        Map<String,Integer> m2 =l2.
                stream().
                collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingInt(Employee::getSalary)));
        System.out.println(m2);
    }
}
