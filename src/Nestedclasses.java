
public class Nestedclasses {

    private int x;
    static int y=70;
    public class nest1{
        void method1(){
            System.out.println("Outside variable: "+ x); // accessing outer variable
        }
    }
    public static class nest2{
        void m2(){
            System.out.println("static nested class");
           // System.out.println(x);
            System.out.println(y);
        }
    }

  public static void main(String[] args) {
        Nestedclasses c1 = new Nestedclasses();
        Nestedclasses.nest1 n1 = c1.new nest1(); // accessing inner class
        n1.method1();
        Nestedclasses.nest2 n2 = new Nestedclasses.nest2();
        n2.m2();

    }
}

