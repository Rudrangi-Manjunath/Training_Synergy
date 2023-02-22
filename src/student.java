public class student implements Comparable{
    Integer roll_no;
    String name;

    public student(Integer roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

    public Integer getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        student s = (student) o;
         if(this.roll_no > s.roll_no) return 1;
         else if(this.roll_no == s.roll_no) return 0;
         else return -1;
    }
}
