package Practise;

import java.util.Objects;

public class student5 extends Name {
    Integer age;
    Integer marks;

    public student5(String firstname, String middlename, String lastname, Integer age, Integer marks) {
        super(firstname, middlename, lastname);
        this.age = age;
        this.marks = marks;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object obj) {
        student5 other = (student5) obj;
        return Objects.equals(this.getName(), other.getName()) && (this.age == other.age);
    }
}
