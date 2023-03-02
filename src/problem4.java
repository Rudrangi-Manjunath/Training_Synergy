import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Student{
    String name;
    Integer age;
    Integer marks;

    public Student(String name, Integer age, Integer marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMarks() {
        return marks;
    }
}

public class problem4 {
    public static void main(String[] args) {
       Student s1 = new Student("naresh",15,56);
       Student s2 = new Student("mukesh",12,67);
       Student s3 = new Student("naveen",14,78);



       Student s4 = new Student("naresh",15,78);
       Student s5 = new Student("mukesh",12,14);
       Student s6 = new Student("mahesh",16,56);



        Stream<Student> stream1 = Stream.of(s1,s2,s3);
        Stream<Student> stream2 = Stream.of(s4,s5,s6);

        Map<String,Double> mp = Stream.concat(stream1,stream2).collect(Collectors.groupingBy(Student::getName,Collectors.averagingDouble(Student::getMarks)));
        System.out.println(mp);

    }
}
