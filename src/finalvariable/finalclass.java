package finalvariable;

public class finalclass {
    // static int iv;
    final int iv; // final variables should be declared


    // final variables can be declared in 3 ways:
    // 1. at time of defining
    // 2. in instance block
    // 3. in constructor

    // final static variables can be declared in 2 ways:
    // 1. at time of defining
    // 2. in static block

    final static int x;
    {
       // iv=500;
        System.out.println("Inside instance block");
    }

    static {
        System.out.println("Inside static block");
        x=100;
    }
    public finalclass() {
        iv=50;
    }

    public static void main(String[] args) {
        final int a;
        a=10;
        System.out.println(a);
        // a=50; // reinitializing is not allowed for final variables
        finalclass f1 = new finalclass();
        finalclass f2 = new finalclass();
        finalclass f3 = new finalclass();
        finalclass f4 = new finalclass();
        System.out.println(f1.iv);

    }
}
