package Collections;

import java.util.ArrayList;

class student{
    String name;
    Integer roll_no;
    student(String name,Integer roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }

}


public class Arraylist_sample {
    public static void main(String[] args) {
        /*for(i :al){
            System.out.println(i);
        }*/
        /*ArrayList<Integer>a = new ArrayList<Integer>();
        System.out.println(a.size());
        a.add(56);
        a.add(89);
        a.add(0,23);
        a.add(1,100);
        for(int i:a){
            System.out.println(i);
        }
        System.out.println(a.indexOf(56));
        System.out.println(a.isEmpty());*/

        // Student object storing in arraylist

        /*student s1 = new student("java",78);
        student s2 = new student("python",56);
        ArrayList<student> a1 = new ArrayList<student>();
        a1.add(s1);
        a1.add(s2);
        for(student s:a1){
            System.out.println(s.name);
            System.out.println(s.roll_no);
            System.out.println();
        }*/

        ArrayList<Integer>a2 = new ArrayList<Integer>();
        a2.add(3);
        a2.add(3);
        a2.add(1);
        for (int i:a2){
            System.out.println(i);
        }
        System.out.println();
        a2.add(6);
        a2.add(0,4);
        a2.remove(1);
        for (int i:a2){
            System.out.println(i);
        }

    }
}
