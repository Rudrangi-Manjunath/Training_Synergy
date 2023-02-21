package Collections;

import java.util.*;

public class setOperations {
    public static void main(String[] args) {
       Set<String> s1 = new HashSet<String>();
       s1.addAll(List.of(new String[] {"asus", "acer", "hp"}));

        Set<String> s2 = new HashSet<String>();
        s2.addAll(List.of(new String[]{"dell", "asus", "acer"}));

        Set<String> s3 = new HashSet<String>(s2);
        s3.addAll(s1);

        System.out.println(s3);

        Set<String> s4 = new HashSet<String>(s2);
        s4.retainAll(s1);
        System.out.println(s4);



    }
}
