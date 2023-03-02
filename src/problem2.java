import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class student{
    String name;
    Integer age;
    Integer marks;

    public student(String name, Integer age, Integer marks) {
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




public class problem2 {
    public static void main(String[] args) {
        student s1 = new student("naresh",15,25);
        student s2 = new student("mukesh",20,50);
        student s3 = new student("suresh",17,85);


        Stream<student> stream1 = Stream.of(s1,s2,s3);

        student s4 = new student("naresh",15,100);
        student s5 = new student("mukesh",20,65);
        student s6 = new student("naveen",18,85);

        Stream<student> stream2 = Stream.of(s4,s5,s6);

        Map<String,Double> mp = Stream.concat(stream1,stream2).collect(Collectors.groupingBy(student::getName,Collectors.averagingDouble(student::getMarks)));
        System.out.println(mp);
    }
}
