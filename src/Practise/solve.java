package Practise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class solve {
    public static void main(String[] args) {
        student5 s1 = new student5("naveen","kumar","singh",12,100);
        student5 s2 = new student5("praneeth","kumar","naidu",15,80);
        student5 s3 = new student5("sai","kiran","reddy",12,67);
        student5 s4 = new student5("naveen","kumar","singh",12,50);

        List<student5> list1 = Arrays.asList(s1,s2);
        List<student5> list2 = Arrays.asList(s3,s4);

        HashMap<String,Double> map = new HashMap<>();
        for(student5 t:list1){
            map.put(t.getName(),(double) t.getMarks());
        }
        for(student5 t:list2){
            if(map.equals(t)){
                String name= t.getName();
                double value= map.get(name);
                value = (value+ t.getMarks())/2;
                map.replace(name,value);
            }
            else{
                map.put(t.getName(),(double)t.getMarks());
            }
        }
        System.out.println(map);
    }
}
