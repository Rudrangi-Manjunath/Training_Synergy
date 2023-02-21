package Collections;

import java.util.LinkedList;

class Student {
    String name;
    Integer rollNo;

    Student(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Roll No: " + this.rollNo;
    }
}

public class Linkedlist_example {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        Student s1 = new Student("Java", 78);
        Student s2 = new Student("Python", 89);
        studentList.add(s1);
        studentList.add(s2);
        LinkedList<Student> anotherStudentList = new LinkedList<>();
        anotherStudentList.add(s1);
        Student s3 = new Student("C++", 12);
        anotherStudentList.add(s3);
        for (Student student : studentList) {
            if (!anotherStudentList.contains(student)) {
                anotherStudentList.add(student);
            }
        }
        for (Student student : anotherStudentList) {
            System.out.println(student.toString());
            System.out.println();
        }
    }
}
