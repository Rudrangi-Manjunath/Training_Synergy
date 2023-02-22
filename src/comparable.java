import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparable {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.addAll(List.of(new Integer[]{3, 12, -1, 76, -151}));
        Collections.sort(a);
        System.out.println(a);

        student s1 = new student(89, "suresh");
        student s2 = new student(97,"mukesh");
        ArrayList<student> a1 = new ArrayList<>();
        a1.add(s1);
        a1.add(s2);
        Collections.sort(a1);
        for(student s:a1){
            System.out.println(s.getRoll_no()+" "+s.getName());
        }


    }
}
