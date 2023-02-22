import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparator {
    public static void main(String[] args) {
        student1 s1 = new student1(89, "suresh",150);
        student1 s2 = new student1(97,"mukesh",200);
        student1 s3 = new student1(121,"naresh",200);
        ArrayList<student1> a1 = new ArrayList<>();
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        Collections.sort(a1,new NewComparator());

        for(student1 s:a1){
            System.out.println(s.getMarks()+" "+s.getRoll_no()+" "+s.getName());
        }
    }
}

class NewComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        student1 s1 = (student1) o1;
        student1 s2 = (student1) o2;
        if(s1.marks > s2.marks) return 1;
        else if(s1.marks == s2.marks) {
            if(s1.roll_no > s2.roll_no) return 1;
            else
                return -1;
        }
        else
            return -1;
    }
}
